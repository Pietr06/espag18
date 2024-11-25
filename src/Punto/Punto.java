package Punto;

public class Punto {
    private double x;
    private double y;
    
    public Punto(int x,int y){
        this.x=x;
        this.y=y;
    }
    public double Distanza(){
        double distanza = Math.sqrt(x*x + y*y);
        return distanza;
    }
    
}