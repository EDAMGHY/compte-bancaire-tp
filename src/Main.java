import classes.Compte;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Compte c1 = new Compte(11111, "Ahmed", 20000);
        Compte c2 = new Compte(22222, "Hajar", 30000);
        c1.retirer(19000);
        c2.retirer(45000);
        c1.deposer(15000);
        c1.afficherCompteInfo();
        c2.afficherCompteInfo();
    }
}
