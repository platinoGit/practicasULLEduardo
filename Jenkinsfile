node('principal'){
    stage('Preparación') {
        checkout scm
    }
    stage('Compilación'){
        sh "cd practicas && mvn clean package"
    }
    stage('Empaquetado'){
        sh "cd practicas && mvn install"
    }
	stage('Despliegue'){
        sh "cd practicas && mvn deploy"
	}
}