# Dockerfile focused on production use case
# Builder stage needs JDK and gradle
FROM eclipse-temurin:17 as builder
WORKDIR /root
COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew build

# Runner stage only needs JRE and JAR
FROM eclipse-temurin:17-jre
WORKDIR /root
COPY --from=builder /root/build/libs/*.jar ./app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","./app.jar"]