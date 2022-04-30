FROM java:8
EXPOSE 418

VOLUME /tmp
ADD shaohao-fast-dev-master.jar  /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]
