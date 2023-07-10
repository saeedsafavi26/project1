library identifier: 'MyTestSharedLib@master', retriever: modernSCM(
    [$class: 'GitSCMSource',
    remote: 'https://github.com/saeedsafavi26/project1.git',
    credentialsId: 'NoneExpirableTokenGithub'
    ]
)

// if it is a global shared library, you should call it like this:
//@Library('MyTestSharedLib')_

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Execute build steps here
                //sh 'echo "Building the project!!!!!"'
                buildStage 'PRG1'
                pritnln "$GIT_URL"
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
