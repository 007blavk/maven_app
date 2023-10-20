def gv

pipeline {
    agent any
    parameters {
    	string(name: "VERSION", defaultValue: "", description: "version to deploy to prod")
    	choice(name: "VERSION", choices: ["1.0.1", "1.0.2", "1.0.3"], description: "")
    	booleanParam(name: 'executeTests', defaultValue: true, description:"")
    }
    stages {
       stage('init') {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage('build') {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage('test') {
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
