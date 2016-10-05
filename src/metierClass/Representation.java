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
public class Representation extends Spectacle{
    private int numRepresentation,tarif;
    private Date dateRepresentation;

    public Representation() {
    }

    public Representation(int numRepresentation, int tarif, Date dateRepresentation,
            String nomSpectacle, String genreSpectacle, int numSpectacle, int dureeSpectacle) {
        super(nomSpectacle, genreSpectacle, numSpectacle, dureeSpectacle);
        this.numRepresentation = numRepresentation;
        this.tarif = tarif;
        this.dateRepresentation = dateRepresentation;
    }

    public int getNumRepresentation() {
        return numRepresentation;
    }

    public void setNumRepresentation(int numRepresentation) {
        this.numRepresentation = numRepresentation;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public Date getDateRepresentation() {
        return dateRepresentation;
    }

    public void setDateRepresentation(Date dateRepresentation) {
        this.dateRepresentation = dateRepresentation;
    }



   
}
