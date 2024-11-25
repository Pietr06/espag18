package Studenti;

public class Studente {
    private String Cognome;
    private String Nome;
    private String CodiceFiscale;
    private String Matricola;
    
    public Studente(String Cognome,String Nome,String CodiceFiscale,String Matricola){
        this.Cognome=Cognome;
        this.Nome=Nome;
        this.CodiceFiscale=CodiceFiscale;
        this.Matricola=Matricola;
    }
    
    public String ToString(){
        String TempString = "Cognome: " + Cognome + "\nNome: " + Nome + "\nCodiceFiscale: " + CodiceFiscale + "\nNumero matricola: " + Matricola;
        return TempString;
    }
    
}