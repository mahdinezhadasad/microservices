From openjdk:11-jre-slim as builder
WORKDIR application
ADD maven/${project.build.finalName}.jar ${project.build.finalName}.jar
RUN java -Djarmode=layertools -jar ${prject.build.finalName}.jar extract

From openjdk:11-jre-slim
LABEL PROJECT_NAME=${project.artifactId} \
PROJECT=${project.id}