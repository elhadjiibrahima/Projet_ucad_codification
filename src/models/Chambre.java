package models;

public class Chambre {
    @Override
    public String toString() {
        return "Chambre [id=" + id + ", numeroChambre=" + numeroChambre + ", numeroEtage=" + numeroEtage + ", type="
                + type + "]";
    }

    private int id;
    
    private int numeroChambre;
    private TypeChambre type;
    private int numeroEtage;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }
    public TypeChambre getType() {
        return type;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }

    public int getNumeroEtage() {
        return numeroEtage;
    }

    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }
    


    
}
