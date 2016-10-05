/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interBD;

import static ihmMPT.IHMReservation.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metierClass.*;




/**
 *
 * @author mdeschamps
 */
public class BDD{
    
    
    
    public static void lireBdd(String nomtable) 
    { 
    
    OraclCli oraclCli = new OraclCli("//localhost/XE", "matt", "300687");
    
        if (oraclCli.connect()) {
            
            switch (nomtable)
            {
                    case "ADHERENT":
                    try {
                        ResultSet rs = oraclCli.exec("SELECT * FROM "+nomtable);
                        if (rs != null) {
                            while (rs.next()) {
                                /*System.out.println("numAdherent: " + rs.getInt(1)+ 
                                        " nom = "+rs.getString(2)+
                                        " prenom = "+rs.getString(3)+
                                        " Adresse ="+rs.getString(4));*/
                                Adherent adh = new Adherent();
                                adh.setNumAdhérent(rs.getInt(1));
                                adh.setNomAdherent(rs.getString(2).trim().toUpperCase());
                                adh.setPrenomAdherent(rs.getString(3).trim());
                                adh.setAdresseAdherent(rs.getString(4));
                                adhe.add(adh);
                            }
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(OraclCli.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    /*for(int i = 0 ; i < adhe.size(); i++)
                    {
                        Adherent monadhe = adhe.get(i);
                        System.out.println("Numero = "+monadhe.getNumAdhérent()+" Nom = "+monadhe.getNomAdherent()+" prenom = "+monadhe.getPrenomAdherent());
                    }  */
                break;
                        
                        
                case "REPRESENTATION":
                try {

                     ResultSet rs = oraclCli.exec("SELECT * "
                             + "FROM SPECTACLE,REPRESENTATION "
                             + "WHERE SPECTACLE.NUMSPECTACLE = REPRESENTATION.NUMSPECTACLE");

                     if(rs != null){
                         
                        while (rs.next()){
                             

                            Representation repr = new Representation();
                            
                            repr.setNumRepresentation(rs.getInt(5));
                            repr.setTarif(rs.getInt(9));
                            repr.setDateRepresentation(rs.getDate(8));
                            repr.setNomSpectacle(rs.getString(2));
                            repr.setGenreSpectacle(rs.getString(3));
                            repr.setNumSpectacle(rs.getInt(1));
                            repr.setDureeSpectacle(rs.getInt(4));

                            repres.add(repr);
                            }
                        }
                     System.out.println("connect4");
                 }catch (SQLException ex) {
                     Logger.getLogger(OraclCli.class.getName()).log(Level.SEVERE, null, ex);
                 }  
                 /*for(int i = 0 ; i < repres.size(); i++)
                 {
                     Representation monrepre = repres.get(i);
                     System.out.println("Numero = "+monrepre.getNumRepresentation()+" Nom = "+monrepre.getNomSpectacle()+" prenom = "+monrepre.getDateRepresentation());
                 } */ 
                break;
                    
                    
                /*case "RESERVATION":
                try {

                     ResultSet rs = oraclCli.exec("SELECT * "
                             + "FROM RESERVATION");

                     if(rs != null){
                         
                        while (rs.next()){
                             

                            Reservation reserv = new Reservation();
                            
                            reserv.setNumReservation(rs.getInt(1));
                            reserv.set(rs.getInt(2));
                            reserv.setNumRepresentation(rs.getInt(3));
                            reserv.setNbrePersonne(rs.getInt(4));
                            reserv.setDateReservation(rs.getDate(5));
                            reser.add(reserv);
                            }
                        }
                     System.out.println("connect5");
                 }catch (SQLException ex) {
                     Logger.getLogger(OraclCli.class.getName()).log(Level.SEVERE, null, ex);
                 }  
                 for(int i = 0 ; i < reser.size(); i++)
                 {
                     Representation mareser = reser.get(i);
                     System.out.println("Numero resa = "+mareser.getNumRepresentation()+" Numadherent = "+mareser.getnu+" prenom = "+mareser.getDateRepresentation());
                 }  
                break;   */ 
                    
            }
        } else {
            System.out.println("Oracle connection failed !!!");
        }
        oraclCli.close();
    }     
    
   public static void ecrireBdd(String nomtable) throws SQLException
    {
        OraclCli oraclCli = new OraclCli("//localhost/XE", "matt", "300687");
    
        if (oraclCli.connect()) {
            switch (nomtable)
            {
                    case "RESERVATION":
                             try
                            {
                                String query = "INSERT INTO RESERVATION (NUMADHERENT,NUMREPRESENTATION,NBPERSONNES,DATERESA)"
                                + "VALUES(4,1,7,'01/10/16')"; 
                                //+ "VALUES ("+maResa.getNumReservation()+","+maResa.getNumAdherent()+","+maResa.getNumRepresentation()+","+maResa.getNbrePersonne()+","+maResa.getDateReservation()+"');"; 
                                
                                int nbMaj = oraclCli.update(query); 
                                
                                oraclCli.refresh();
                                BDD.lireBdd(nomtable);
                            }
                            catch (Exception d) 
                            { 
                            System.out.println ("Probleme de requete"); 
                            }
                    break;
            }
            oraclCli.close();
        }
    }
}

