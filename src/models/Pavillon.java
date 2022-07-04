package models;

public class Pavillon {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private int numPav;
    public int getNumPav() {
        return numPav;
    }

    public void setNumPav(int numPav) {
        this.numPav = numPav;
    }
    private int nombreEtages;
    public int getNombreEtages() {
        return nombreEtages;
    }

    public void setNombreEtages(int nombreEtages) {
        this.nombreEtages = nombreEtages;
    }

    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nombreEtages=" + nombreEtages + ",numPav=" +numPav + "]";
    }

}
