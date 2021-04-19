pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }
    stages {
        stage("Compile") {
            steps {
                sh "./gradle compileJava"
            }
        }
        stage("Unit test") {
            steps {
                sh "./gradle clean test aggregate"
            }
        }
    }
}