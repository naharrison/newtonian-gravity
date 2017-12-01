#!/bin/csh -f

rm -rf ~/.m2

mvn install

if($? != 0) then
	echo "Crap! mvn install failed"
	exit 1
endif

#mvn com.github.spotbugs:spotbugs-maven-plugin:spotbugs # spotbugs goal produces a report target/spotbugsXml.xml
mvn com.github.spotbugs:spotbugs-maven-plugin:check # check goal produces a report and produces build failed if bugs
# the spotbugsXml.xml file is easiest read in a web browser
# see http://spotbugs.readthedocs.io/en/latest/maven.html and https://spotbugs.github.io/spotbugs-maven-plugin/index.html for more info

if($? != 0) then
	echo "Crap! mvn com.github.spotbugs:spotbugs-maven-plugin:check failed"
	exit 1
endif

