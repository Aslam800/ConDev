import java.util.HashMap;

public class TauxChange {
    private HashMap<String, Double> dicoDevise = new HashMap<>();
    private Devise d;

    public TauxChange() {
        dicoDevise.put("EUR_USD", 1.10);
        dicoDevise.put("USD_EUR", 0.91);
    }


    public HashMap<String, Double> getTaux() {
        return dicoDevise;
    }

    // Recherche d'un taux unique entre deux devises
    public double getTauxUni(Devise d1, Devise d2) {
        String code1 = d1.getCodeISO();
        String code2 = d2.getCodeISO();
        String cle = code1 + "_" + code2;
        
        if (dicoDevise.containsKey(cle)) {
            return dicoDevise.get(cle);
        }

        // Si aucun taux n'est trouvé
        return 0;
    }

    public double getCalcul(Devise d1, Devise d2, double montant) {
        // On récupère le taux de conversion entre les deux devises
        double taux = getTauxUni(d1, d2);
    
        // Vérification : si aucun taux trouvé, Erreur
        if (taux == 0) {
            System.out.println("Taux non trouvé entre " + d1.getCodeISO() + " et " + d2.getCodeISO());
            return 0;
        }
    
        // Calcul du montant échangé
        double montantConverti = Math.round(montant * taux);
    
        return montantConverti;
    }
    


}
