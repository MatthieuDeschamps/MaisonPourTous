/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metierClass;

import java.sql.Date;

/**
 *
 * @author mdeschamps
 */
public class Salle extends Representation{
    private int numSalle,nbPlaces;
    private String nomSalle;

    public Salle(int numSalle, int nbPlaces, String nomSalle, int numRepresentation, int tarif, Date dateRepresentation, String nomSpectacle, String genreSpectacle, int numSpectacle, int dureeSpectacle) {
        super(numRepresentation, tarif, dateRepresentation, nomSpectacle, genreSpectacle, numSpectacle, dureeSpectacle);
        this.numSalle = numSalle;
        this.nbPlaces = nbPlaces;
        this.nomSalle = nomSalle;
    }

    public Salle(int numSalle, int nbPlaces, String nomSalle) {
        this.numSalle = numSalle;
        this.nbPlaces = nbPlaces;
        this.nomSalle = nomSalle;
    }

    public Salle() {
    }
    
    

    public int getNumSalle() {
        return numSalle;
    }

    public void setNumSalle(int numSalle) {
        this.numSalle = numSalle;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }
    
    
}
