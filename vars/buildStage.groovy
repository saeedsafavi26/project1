#!/usr/bin/env groovy

 def call(string imageName) {
 	sh 'echo "Building the project ${imageName} with shared library!!!!!"'
 }
