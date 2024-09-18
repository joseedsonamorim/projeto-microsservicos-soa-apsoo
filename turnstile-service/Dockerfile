# Use a imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Adicione o jar do aplicativo ao container
COPY target/turnstile-service.jar /app/turnstile-service.jar

# Defina o diretório de trabalho
WORKDIR /app

# Comando para executar o jar
ENTRYPOINT ["java", "-jar", "turnstile-service.jar"]

# Exponha a porta que o Turnstile Service vai rodar
EXPOSE 8083
