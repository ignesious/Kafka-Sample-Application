FROM hub.docker.prod.walmart.com/library/openjdk:8

ADD target/ap-fds-receiving-store-delta-sink-*.jar /target-ap-fds-receiving-store-delta-sink.jar

EXPOSE 8080
CMD ["java", "-jar", "/target-ap-fds-receiving-store-delta-sink.jar"]