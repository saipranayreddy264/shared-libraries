import com.saiacademy.builds.Calculator
def call(pipelineParams) {
   Calculator calc = new Calculator(this)
   pipeline {
    agent {
        label 'java-slave'
    }
    environment {
        // Define your environment variables here
        APPLICATION_NAME = "${pipelineParams.appName}"
    }   

    stages {
        stage('addition') {
            steps {
                script {
                    echo "The addition of two numbers is: ${calc.add(10,20)}"
                println calc.add(2,3)
                }
            }
            
        }
        stage('Build') {
            steps {
                echo "Building the ${env.APPLICATION_NAME}"
                // Add your build steps here
            }
        }
        stage('Test') {
            steps {
                echo  "Testing the ${env.APPLICATION_NAME}"
                // Add your test steps here
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying the ${env.APPLICATION_NAME}"
                // Add your deploy steps here
            }
        }
    }
   } 

}
