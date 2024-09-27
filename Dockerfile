FROM openjdk11

EXPOSE 8080

#WORKDIR /opt/app

ADD target/monitor-jenkins.jar monitor-jenkins.jar

ENTRYPOINT ["java", "-jar", "monitor-jenkins.jar"]
