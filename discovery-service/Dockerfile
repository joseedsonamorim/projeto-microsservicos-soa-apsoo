# Use a imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Adicione o jar do aplicativo ao container
COPY target/discovery-service.jar /app/discovery-service.jar

# Defina o diretório de trabalho
WORKDIR /app

# Comando para executar o jar
ENTRYPOINT ["java", "-jar", "discovery-service.jar"]

# Exponha a porta que o Eureka vai rodar
EXPOSE 8761
