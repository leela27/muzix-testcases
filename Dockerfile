FROM openjdk:11.0-jdk

ADD ./target/Muzix-0.0.1-SNAPSHOT.jar /muzix/add/Muzix-0.0.1-SNAPSHOT.jar
WORKDIR muzix/add

ENTRYPOINT ["java","-jar","Muzix-0.0.1-SNAPSHOT.jar"]