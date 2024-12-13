# README : Gestion des Notes des Étudiants

## Description
Ce projet propose une solution pour la gestion des notes académiques des étudiants, avec des fonctionnalités avancées telles que l’enregistrement des étudiants et des matières, l’attribution des notes, et l’analyse des performances académiques.

## Fonctionnalités
1. Enregistrement des étudiants avec leur matricule, nom, prénom, et âge.
2. Gestion des matières avec code, nom, et coefficient.
3. Attribution des notes à chaque étudiant pour toutes les matières.
4. Options d’analyse :
   - Affichage des étudiants par ordre de mérite.
   - Identification du premier et du dernier étudiant.
   - Calcul et affichage de la moyenne de la classe.
   - Liste des étudiants admis (moyenne >= 10).
   - Liste des étudiants avec une moyenne supérieure à la moyenne de la classe.

## Structure du Projet

### Packages
- **Examen** : Contient les classes `Matiere` et `Note` pour gérer les matières et les notes.
- **Inscription** : Inclut les classes `Etudiant` et `GestionEtudiant` pour gérer les étudiants et leurs opérations associées.

### Relations
- `GestionEtudiant` réfère les matières et gère les instances d’étudiants.
- `Note` associe chaque étudiant à ses matières avec une note attribuée.

## Prérequis
- **Java 17** ou une version ultérieure.
- Un IDE compatible Java (Eclipse, IntelliJ IDEA) ou un terminal avec le JDK configuré.

## Installation
1. Clonez le dépôt du projet :
   ```bash
   git clone <URL-du-depot>
   ```
2. Ouvrez le projet dans votre IDE ou accédez au répertoire contenant les fichiers depuis votre terminal.

## Utilisation
1. Compilez le programme :
   ```bash
   javac Main.java
   ```
2. Lancez l’application :
   ```bash
   java Main
   ```
3. Suivez les instructions du menu pour interagir avec le système.

## Exemple d’Exécution

### Menu Principal
```text
Menu :
1. Afficher la liste des étudiants admis par ordre de mérite
2. Afficher le premier et le dernier étudiant
3. Afficher la moyenne de la classe
4. Afficher la liste des étudiants admis
5. Afficher la liste des étudiants ayant une moyenne supérieure à la moyenne de la classe
6. Quitter
```

### Sorties Typiques
- Affichage des étudiants par ordre de mérite :
  ```text
  2023001 - Jean Dupont: Moyenne = 15.50
  2023002 - Marie Curie: Moyenne = 14.00
  ```

## Diagrammes UML
- [Diagramme de Classes](diagrams/diagramme_classes.png)
- [Diagramme des Composants](diagrams/diagramme_composants.png)

## Améliorations Futures
- Ajouter une interface graphique pour une meilleure expérience utilisateur.
- Intégrer une base de données pour stocker les données.
- Gérer les exceptions pour une meilleure robustesse du système.

## Auteur
- **Nom :** Cabrel DOMFANG
- **Date :** 11/12/2024
- **Contact :** cabrellesa@gmail.com

## Licence

Ce projet est distribué sous la licence MIT. Consultez le fichier [LICENSE](LICENSE) pour plus de détails.
