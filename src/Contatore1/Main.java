package Contatore1;

public class Main {
    
    public static void main(String[] args) {
        Contatore contatore1 = new Contatore();
        
        System.out.print(contatore1.GetN()+"\n");
        contatore1.Incrementa();
        contatore1.Incrementa();
        System.out.print(contatore1.GetN()+"\n");
        contatore1.Decrementa();
        System.out.print(contatore1.GetN()+"\n");
    }
    
}