package model;

public class Devise {
    private String nom;
    private String codeISO;
    private String symbole;


    public Devise(String nom,String codeISO,String symbole){
        this.nom = nom;
        this.codeISO = codeISO;
        this.symbole = symbole;
    }


    public String getNom() {
        return nom;
    }


    public String getCodeISO() {
        return codeISO;
    }


    public String getSymbole() {
        return symbole;
    }

    
    

    
}
