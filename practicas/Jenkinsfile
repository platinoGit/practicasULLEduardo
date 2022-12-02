node('principal'){
    stage('Preparación') {
        checkout scm
    }
    stage('Compilación'){
        sh "mvn clean package -DskipTests"
    }
    stage('Tests'){
        sh "mvn test"
    }
	stage('Empaquetado'){
        sh "mvn install -DskipTests"
    }
	stage('Despliegue'){
        sh "mvn deploy -DskipTests"
	}
}