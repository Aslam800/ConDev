public class Main {
    public static void main(String[] args) {
        // Création de devises
        Devise euro = new Devise("euro", "EUR", "€");
        Devise usd = new Devise("us dollar", "USD", "$");

        // Création de TauxChange
        TauxChange tc = new TauxChange();

        // Test du taux EUR -> USD
        double tauxEuroUsd = tc.getTauxUni(euro, usd);
        System.out.println("Taux EUR -> USD : " + tauxEuroUsd);


        System.out.println(tc.getCalcul(euro,usd,100));

    }
}
