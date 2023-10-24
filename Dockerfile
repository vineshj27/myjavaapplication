FROM eclipse-temurin:17
COPY target/myjavaapplication.jar myjavaapplication.jar
CMD [ "java", "-jar", "myjavaapplication.jar" ]

 
