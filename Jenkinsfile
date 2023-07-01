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
                test()
            }
        }

        stage('Deploy') {
            steps {
                // Execute deployment steps here
                deploy()
            }
        }
    }
}
