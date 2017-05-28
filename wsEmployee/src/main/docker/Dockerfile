FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER jmansilla@gfi.es
ADD wsEmployee-1.jar app.jar
EXPOSE 8089
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]