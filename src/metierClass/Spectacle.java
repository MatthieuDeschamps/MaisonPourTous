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
public class Spectacle {
    private String nomSpectacle,genreSpectacle;
    private int numSpectacle,dureeSpectacle;

    public Spectacle(String nomSpectacle, String genreSpectacle, int numSpectacle, int dureeSpectacle) {
        this.nomSpectacle = nomSpectacle;
        this.genreSpectacle = genreSpectacle;
        this.numSpectacle = numSpectacle;
        this.dureeSpectacle = dureeSpectacle;
    }

    public Spectacle() {
    }
    
    

    public String getNomSpectacle() {
        return nomSpectacle;
    }

    public void setNomSpectacle(String nomSpectacle) {
        this.nomSpectacle = nomSpectacle;
    }

    public String getGenreSpectacle() {
        return genreSpectacle;
    }

    public void setGenreSpectacle(String genreSpectacle) {
        this.genreSpectacle = genreSpectacle;
    }

    public int getNumSpectacle() {
        return numSpectacle;
    }

    public void setNumSpectacle(int numSpectacle) {
        this.numSpectacle = numSpectacle;
    }

    public int getDureeSpectacle() {
        return dureeSpectacle;
    }

    public void setDureeSpectacle(int dureeSpectacle) {
        this.dureeSpectacle = dureeSpectacle;
    }
    
    
    
}
