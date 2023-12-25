package classes;

public class Compte {
    private long num;
    private String nomClient;
    private double solde;


    public Compte() {

    }

    public Compte(long num, String nomClient, double solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }


    public double getSolde() {
        return solde;
    }

    public long getNum() {
        return num;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


    public void afficherCompteInfo() {
        System.out.println("Nom Client: " + this.nomClient + " || " + "Numero: " + this.num + " || " + "Solde: " + this.solde + " DHs");
    }

    public void retirer(double montant) {
        if (this.solde < montant) {
            throw new Error("You don't have enough Balance!");
        }
        this.solde -= montant;
    }

    public void deposer(double montant) {
        this.solde += montant;
    }
}
