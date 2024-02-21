FROM alpine:latest
RUN apk add --no-cache openjdk17
RUN apk add --no-cache tzdata
COPY build/libs/user-ms-1.0.6544586.jar /app/
WORKDIR /app/
ENTRYPOINT ["java"]
CMD ["-jar", "/app/user-ms-1.0.6544586.jar"]
