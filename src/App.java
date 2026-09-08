public class App {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo(10, 5, "Triangulo");
        Circulo circulo = new Circulo(5, "Circulo");
        Rectangulo rectangulo = new Rectangulo(2.5, 5.4, "Rectangulo");
        Cuadrado cuadrado = new Cuadrado(4, "Cuadrado");

        System.out.println("Area "+triangulo.getTipo() +": "+ triangulo.area());
        System.out.println("Area "+circulo.getTipo()+": " + circulo.area());
        System.out.println("Area "+rectangulo.getTipo()+": " + rectangulo.area());
        System.out.println("Area "+cuadrado.getTipo() +": "+ cuadrado.area());
    }
}
