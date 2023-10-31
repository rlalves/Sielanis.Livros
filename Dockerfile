FROM openjdk

WORKDIR /app

COPY target/livros-0.0.1-SNAPSHOT.jar /app/livros.jar

# Copie o driver MySQL para o contêiner
#COPY C:/Users/Raazak/.m2/repository/mysql/mysql-connector-java/8.0.23/mysql-connector-java-8.0.23.jar /app/mysql-connector-java-8.0.23.jar

# Defina o classpath para incluir o driver MySQL
#ENV CLASSPATH=/app/mysql-connector-java-8.0.23.jar

ENTRYPOINT ["java", "-jar", "livros.jar"]