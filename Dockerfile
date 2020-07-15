FROM java:8-alpine
ADD ./target/timor-0.1.1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]