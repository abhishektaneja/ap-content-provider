FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD app.jar app.jar
ENV JAVA_OPTS=""
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]