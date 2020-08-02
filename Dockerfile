FROM openjdk:14 as build

COPY . /src/
RUN cd /src && ./gradlew build bootJar

FROM openjdk:14

COPY --from=build /src/build/libs/starter.jar /starter/
EXPOSE 8080
CMD /starter/starter.jar