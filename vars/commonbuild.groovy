def call() {
    stage('checkout') {
         git url:'https://github.com/asnashameel/shared_library_groovy/', branch: 'main'
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
