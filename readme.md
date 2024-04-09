# Mise en place d'une webapp avec springboot

Url du git de l'API connectée à cette webapp
https://github.com/Archange75019/APIspringboot

## Génération du squelette de webapp à partir de https://start.spring.io/

- Se rendre sur https://start.spring.io/
- Choisir l'outil de gestion et d'automatisation de production des projets logiciels (Maven ou graddle)
- Choisir le language (Java ou kotlin ou groovy)
- Choisir la version de Spring boot
- Définir le group
- Définir l'artifact
- Définir le name
- Définir la description du projet
- Définir le nom du package racine
- Définir le format du package (JAR ou WAR)
- Définir la version de Java
### Ajouter les dépendances 
- Ajouter Spring Web
- Ajouter Thymeleaf
- Ajouter lombok

Pour la fonction de c'est package fiez vous à la description et à la documentation de chaque dépendance.

## Configuration du squelette de l'application

- Définir le port de l'application ( Attention il dois être différent du port de l'API)
- Définir le type des logs dans le fichier application.properties
- Définir une propriété custom sous la forme concaténé des valeurs group.artifact.variable = XXXXX
- Créer les packages controller / repository / service / model
- 

