# ---- IMPLEMENTAÇÃO H2 ---
converso de sintax banco de dados:
https://www.sqlines.com/online

<!-- SPRING DATA JPA -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		
<!-- H2 Database -->
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
		</dependency>

<!--Adicionado apenas para acessar o console do H2 -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		
- Na pasta src/main/resorces crira o aqruivo: application-test.properties 
com as configurações:

# data source
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:my-book-project
spring.datasource.username=sa
spring.datasource.password=

# jpa
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

# Nova propriedade a partir da versao 2.5 do Spring Boot:
spring.jpa.defer-datasource-initialization=true

# h2-console
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console