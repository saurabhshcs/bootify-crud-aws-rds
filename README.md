# bootify-crud-aws-rds

Created a aws-rds database: Please following links for the reference link to learn or see how to create an instance of amazon RDS. 
Medium - https://saurabhshcs.medium.com/create-aws-rds-mysql-database-b26119d73aa
Linkedin - https://www.linkedin.com/posts/saurabhshcs_create-aws-rds-mysql-database-activity-6730670206093443072-F1_A

This project is just for an sample demonstration and to see how to connect with Amazon RDS Endpoint and intract while performing crid operations.



It is containing the database CRUD operaiton with AWS RDS Mysql databse. You need to configure MYSQL on AWS using AWS RDS and grab the connection string to configure in application.yaml


```
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://{AWS_RDS_ENDPOINT}:3306/bootify
spring.datasource.username = {user}
spring.datasource.password = {password}
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
server.port=9003
```

## Run all the test 

`
./gradlew test
`

## Run application
`
./gradlew bootRun
`


Follow me on - [Medium](https://saurabhshcs.medium.com) | [Linkedin](https://www.linkedin.com/in/saurabhshcs/) | [YouTube](https://www.youtube.com/channel/UCSQqjPw7_tfx1Ie4yYHbcxQ?pbjreload=102) | [StackOverFlow](https://stackoverflow.com/users/10719720/saurabhshcs?tab=profile)

