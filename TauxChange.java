package model;
import java.util.HashMap;


public class TauxChange {
    HashMap<String,Double> taux = new HashMap<String,Double>();
    Devise d = new Devise(null, null, null);



    public TauxChange() {
        taux.put("EUR_USD", 1.10);
        taux.put("USD_EUR", 0.91);
        
        taux.put("EUR_JPY", 130.00);
        taux.put("JPY_EUR", 0.0077);
        
        taux.put("EUR_GBP", 0.85);
        taux.put("GBP_EUR", 1.17);
        
        taux.put("EUR_CHF", 1.05);
        taux.put("CHF_EUR", 0.95);
        
        taux.put("USD_JPY", 118.00);
        taux.put("JPY_USD", 0.0085);
        
        taux.put("USD_GBP", 0.74);
        taux.put("GBP_USD", 1.35);
        
        taux.put("USD_CHF", 0.92);
        taux.put("CHF_USD", 1.09);
        
        taux.put("GBP_CHF", 1.27);
        taux.put("CHF_GBP", 0.79);
        
        taux.put("JPY_CHF", 0.0081);
        taux.put("CHF_JPY", 123.50);


    }

    public HashMap<String, Double> getTaux() {
        return taux;
    }

    public double getTauxUni(Devise d1, Devise d2) {
        
        String code1 = d1.getCodeISO();
        String code2 = d2.getCodeISO();

        taux = getTaux();

        String cle = code1 + "_" + code2;

        if(taux.containsKey(cle)){
            return taux.get(cle);
        }
        return 1.99;
    }
   






}


