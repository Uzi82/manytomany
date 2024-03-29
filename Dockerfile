FROM openjdk:17

# Копируем собранный JAR файл в контейнер
COPY target/manyToManyExample-0.0.1-SNAPSHOT.jar app.jar

# Запускаем приложение при старте контейнера
ENTRYPOINT ["java", "-jar", "app.jar"]