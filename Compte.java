// compte.java
public class Compte {
    private String titulaire;
    private double solde;

    public Compte(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void crediter(double montant) {
        solde += montant;
    }

    public void debiter(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException();
        }
        solde -= montant;
    }

    @Override
    public String toString() {
        return "Titulaire: " + titulaire + ", Solde: " + solde;
    }
}
