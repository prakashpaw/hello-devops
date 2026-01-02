
# hello-devops

A brand-new Java multi-module project:
- `hello-devops-app`: Console app
- `hello-devops-web`: Simple servlet webapp (WAR)

## Build
```
mvn -B clean install
```

## Run the console app
```
java -jar hello-devops-app/target/hello-devops-app-1.0.0-SNAPSHOT.jar
```

## Run the web app
Deploy `hello-devops-web/target/hello-devops-web-1.0.0-SNAPSHOT.war` to Tomcat/Jetty.

Example:
- `http://localhost:8080/hello-devops-web/hello`
- `http://localhost:8080/hello-devops-web/hello?name=Prakash`

## Java Version
Targets Java 17 by default. Change `maven.compiler.release` in parent `pom.xml` to match your JDK (e.g., 21).

## Tests
```
mvn -B test
```
