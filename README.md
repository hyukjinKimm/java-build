# java-build
자바 빌드 방법
```text
── spring-maven-example
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── app
│   │   │   │               ├── AppConfig.java
│   │   │   │               ├── HelloService.java
│   │   │   │               └── Main.java
│   │   │   └── resources
│   │   └── test
│   │       └── java
│   └── target
│       ├── classes
│       │   └── com
│       │       └── example
│       │           └── app
│       │               ├── AppConfig.class
│       │               ├── HelloService.class
│       │               └── Main.class
│       ├── dependency
│       │   ├── spring-aop-5.3.33.jar
│       │   ├── spring-beans-5.3.33.jar
│       │   ├── spring-context-5.3.33.jar
│       │   ├── spring-core-5.3.33.jar
│       │   ├── spring-expression-5.3.33.jar
│       │   └── spring-jcl-5.3.33.jar
│       ├── generated-sources
│       │   └── annotations
│       ├── maven-archiver
│       │   └── pom.properties
│       ├── maven-status
│       │   └── maven-compiler-plugin
│       │       └── compile
│       │           └── default-compile
│       │               ├── createdFiles.lst
│       │               └── inputFiles.lst
│       └── spring-maven-example-1.0.0.jar

```

thin jar   
cd /root/spring-maven-example  
mvn clean package -> target 폴더 생성  
mvn dependency:copy-dependencies -> pom.xml에서 정의된 의존성(jar)들을전부 (로컬 종속성 저장경로)에서 target/dependency 에 복사   
java -cp "target/classes:target/dependency/*" com.example.app.Main -> 실행   

fat jar는 maven-shade-plugin 플러그인 pom.xml 에 추가  
mvn clean package -> target 폴더 생성 ( jar에 종속성 모두 포함됨)  

maven 로컬 종속성 저장 경로
~/.m2/repository






