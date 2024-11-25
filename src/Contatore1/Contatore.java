package Contatore1;

public class Contatore {
    private int n=0;
    
    
    public void Incrementa(){
        n=n+1;
    }
    public void Decrementa(){
        n=n-1;
    }
    public int GetN(){
        return n;
    }
}