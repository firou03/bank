créer une classe java 'compte' : titulaire, solde, setters, getters, toString, crediter() et debiter()
Tester la classe compte:
créer un bojet c1('Salah', 500)
afficher les infos de c1
retirer 200
afficher c1
ajouter l'exception SoldeInsuffisantException qui permet de d'afficher le message "Votre solde est inssufisant!!"
si le montant a retirer est > solde de compte
code java 'SoldeInsuffisantException":
public class SoldeInsuffisantException extends Exception {
public string to string() {
return "votre solde est insuffisant !!!";
}}

créer une classe 'CompteEpargne' qui herite de la classe compte et qui possede l'attribut 'benefice' sans oublier d'ajouter les methode setters, getters, constructeur et toString
tester la classe 'CompteEpargne':
creer un objet ep1(5%)
afficher ep1
dediter ep1 avec 150
afficher ep1