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
public class Reservation extends Salle{
    private int numReservation,nbrePersonne;
    private Date dateReservation;
    private String numAdherent;

    public Reservation(int numReservation, int nbrePersonne, Date dateReservation, 
        int numSalle, int nbPlaces, String nomSalle, int numRepresentation, 
        int tarif, Date dateRepresentation, String nomSpectacle, String genreSpectacle, 
        int numSpectacle, int dureeSpectacle,String numAdherent) 
    {
        super(numSalle, nbPlaces, nomSalle, numRepresentation, tarif, dateRepresentation, nomSpectacle, genreSpectacle, numSpectacle, dureeSpectacle);
        this.numReservation = numReservation;
        this.nbrePersonne = nbrePersonne;
        this.dateReservation = dateReservation;
        this.numAdherent = numAdherent;
                
    }

    public Reservation() {
    }

   
    
    
    
    
    
    public String getNumAdherent() {
        return numAdherent;
    }

    public void setNumAdherent(String numAdherent) {
        this.numAdherent = numAdherent;
    }
           
        
    public int getNumReservation() {
        return numReservation;
    }

    public void setNumReservation(int numReservation) {
        this.numReservation = numReservation;
    }

    public int getNbrePersonne() {
        return nbrePersonne;
    }

    public void setNbrePersonne(int nbrePersonne) {
        this.nbrePersonne = nbrePersonne;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }
}
