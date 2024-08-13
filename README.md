
## Spring Framework
Servlets - Java technology that you use to handle incoming requests on a server. Its a java object that has special methods for handling incoming HTTP methods. doGet, doPost, doDelete, doPut

 


## Spring Framework concepts:

1.IOC Containers

2.Dependency Injection

3.Bean/Beans

4.BeanFactory

5.ApplicationContext/(Aware)

6.Constructor/Setter Injection

7.Object Injection

8.Inner Beans, Aliases, idref

9.Initializing collections

10.Auto-wiring

11.Bean Scopes: Singleton, Prototype

12.Main goal is to decouple relationship between

## dependent objects

-Dependency injection means separate the class which is dependent and inject them from outside when needed



## Questions

1. It is necessary to define setter while injecting properties using ApplicationContext???


2. spring.xml needs to be in the src folder while using ApplicationContext

3.  Injection can be done either through constructor or setter

4. In case we need objects that are not likely to be used more than once or very frequently, then we use inner beans to define them. In such cases, there is no need to specify an id as the object will never be referenced from the outside world. This does not give any performance related improvement.

5. Beans is analogous to group of class blueprints

- BeanFactory and ApplicationContext are IOC containers. BeanFactory is the most basic version of IOC containers and ApplicationContext extends it.

- BeanFactory - OnDemandLoading, hence lightweight

- ApplicationContext - Lazy Loading (Loads all the beans at the startup)

To conclude, beanPostProcessor is some common code to execute for all type of beans after initialization, while init-methods are only for individual beans. What confuses me is the name, even though it's called postProcessBeforeInitialization, actually the bean object passed into this method is already initialized and properties set. "BeforeInitialization" here only means before other init logic like init-methods.

## The order is as below FYI

1. postProcessBeforeInitialization (Note that here, the bean object itself is already initialized and properties set)

2. InitializingBean

3. init method

postProcessAfterInitialization
For Spring Framework, spring-core contains mainly core utilities and common stuff (like enums) and because it's really critical for Spring, probably all other Spring modules depend on it (directly or transitively). In turn spring-context provides Application Context, that is Spring's Dependency Injection Container and it is probably always defined in POMs of artifacts that use Spring Framework somehow. In fact, spring-context depends on spring-core so by defining spring-context as your dependency, you have spring-core in your classpath as well.





## Installation

- First 5 Steps in Maven

```bash
1. Open Eclipse
2. Go to Help -> Eclipse Marketplace
3. Search by Maven
4. Click "Install" button at "Maven Integration for 5. 5. Eclipse" section
Follow the instruction step by step
After successful installation do the followings in Eclipse:

6. Go to Window --> Preferences
7. Observe, Maven is enlisted at left panel
Finally,

8. Click on an existing project
9. Select Configure -> Convert to Maven Project

```
## Important Maven Commands
-  mvn --version

-  mvn compile (compiles source files)

-  mvn test-compile (compiles test files) - one thing to observe is this also compiles source files
-  mvn clean - deletes target directory
-  mvn test - run unit tests
-  mvn package - creates the jar
## help:effective-settings
-  help:effective-pom
-  dependency:tree
- dependency:sources
- debug

## Complete Code Example
# /pom.xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.in28minutes.learning.maven</groupId>
    <artifactId>maven-in-few-steps</artifactId>
    <version>0.0.1-SNAPSHOT</version>

    <packaging>jar</packaging>

    <name>maven-in-few-steps</name>
    <description>Demo project for Spring Boot</description>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.0.4</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>17</java.version>
        <junit-jupiter.version>5.9.2</junit-jupiter.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <scope>test</scope>
        </dependency>

        <!-- Junit 5 -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>${junit-jupiter.version}</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-junit-jupiter</artifactId>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
    <!--

    Remote Maven Repository
    ->
    Local Maven Repository

     - Local Repository => Local System

     - Remote Maven repository => Central Repositories
       - stores all the versions of all dependencies. JUnit 4.2,4.3,4.4

     - mvn install vs mvn deploy
       - copies the created jar to local maven repository - a temp folder on my machine where maven stores the files.
    -->
    <repositories>
        <repository>
            <id>spring-milestones</id>
            <name>Spring Milestones</name>
            <url>https://repo.spring.io/milestone</url>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
    </repositories>

    <pluginRepositories>
        <pluginRepository>
            <id>spring-milestones</id>
            <name>Spring Milestones</name>
            <url>https://repo.spring.io/milestone</url>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </pluginRepository>
    </pluginRepositories>


</project>

    
