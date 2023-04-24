FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
COPY target/*.jar app.jar
COPY src/main/resources/*.json /tmp/
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
