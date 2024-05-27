# SOAP-CRUD (Simple Object Access Protocol)

This is a simple CRUD (Create, Read, Update, and Delete) java app ☕ with SOAP protocol 🌐

### Frameworks and libraries. 

- Java ☕ with Spring framework 🍃
- H2 Database 🗃️
- wsdl4j (Web Services Description Language for Java)
- SoapUI tool for testing web services ⚙️

### Prerequisites.

* JAVA 17
* Spring framework 3.2.5

### Maven.

> Dependencies in pom.xml

- H2 database :

```xml
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
```
- wsdl4j :

```xml
		<dependency>
			<groupId>wsdl4j</groupId>
			<artifactId>wsdl4j</artifactId>
		</dependency>
```

> Plugins in pom.xml

- xjc :

```xml
					<execution>
						<id>xjc</id>
						<goals>
							<goal>xjc</goal>
						</goals>
					</execution>
```

> Configuration in pom.xml

```xml
				<configuration>
					<sources>
						<source>${project.basedir}/src/main/resources/person.xsd</source>
					</sources>
				</configuration>
```

### Demonstration.

- After build application with using maven, run app by click 🟢 :
  
![image](https://github.com/BadrOuaddah/SOAP-CRUD/assets/119801735/9d9cce33-da40-44a0-aee6-1bb94868c713)

- Open SoapUI to test api :
  
![image](https://github.com/BadrOuaddah/SOAP-CRUD/assets/119801735/109d2453-2114-457f-a95f-8cd273fc9f23)

- Create new SAOP project and paste the URL path of WSDL file :

![image](https://github.com/BadrOuaddah/SOAP-CRUD/assets/119801735/44c194b1-562c-4f11-9c52-8c45b15dd0c0)

and the path of WSDL file is : 

```cmd
http://localhost:8080/ws/person.wsdl
```

- imported methods from WSDL file : 

![image](https://github.com/BadrOuaddah/SOAP-CRUD/assets/119801735/fd7d6d49-f680-4b6b-bf94-ffacdb0e6db7)

#### Here some methods 

+ POST method :

![image](https://github.com/BadrOuaddah/SOAP-CRUD/assets/119801735/5f001ff8-71aa-4a5a-acb5-809a92847345)

+ GET method : 

![image](https://github.com/BadrOuaddah/SOAP-CRUD/assets/119801735/47f19e4a-28d6-45f6-b4fb-c1828f0550f5)
