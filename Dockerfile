FROM adoptopenjdk:11-jre-hotspot
COPY *.jar /test.jar


ARG SERVER_PORT
ARG ACTIVE
ARG UNIQUE_ID
ARG DEBUG_PORT
ARG MOUDLE

ARG MYSQL_ADDR
ARG MYSQL_USERNAME
ARG MYSQL_PASSWORD

ARG REDIS_ADDR
ARG REDIS_PORT
ARG REDIS_PWD

ARG NACOS_SERVER_ADDR
ARG NACOS_SERVER_USER
ARG NACOS_SERVER_PASSWORD

ARG MQ_ADDR
ARG MQ_PORT
ARG MQ_USERNAME
ARG MQ_PWD

ENV SERVER_PORT=${SERVER_PORT}
ENV DEBUG_PORT=${DEBUG_PORT}
ENV ACTIVE=${ACTIVE}
ENV MOUDLE=${MOUDLE}

EXPOSE ${SERVER_PORT}
EXPOSE ${DEBUG_PORT}

ENTRYPOINT ["java","-jar","/$MOUDLE.jar"]

#ENTRYPOINT ["/bin/sh", "-c", "if [ ! -z \"$DEBUG_PORT\" ]; then java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:$DEBUG_PORT -jar /$MOUDLE.jar; else java -jar /$MOUDLE.jar; fi"]
#<Auto> -e:test -m:test -v:1.0.1 -rp:8088 -dp:8089 -de:<-e ACTIVE=test -e SERVER_PORT=8088>