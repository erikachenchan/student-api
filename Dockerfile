FROM gradle:jdk17-alpine
VOLUME gradle-cache:/home/gradle/.gradle
VOLUME /tmp
USER root
ADD . /home/gradle/project
WORKDIR /home/gradle/project
RUN chown gradle:gradle -R /home/gradle
USER gradle
RUN gradle bootJar
#Start from a java:17
RUN mv /home/gradle/project/build/libs/springboot-images-new.jar /home/gradle/project/springboot-images-new.jar
EXPOSE 8080
ENTRYPOINT["java", "-jar", "/springboot-images-new.jar"]

