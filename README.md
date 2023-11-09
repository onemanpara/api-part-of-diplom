# Проект по API тестированию для [reqres.in](https://reqres.in/)

## :page_with_curl:	Содержание

> :heavy_check_mark: [Технологии и инструменты](#technologist-технологии-и-инструменты)
>
> :heavy_check_mark: [Реализованы проверки](#bookmark_tabs-реализованы-проверки)
> 
> :heavy_check_mark: [Запуск тестов из терминала](#computer-Запуск-тестов-из-терминала)
> 
> :heavy_check_mark: [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
>
> :heavy_check_mark: [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-allure-report)

## :technologist: Технологии и инструменты

<p  align="center">

<code><img width="5%" title="IntelliJ IDEA" src="images/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="images/logo/Java.svg"></code>
<code><img width="5%" title="Gradle" src="images/logo/Gradle.svg"></code>
<code><img width="5%" title="Junit5" src="images/logo/Junit5.svg"></code>
<code><img width="5%" title="GitHub" src="images/logo/GitHub.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/Allure.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/Jenkins.svg"></code>
<code><img width="5%" title="RestAssured" src="images/logo/RestAssured.svg"></code>
</p>

## :bookmark_tabs: Реализованы проверки

>- [x] *Позитивная регистрация пользователя*
>- [x] *Регистрация пользователя без доступа*
>- [x] *Негативный тест на регистрацию (без пароля)*
>- [x] *Создание нового пользователя*
>- [x] *Запрос данных о списке пользователей*
>- [x] *Запрос данных о конкретном пользователе*

## :computer: Запуск тестов из терминала

Для запуска тестов используйте команду:

```bash
gradle clean test
```

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/Students/job/15-onemanpara-hw27-apiPart/)

*Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать сейчас*</strong></code>.*

<p align="center">
  <img src="images/screens/Jenkins.jpg" alt="Jenkins" width="800">
</p>


## <img width="4%" title="Allure Report" src="images/logo/Allure.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/Students/job/15-onemanpara-hw27-apiPart/allure)

### Главное окно

<p align="center">
  <img src="images/screens/Allure_report.jpg" alt="Allure_report" width="800">
</p>

### Окно с тест-кейсами

<p align="center">
  <img src="images/screens/Allure_report2.jpg" alt="Allure_report2" width="800">
</p>

