This is old version it requires two dependencies but the latest one required juat one dependencies so choose another one.
# Swagger

https://www.youtube.com/watch?v=txArM31my9M

https://www.youtube.com/watch?v=oJSFdqE7Tpo

In browser
http://localhost:2121/swagger-ui.html#/

To see H2 database in browser
http://localhost:2121/h2-console/


application.properties file for h2 database
server.port=2121

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=sa
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

spring.jpa.hibernate.ddl-auto=create

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
