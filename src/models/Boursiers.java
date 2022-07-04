package models;

public class Boursiers extends Etudiant {
    protected boolean montantBourse;
    protected TypeBourse typeBourse;

    public boolean isMontantBourse() {
        return montantBourse;
    }

    public void setMontantBourse(boolean montantBourse) {
        this.montantBourse = montantBourse;
    }

    public TypeBourse getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(TypeBourse typeBourse) {
        this.typeBourse = typeBourse;
    }
}
