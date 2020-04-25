# User-CRUD
Реализовать редактор объектов сущности пользователя через HTTP-запросы с хранением информации о пользователях в реляционной СУБД PostgreSQL. Использовать Spring Boot.

## Сущность пользователя
- id
- email
- username
- password

## Описание HTTP-запросов
### POST-запрос на добавление пользователя
В качестве Request Body передается JSON в следующем формате:
```js
{
  "email": "string",
  "username": "string",
  "password": "string"
}
```
В ответ приложение отдает HTTP Status 200 и Response Body в виде JSON:
```js
{
  "id": 0,
  "email": "string",
  "username": "string",
  "password": "string"
}
```
### GET-запрос на получение информации о пользователе
С помощью **Query-параметра** передается id пользователя. В ответ приложение отдает HTTP Status 200 и Response Body в виде JSON:
```js
{
  "id": 0,
  "email": "string",
  "username": "string",
  "password": "string"
}
```
### PUT-запрос на редактирование пользователя
С помощью **Path variable** передается id пользователя. В качестве Request Body передается JSON в следующем формате:
```js
{
  "email": "string",
  "username": "string",
  "password": "string"
}
```
В ответ приложение отдает HTTP Status 200 и Response Body в виде JSON:
```js
{
  "id": 0,
  "email": "string",
  "username": "string",
  "password": "string"
}
```
### DELETE-запрос на редактирование пользователя
С помощью Path variable передается id пользователя. В ответ приложение отдает HTTP Status 200 без body.
