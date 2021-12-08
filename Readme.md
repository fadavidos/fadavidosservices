# Readme

## Stack
* Java: 17
* SpringBoot: 2.5.7

## Problems
If you have problems in Intellij with lombok you can try to do [this](https://stackoverflow.com/questions/9424364/cant-compile-project-when-im-using-lombok-under-intellij-idea)

## Consume API

Create a new customer
```
curl --location --request POST 'localhost:8080/api/v1/customer' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName":"pepe",
    "lastName": "Ahmed",
    "email": "pepeahmed@gmail.com"
}'
```

## Banner
If you want to create your own banner, [click here](https://devops.datenkollektiv.de/banner.txt/index.html)