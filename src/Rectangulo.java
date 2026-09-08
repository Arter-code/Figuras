public class Rectangulo extends Figura{
    private double  base;
    private double  altura;

    public Rectangulo(double base, double altura, String tipo){
        this.base=base;
        this.altura=altura;
        super(tipo);

    }

    @Override
    public double area(){
        return this.base*altura;
    }

}
