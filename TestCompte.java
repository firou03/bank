// TestCompte.java
public class TestCompte {
    public static void main(String[] args) {
        try {
            Compte c1 = new Compte("Salah", 500);
            System.out.println("Compte: " + c1);
            
           
            c1.debiter(200);
            System.out.println("montant: " + c1);
            
            c1.debiter(600); 
        } catch (SoldeInsuffisantException e) {
            System.out.println("Error: " + e);
        }

        CompteEpargne ep1 = new CompteEpargne("Amin", 1000, 0.05);
        System.out.println("compte Epargne: " + ep1);
        
        try {
            ep1.debiter(150);
            System.out.println("montant: " + ep1);
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur: " + e);
        }
    }
}
