# Docker file if we just want to create a Docker Images using the already creatd jar file
FROM openjdk:8-jre-alpine
WORKDIR /opt
RUN echo "Set the work dir"
ENV PORT 8080
EXPOSE 8080
RUN apk add --upgrade bzip2-dev libtasn1 sqlite-libs musl-utils libjpeg-turbo \
 e2fsprogs openjdk8-jre openjdk8-jre-base openjdk8-jre-lib openssl
ARG APPJAR=build/libs/companieshouse-0.0.1-SNAPSHOT.jar
COPY ${APPJAR} companieshouse-0.0.1-SNAPSHOT.jar
ENTRYPOINT exec java $JAVA_OPTS -jar companieshouse-0.0.1-SNAPSHOT.jar
