# Docker Spring Boot

## Step

##### 1. Create project at [start.spring.io](start.spring.io) 
![Image01](images/Image01.png)

##### 2. Create Controller Hello
![Image02](images/Image02.png)

##### 3. Set finalName in build and Setting port
- set finalName at `pom.xml` <br>
![Image03](images/Image03.png)

- set port at `resources/application.properties` <br>
![Image08](images/Image08.png)

##### 4. Create file Dockerfile
![Image04](images/Image04.png)

##### 5. Install web (pack jar file)
```$ mvn clean install```

##### 6. Check version docker and path project
```
# check version
$ docker -v

# check path
$ pwd
```

##### 7. Build docker
```$ docker build -f Dockerfile -t docker-spring-boot .```

![Image05](images/Image05.png)


##### 8. Run docker
```$ docker run -p 8085:8085 docker-spring-boot```

![Image06](images/Image06.png)

##### 9. result
open browser goto `http://localhost:8085`

![Image07](images/Image07.png)



