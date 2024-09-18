# Use a imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Adicione o jar do aplicativo ao container
COPY target/api-gateway.jar /app/api-gateway.jar

# Defina o diretório de trabalho
WORKDIR /app

# Comando para executar o jar
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]

# Exponha a porta que o API Gateway vai rodar
EXPOSE 8080
