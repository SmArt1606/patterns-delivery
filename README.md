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