node('principal'){
    stage('Preparación') {
        checkout scm
    }
    stage('Compilación'){
        sh "mvn clean package"
    }
    stage('Empaquetado'){
        sh "mvn install"
    }
	stage('Despliegue'){
        sh "mvn deploy"
	}
}