package Service;

import models.BoursiersLoges;
import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public interface IService {
    
    public void addPavillon(Pavillon pavillon);
    public void removePavillon(Pavillon pavillon);
    public void listPavillon();
    
    public void listChambresofPavillon(Pavillon pavillon);

    public void addChambre(Chambre chambre);
    public void removeChambre(Chambre chambre);
    public void listChambre();
 
    public void listEtudiantssofChambre(Chambre chambre);

    public void addEtudiant(Etudiant etudiant);

    public void affectChambreToBoursierLoge(BoursiersLoges boursierLoge,Chambre chambre);
   
    public void affectChambreToPavillon(Chambre chambre,Pavillon pavillon);

}
