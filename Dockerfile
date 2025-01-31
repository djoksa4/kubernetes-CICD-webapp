# Use an official Tomcat image to run the application
FROM tomcat:9.0.62-jdk11-openjdk

# Copy the built WAR file into the Tomcat webapps directory as ROOT.war
COPY target/kubernetes-CICD-webapp.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080
EXPOSE 8080

# Start Tomcat server
CMD ["catalina.sh", "run"]