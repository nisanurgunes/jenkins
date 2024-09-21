# Build aşaması: Maven kullanarak projeyi derle
FROM maven:3.8.5-openjdk-17-slim AS build

# Jenkins çalışma dizinine geç
WORKDIR /jenkins

# Proje dosyalarını konteynere kopyala
COPY . .

# Maven ile projeyi temizle ve paketle
RUN mvn clean package

# Çalıştırma aşaması: OpenJDK 17 üzerinde Jenkins'i çalıştır
FROM openjdk:17-jdk-slim

# Uygulama çalışma dizini oluştur
WORKDIR /app

# Jenkins için ayrı bir çalışma dizinine geç
WORKDIR /jenkins

# Build aşamasından çıkan jar dosyasını çalışma dizinine kopyala
COPY --from=build /jenkins/target/*.jar ./jenkins.jar

# Jenkins'i çalıştır
ENTRYPOINT ["java", "-jar", "./jenkins.jar"]
