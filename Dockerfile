FROM java
MAINTAINER wanlinus wanlinus@qq.com
WORKDIR /docker
COPY target/HelloWorld-0.0.1-SNAPSHOT.jar hello.jar
ENTRYPOINT ["java", "-jar","./hello.jar"]
EXPOSE 8080