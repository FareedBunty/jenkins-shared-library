#!/usr/bin/env groovy
def call() {
    echo "Building the App"
    sh "mvn pakacge"
}