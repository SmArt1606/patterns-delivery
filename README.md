# Patterns. Задача №1

[![Java CI with Gradle](https://github.com/SmArt1606/patterns-delivery/actions/workflows/gradle.yml/badge.svg)](https://github.com/SmArt1606/patterns-delivery/actions/workflows/gradle.yml)

Домашнее задание к занятию «2.3. Patterns».

## Задача

Автоматизация сценария заказа доставки карты с последующим изменением даты встречи.

В тестах используются:

- Selenide
- JUnit 5
- JavaFaker
- Lombok
- Gradle

Тестовые данные генерируются через отдельный utility-класс `DataGenerator`.

## Запуск приложения

```bash
java -jar artifacts/app-replan-delivery.jar

## Allure Report

В проект интегрирован Allure для формирования отчётов о выполнении автотестов.

Allure интегрирован с Selenide, благодаря чему в отчёте отображаются действия с элементами страницы, а при падении теста прикладываются Screenshot и Page Source.

### Общий отчёт

<img width="2048" height="1164" alt="1" src="https://github.com/user-attachments/assets/e41930af-6e93-42c1-b934-3ba70f5eaca4" />

### Детализация выполнения теста

<img width="2048" height="1166" alt="2" src="https://github.com/user-attachments/assets/be342c87-13ea-4508-80ff-3eb5fe2e8ac7" />

### Вложения при падении теста

Для проверки интеграции локально было смоделировано падение теста.  
Allure автоматически приложил Screenshot и Page Source.

<img width="2048" height="1163" alt="3" src="https://github.com/user-attachments/assets/08489620-480c-40ca-94f9-61e19579d6e2" />
