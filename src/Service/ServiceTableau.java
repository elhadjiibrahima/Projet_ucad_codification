package Service;

import models.BoursiersLoges;
import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public class ServiceTableau implements IService {
    private final int TAILLE=10;
    private Pavillon[] pavillons= new Pavillon[TAILLE];
    private int indexPavillon;
    private Chambre[] chambres= new Chambre[TAILLE];
    private int indexChambre;

    @Override
    public void addPavillon(Pavillon pavillon) {
        if(indexPavillon<TAILLE){
            pavillons[indexPavillon]=pavillon;
            indexPavillon++;
        }else{
            System.out.println("Le tableau est plein");
        }
    }

    @Override
    public void removePavillon(Pavillon pavillon) {
        
    }

    @Override
    public void listPavillon() {
       for (Pavillon p : pavillons) {
           if(p!=null){
            System.out.println(p);
           }
       }
        
    }

    @Override
    public void listChambresofPavillon(Pavillon pavillon) {
        
    }

    @Override
    public void addChambre(Chambre chambre) {
        if (indexChambre<TAILLE) {
            chambres[indexChambre]=chambre;
            indexChambre++;
        }else{
            System.out.println("Le tableau est plein");
        }
        
    }

    @Override
    public void removeChambre(Chambre chambre) {
        
    }

    @Override
    public void listChambre() {
        for (Chambre c : chambres) {
            if (c!=null) {
            System.out.println(c);
            }
        }
        
    }

    @Override
    public void listEtudiantssofChambre(Chambre chambre) {
        
    }

    @Override
    public void addEtudiant(Etudiant etudiant) {
        
    }

    @Override
    public void affectChambreToBoursierLoge(BoursiersLoges boursierLoge, Chambre chambre) {
        
    }

    @Override
    public void affectChambreToPavillon(Chambre chambre, Pavillon pavillon) {
        
    }
    
}
