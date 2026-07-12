![spring-initializr](./images/spring-initializr.png)


```
.\gradlew.bat wrapper
.\gradlew.bat bootrun
```

build container
```
.\gradlew.bat bootBuildImage --imageName=gcr.io/pwujczyklearning/cloudsql-app
```