def call() {
    stage('checkout') {
	 checkout scm
	}
    stage('build') {
	 echo "maven building.."
         sh 'mvn clean install'
	}
    stage('Test') {
	 echo "running test"
         sh 'mvn test'
	}
}	

