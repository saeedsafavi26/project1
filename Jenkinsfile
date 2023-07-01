@Library('MyTestSharedLib')_

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Execute build steps here
                //sh 'echo "Building the project!!!!!"'
                buildStage()
            }
        }

        stage('Test') {
            steps {
                // Execute test steps here
                sh 'echo "test the project!!!!!!"'
            }
        }

        stage('Deploy') {
            steps {
                // Execute deployment steps here
                sh 'echo "deploying"'
            }
        }
    }
}
