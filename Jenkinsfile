pipeline {
  agent any
  stages {
    stage('Checkout SCM') {
      steps {
        git(url: 'https://github.com/ivanwidyan/example-automation-for-pipeline.git', branch: 'develop')
      }
    }
    stage('Smoke Test') {
      steps {
        bat 'mvn clean -Drunner.class=SmokeRunner'
      }
    }
    stage('API Test') {
      steps {
        bat 'mvn clean -Drunner.class=ApiRunner'
      }
    }
    stage('UI Test') {
      parallel {
        stage('Chrome') {
          steps {
            bat 'mvn clean verify -Drunner.class=ChromeRunner'
          }
        }
        stage('Firefox') {
          steps {
            bat 'mvn clean verify -Drunner.class=FirefoxRunner'
          }
        }
      }
    }
  }
}