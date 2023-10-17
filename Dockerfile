FROM openjdk:17.0.2-jdk
VOLUME /tmp
COPY target/*.jar stockapp.jar
ENTRYPOINT ["java","-jar","/stockapp.jar"]
