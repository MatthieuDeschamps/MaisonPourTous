/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metierClass;

/**
 *
 * @author mdeschamps
 */
public class Adherent {
    private int numAdhérent;
    private String nomAdherent,prenomAdherent,adresseAdherent;

    
    
    
    public Adherent() {
    }
    
      
    public Adherent(int numAdhérent, String nomAdherent, String prenomAdherent, String adresseAdherent) {
        this.numAdhérent = numAdhérent;
        this.nomAdherent = nomAdherent;
        this.prenomAdherent = prenomAdherent;
        this.adresseAdherent = adresseAdherent;
    }

  
    

    public int getNumAdhérent() {
        return numAdhérent;
    }

    public void setNumAdhérent(int numAdhérent) {
        this.numAdhérent = numAdhérent;
    }

    
    public String getNomAdherent() {
        return nomAdherent;
    }

    public void setNomAdherent(String nomAdherent) {
        this.nomAdherent = nomAdherent;
    }

    public String getPrenomAdherent() {
        return prenomAdherent;
    }

    public void setPrenomAdherent(String prenomAdherent) {
        this.prenomAdherent = prenomAdherent;
    }

    public String getAdresseAdherent() {
        return adresseAdherent;
    }

    public void setAdresseAdherent(String adresseAdherent) {
        this.adresseAdherent = adresseAdherent;
    }
    
    
    
    
    
}
