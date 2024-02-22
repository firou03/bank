public class Bank {
    private Compte compte;
    private CompteEpargne compteEpargne;

    // Constructeur
    public Bank(Compte compte, CompteEpargne compteEpargne) {
        this.compte = compte;
        this.compteEpargne = compteEpargne;
    }

    // Getters et setters
    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public CompteEpargne getCompteEpargne() {
        return compteEpargne;
    }

    public void setCompteEpargne(CompteEpargne compteEpargne) {
        this.compteEpargne = compteEpargne;
    }

    // Méthode pour afficher les informations sur les comptes
    public void afficherInfosComptes() {
        System.out.println("Informations sur le compte :");
        System.out.println(compte);
        System.out.println("Informations sur le compte épargne :");
        System.out.println(compteEpargne);
    }

    // Méthode pour tester les opérations sur les comptes
    public void testerOperations() {
        try {
            System.out.println("Solde avant retrait sur le compte : " + compte.getSolde());
            compte.debiter(200);
            System.out.println("Solde après retrait sur le compte : " + compte.getSolde());
        } catch (SoldeInsuffisantException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Solde avant retrait sur le compte épargne : " + compteEpargne.getSolde());
            compteEpargne.debiter(150);
            System.out.println("Solde après retrait sur le compte épargne : " + compteEpargne.getSolde());
        } catch (SoldeInsuffisantException e) {
            System.out.println(e);
        }
    }
}
