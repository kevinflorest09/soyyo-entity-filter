FROM adoptopenjdk/openjdk8:latest
RUN mkdir -p /opt/app
WORKDIR /opt/app
COPY target/entity-filter-api-0.0.1-SNAPSHOT.jar /opt/app/target/
EXPOSE 8080
CMD ["sh", "-c", "java -jar /opt/app/target/entity-filter-api-0.0.1-SNAPSHOT.jar"]