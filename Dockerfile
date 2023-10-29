FROM openjdk

WORKDIR /app

COPY target/livros-0.0.1-SNAPSHOT.jar /app/livros.jar

ENTRYPOINT ["java", "-jar", "livros.jar"]