FROM tomcat:8.5

LABEL maintainer="mw.ali1@tcs.com"

ADD tomcat-users.xml /usr/local/tomcat/conf

ADD target/cicd-pipeline-0.0.1-SNAPSHOT.war  /usr/local/tomcat/webapps/
