Use IntelliJ IDEA or visual studio code are recommend ,

check environment
        
     Java JDK 1.8 or higher installed
     • Maven 3.2.5 or higher installed
     • Ideally configured for command line use
     • Gradle 3.4.1 or higher installed
     
     Verify Java is installed: java -version
     • Verify JDK is installed: javac -verison
     • Verify Maven is installed: mvn -v
     • Verify Gradle is installed: gradle -v
    
run code: 
    
    mvnw spring-boot:run

result 
    
    http://localhost:8080/h2-console
    
    Driver Class: org.h2.Driver
    JDBC URL = jdbc:h2:mem:testdb