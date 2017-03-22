
#Docker Config

FROM tomcat:8.0.20-jre8

MAINTAINER ashok.gudise@github

ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH

RUN mkdir -p "$CATALINA_HOME"

WORKDIR $CATALINA_HOME

RUN chgrp -R 0 $CATALINA_HOME
RUN chmod -R g+rw $CATALINA_HOME
RUN find $CATALINA_HOME -type d -exec chmod g+x {} +

#RUN mkdir $CATALINA_HOME/app_conf
#ADD config $CATALINA_HOME/app_conf/

COPY build/libs/distributed-app-1.0.war $CATALINA_HOME/webapps/

#RUN sed -i -e 's/^shared.loader=$/shared.loader="${catalina.base}\/app_conf"/' $CATALINA_HOME/conf/catalina.properties

EXPOSE 8080

CMD ["catalina.sh", "run"]


