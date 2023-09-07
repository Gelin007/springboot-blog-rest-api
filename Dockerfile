FROM eclipse-temurin:17

LABEL mentainer="gelin.nguedong@outlook.com"

WORKDIR /app

COPY target/springboot-blog-rest-api-0.0.1-SNAPSHOT.jar /app/springboot-blog-rest-api.jar

ENTRYPOINT ["java", "-jar", "springboot-blog-rest-api.jar"]