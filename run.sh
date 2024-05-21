#!/bin/bash
docker image build -t spring-security-oauth2-client .
docker run -it --rm --name spring-security-oauth2-client -p 80:80 -p 5005:5005 -e "JAVA_OPTS=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005" spring-security-oauth2-client