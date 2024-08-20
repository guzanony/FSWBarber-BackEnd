# Imagem base do JDK 17
FROM openjdk:17-jdk-alpine

# Diretório de trabalho dentro do container
WORKDIR /app

# Arquivo JAR gerado pelo Maven/Gradle para o container
COPY target/FSW-Barber-0.0.1-SNAPSHOT.jar /app/app.jar

# Expõe a porta que a aplicação usa
EXPOSE 8080

# Define o comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
