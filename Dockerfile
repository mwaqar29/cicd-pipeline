FROM tomcat:8.0

LABEL maintainer="mw.ali1@tcs.com"

WORKDIR /root/cicd-pipeline

ADD target/cicd-pipeline-0.0.1-SNAPSHOT.war  /usr/local/tomcat/webapps/




