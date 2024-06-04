AppContact
Description
AppContact est une application web pour la gestion des contacts, développée en utilisant Jakarta EE et déployée sous forme de fichier WAR.
Fonctionnalités
•	Gestion des contacts (ajout, modification, suppression)
•	Visualisation des contacts
•	Recherche de contacts
Prérequis
•	JDK 11
•	Apache Maven 3.6.0 ou supérieur
•	Serveur d'application compatible Jakarta EE 10
Installation
Cloner le dépôt
bash
Copier le code
git clone https://github.com/moncompte/AppContact.git
cd AppContact
Construire le projet
Utilisez Maven pour compiler et empaqueter le projet :
bash
Copier le code
mvn clean install
Déployer l'application
Déployez le fichier WAR généré (target/AppContact-1.0-SNAPSHOT.war) sur votre serveur d'application Jakarta EE.
Utilisation
1.	Démarrez votre serveur d'application et accédez à l'application via votre navigateur web à l'adresse appropriée (par exemple, http://localhost:8080/AppContact).
2.	Utilisez l'interface web pour gérer vos contacts.
Structure du projet
Voici un aperçu des principaux fichiers et répertoires du projet :
•	src/main/java: Code source Java
•	src/main/resources: Ressources du projet
•	src/main/webapp: Fichiers de la webapp (JSP, HTML, CSS, JS)
•	target/AppContact-1.0-SNAPSHOT.war: Fichier WAR généré
•	pom.xml: Fichier de configuration Maven
•	nb-configuration.xml: Configuration partagée pour NetBeans
Configuration NetBeans
Le projet contient un fichier de configuration NetBeans (nb-configuration.xml) pour faciliter le développement dans cet IDE. Les propriétés suivantes sont définies :
•	Version Jakarta EE : 10
•	Serveur de déploiement : Tomcat
•	Type de configuration JAX-WS : IDE

