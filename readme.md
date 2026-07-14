![spring-initializr](./images/spring-initializr.png)


```
.\gradlew.bat wrapper
.\gradlew.bat bootrun
```

build container
```
.\gradlew.bat bootBuildImage --imageName=gcr.io/pwujczyklearning/cloudsql-app
```


```
gcloud artifacts repositories create learning-cloudsql     --repository-format=docker --location=europe-central2 --description="Docker repository for CloudSQL learning app"
```