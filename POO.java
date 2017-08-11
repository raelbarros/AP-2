package poo;
public class POO {
    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo();
        
        
        ret1.set_x(3);
        ret1.set_y(6);
        
        System.out.println("Lado X: " + ret1.get_x());
        System.out.println("Lado Y: " + ret1.get_y());
        System.out.println("Area : " + ret1.getArea());
        System.out.println("Perimetro Y: " + ret1.getPerimetro());
        System.out.println("é quadrado: " + (ret1.isQuadrado() ? "Verdadeiro" : "Falso"));        
    }
    
}