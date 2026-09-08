public class Circulo extends Figura{
    private int radio;
    
    public Circulo(int radio, String tipo){
        this.radio=radio;
        super(tipo);
    }

    @Override
    public double area(){
        return radio*radio/Math.PI;
    }

}
