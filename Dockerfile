FROM eclipse-temurin:17
COPY target/command.jar order.jar
CMD ["java", "-jar", "order.jar"]
