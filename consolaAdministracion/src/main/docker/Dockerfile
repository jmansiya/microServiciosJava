FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER Jose Mansilla jmansiya@gmail.com
ADD consola-administracion-1.0.0.jar app.jar
EXPOSE 8088
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]