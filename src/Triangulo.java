public class Triangulo extends Figura {
    private int base;
    private int altura;

    public Triangulo(int altura, int base, String tipo){
        this.altura=altura;
        this.base=base;
        super(tipo);
    }

    @Override 
    public double area(){
        return(double) base*altura/2;
    }

}
