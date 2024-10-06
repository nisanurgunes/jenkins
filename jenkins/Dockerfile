# Temel Jenkins imajını kullan
FROM jenkins/jenkins:lts

# Kullanıcı değişimi (root'tan jenkins'e)
USER root

# Docker'ı kurmak için gerekli bağımlılıkları yükle
RUN apt-get update && \
    apt-get install -y docker.io && \
    apt-get clean

# Jenkins kullanıcısına Docker daemon'a erişim izni ver
RUN usermod -aG docker jenkins

# Jenkins kullanıcıya geri dön
USER jenkins

# Jenkins için gerekli portları aç
EXPOSE 8080
EXPOSE 50000
