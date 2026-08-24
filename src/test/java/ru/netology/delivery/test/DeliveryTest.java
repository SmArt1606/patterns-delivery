package ru.netology.delivery.test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.delivery.data.DataGenerator;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

class DeliveryTest {

    @BeforeEach
    void setup() {
        open("http://localhost:9999");
    }

    @Test
    @DisplayName("Should successfully plan and replan meeting")
    void shouldSuccessfulPlanAndReplanMeeting() {

        var validUser = DataGenerator.Registration.generateUser("ru");

        var firstMeetingDate = DataGenerator.generateDate(4);
        var secondMeetingDate = DataGenerator.generateDate(7);

        // Первый заказ
        $("[data-test-id='city'] input").setValue(validUser.getCity());

        $$(".menu-item")
                .findBy(Condition.text(validUser.getCity()))
                .click();

        $("[data-test-id='date'] input")
                .clear();
        $("[data-test-id='date'] input")
                .setValue(firstMeetingDate);

        $("[data-test-id='name'] input")
                .setValue(validUser.getName());

        $("[data-test-id='phone'] input")
                .setValue(validUser.getPhone());

        $("[data-test-id='agreement']")
                .click();

        $$("button")
                .findBy(Condition.exactText("Запланировать"))
                .click();

        $("[data-test-id='success-notification']")
                .shouldBe(Condition.visible, Duration.ofSeconds(15));

        // Повторная отправка с другой датой
        $("[data-test-id='date'] input")
                .clear();
        $("[data-test-id='date'] input")
                .setValue(secondMeetingDate);

        $$("button")
                .findBy(Condition.exactText("Запланировать"))
                .click();

        $("[data-test-id='replan-notification']")
                .shouldBe(Condition.visible, Duration.ofSeconds(15));

        $$("button")
                .findBy(Condition.exactText("Перепланировать"))
                .click();

        $("[data-test-id='success-notification']")
                .shouldBe(Condition.visible, Duration.ofSeconds(15));

        $("[data-test-id='success-notification']")
                .shouldBe(Condition.visible, Duration.ofSeconds(15))
                .shouldHave(Condition.text("Встреча успешно запланирована"));
    }
}