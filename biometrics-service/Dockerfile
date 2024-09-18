# Use a imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Adicione o jar do aplicativo ao container
COPY target/biometrics-service.jar /app/biometrics-service.jar

# Defina o diretório de trabalho
WORKDIR /app

# Comando para executar o jar
ENTRYPOINT ["java", "-jar", "biometrics-service.jar"]

# Exponha a porta que o Biometrics Service vai rodar
EXPOSE 8082
