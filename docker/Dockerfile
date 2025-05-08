FROM eclipse-temurin:21-alpine
EXPOSE 8080
RUN mkdir /opt/app
COPY *.jar /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]