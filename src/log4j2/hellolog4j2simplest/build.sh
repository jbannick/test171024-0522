#!/usr/bin/env bash
mkdir -p out

javac -d out \
    -cp ./src:$LOG4J2_HOME/log4j-core-2.11.0.jar:$LOG4J2_HOME/log4j-api-2.11.0.jar \
    src/HelloLog4J2Simplest.java
