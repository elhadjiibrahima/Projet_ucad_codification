import Service.IService;
import Service.ServiceTableau;
import models.Chambre;
import models.Pavillon;
import models.TypeChambre;

public class App {
    public static void main(String[] args) throws Exception {
        IService service = new ServiceTableau();
        Chambre chambre = new Chambre();
        Chambre chambre2 = new Chambre();
        Chambre chambre3 = new Chambre();
        Chambre chambre4 = new Chambre();
        Chambre chambre5 = new Chambre();
        Pavillon pavillon = new Pavillon();
        Pavillon pavillon2 = new Pavillon();
        Pavillon pavillon3 = new Pavillon();
        Pavillon pavillon4 = new Pavillon();
        Pavillon pavillon5 = new Pavillon();

        pavillon.setId(1);
        pavillon.setNombreEtages(3);
        pavillon.setNumPav(1);
        service.addPavillon(pavillon);
        
        pavillon2.setId(2);
        pavillon2.setNombreEtages(4);
        pavillon2.setNumPav(2);
        service.addPavillon(pavillon2);
        
        pavillon3.setId(3);
        pavillon3.setNombreEtages(5);
        pavillon3.setNumPav(3);
        service.addPavillon(pavillon3);
        
        pavillon4.setId(4);
        pavillon4.setNombreEtages(4);
        pavillon4.setNumPav(4);
        service.addPavillon(pavillon4);
        
        pavillon5.setId(5);
        pavillon5.setNombreEtages(3);
        pavillon5.setNumPav(5);
        service.addPavillon(pavillon5);
        
        chambre.setId(1);
        chambre.setNumeroChambre(1);
        chambre.setNumeroEtage(0);
        chambre.setType(TypeChambre.INDIVIDUELLE);
        service.addChambre(chambre);

        chambre2.setId(2);
        chambre2.setNumeroChambre(80);
        chambre2.setNumeroEtage(2);
        chambre2.setType(TypeChambre.DOUBLE);
        service.addChambre(chambre2);

        chambre3.setId(3);
        chambre3.setNumeroChambre(20);
        chambre3.setNumeroEtage(1);
        chambre3.setType(TypeChambre.INDIVIDUELLE);
        service.addChambre(chambre3);

        chambre4.setId(4);
        chambre4.setNumeroChambre(10);
        chambre4.setNumeroEtage(0);
        chambre4.setType(TypeChambre.INDIVIDUELLE);
        service.addChambre(chambre4);

        chambre5.setId(5);
        chambre5.setNumeroChambre(120);
        chambre5.setNumeroEtage(5);
        chambre5.setType(TypeChambre.DOUBLE);
        service.addChambre(chambre5);
        
        System.out.println("Liste des pavillons");
        service.listPavillon();
        System.out.println("Liste des chambres");
        service.listChambre(); 
    }
}
