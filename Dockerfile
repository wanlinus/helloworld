FROM openjdk:8-jre
MAINTAINER wanlinus wanlinus@qq.com
WORKDIR /docker
COPY target/HelloWorld-0.0.1-SNAPSHOT.jar hello.jar
COPY cc.png cc.png
ENTRYPOINT ["java", "-jar","./hello.jar"]
EXPOSE 8080
