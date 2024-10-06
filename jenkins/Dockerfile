# Jenkins LTS imajını temel al
FROM jenkins/jenkins:lts

# Docker'ı kurmak için gerekli bağımlılıkları yükle
USER root
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

# Jenkins'i başlat
CMD ["java", "-jar", "/usr/share/jenkins/jenkins.war"]
