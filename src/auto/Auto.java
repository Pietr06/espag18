package auto;

public class Auto {
    private String Marca;
    private String Modello;
    private String Targa;
    private String AnnoImmatr;
    
    public Auto(String Marca,String Modello,String Targa,String AnnoImmatr){
        this.Marca=Marca;
        this.Modello=Modello;
        this.Targa=Targa;
        this.AnnoImmatr=AnnoImmatr;
    }
    
    public String ToString(){
        String TempString = "Marca: " + Marca + "\nModello: " + Modello + "\nTarga: " + Targa + "\nAnno immatricolazione: " + AnnoImmatr;
        return TempString;
    }
}