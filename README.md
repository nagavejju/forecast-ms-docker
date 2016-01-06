# forecast-ms-docker

Execute this below command to create the docker image. Name of the docker image defined in pom.xml

mvn package docker:build

pom.xml - updated to copy dockerfile in target folder so that jar and dockerfile are in same place. 

index.html created inside main/resource folder under public directory. As this is a Spring boot project, public is by default exposed/mapped. Page can be accees by :
http://host:port/pages/index.html

and rest service
http://host:port/forecast/<city>
