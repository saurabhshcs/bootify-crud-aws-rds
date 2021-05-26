# bootify-crud-aws-rds

Created a aws-rds database: Please following links for the reference link to learn or see how to create an instance of amazon RDS. 


This project is just for an sample demonstration and to see how to connect with Amazon RDS Endpoint and intract while performing crid operations.



It is containing the database CRUD operaiton with AWS RDS Mysql databse. You need to configure MYSQL on AWS using AWS RDS and grab the connection string to configure in application.yaml


```application.yaml
server:
    port: 9003

spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://{AWS_RDS_ENDPOINT_URL}m:3306/bootify
    username: bootify
    password: Bootify123
  jpa:
    show-sql: true
    properties:
      dialect: org.hibernate.dialect.MySQL5Dialect
    hibernate:
      ddl-auto: create

```

## Run all the test 

`
./gradlew test
`

## Run application
`
./gradlew bootRun
`

### Payload of three (3) Request of Add Product
```ssh
curl -d '{"name":"Microsoft", "qty":1100, "price": 212.99}' -H "Content-Type: application/json" -X POST http://localhost:9003/addProduct

curl -d '{"name":"Apple", "qty":500, "price": 2912.99}' -H "Content-Type: application/json" -X POST http://localhost:9003/addProduct

curl -d '{"name":"HP", "qty":50, "price": 912.99}' -H "Content-Type: application/json" -X POST http://localhost:9003/addProduct
```

### Get All products

```ssh
curl -X GET -H "Content-type: application/json" -H "Accept: application/json"  "http://localhost:9003/products"
```


```json
[
    {
        "id": 1,
        "name": "Microsoft",
        "qty": 1100,
        "price": 212.99,
        "creationTS": null
    },
    {
        "id": 2,
        "name": "Apple",
        "qty": 500,
        "price": 2912.99,
        "creationTS": null
    },
    {
        "id": 3,
        "name": "HP",
        "qty": 50,
        "price": 912.99,
        "creationTS": null
    }
]
```


### Read

- Medium - https://saurabhshcs.medium.com/create-aws-rds-mysql-database-b26119d73aa
- Linkedin - https://www.linkedin.com/posts/saurabhshcs_create-aws-rds-mysql-database-activity-6730670206093443072-F1_A


Follow me on - [Medium](https://saurabhshcs.medium.com) | [Linkedin](https://www.linkedin.com/in/saurabhshcs/) | [YouTube](https://www.youtube.com/channel/UCSQqjPw7_tfx1Ie4yYHbcxQ?pbjreload=102) | [StackOverFlow](https://stackoverflow.com/users/10719720/saurabhshcs?tab=profile)

