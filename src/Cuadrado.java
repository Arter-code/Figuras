public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado,String tipo){
        super(tipo);
        this.lado=lado;
    }

    public double area(){
        return lado*lado;
    }

}
