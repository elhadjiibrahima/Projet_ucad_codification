package Models;

import java.sql.Date;

public class Etudiant {


    private String Matricule;

    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String matricule) {
        Matricule = matricule;
    }

    private String Numero;

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    private String Adresse=null;

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    private String Email; 

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    private Date DateDeNaissance ;

    public Date getDateDeNaissance() {
        return DateDeNaissance;
    }

    /**
     * @param dateDeNaissance
     */
    public void setDateDeNaissance(Date dateDeNaissance) {
        DateDeNaissance = dateDeNaissance;
    }

    
    
}
