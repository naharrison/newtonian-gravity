#!/bin/csh -f

rm -rf ~/.m2
mvn install
#mvn com.github.spotbugs:spotbugs-maven-plugin:spotbugs # spotbugs goal produces a report target/spotbugsXml.xml
mvn com.github.spotbugs:spotbugs-maven-plugin:check # check goal produces a report and produces build failed if bugs
# the spotbugsXml.xml file is easiest read in a web browser
# see http://spotbugs.readthedocs.io/en/latest/maven.html for more info

