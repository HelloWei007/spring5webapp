Use IntelliJ IDEA or visual studio code are recommend ,

check environment
        
     Java JDK 1.8 or higher installed
     • Maven 3.2.5 or higher installed
     • Ideally configured for command line use
     • Gradle 3.4.1 or higher installed
     * widlfly (JBOSS) 14
     
     Verify Java is installed: java -version
     • Verify JDK is installed: javac -verison
     • Verify Maven is installed: mvn -v
     • Verify Gradle is installed: gradle -v
    
JBOSS CONFIG AND RUN:

    http://wildfly.org/downloads/ 
    set enviroment: JBOSS and patch %JOBOSS_HOME%/bin
    excute /bin/add-user, /bin/domain.bat , /bin/stansalone.bat
    localhost:8080    
    
    
run code: 
    
    mvn clean package
    move .war file  to standalone/deployment of wildfly dir
    run /bin/standalone.bat

result 
   
    http://localhost:8080/index.html
    
  
NOTE
    
    The .war file compilate without client file (html,css,js), those files are loaded 
    by MvnConfig.java class with static path, you must change this path for your 
    client absolute path