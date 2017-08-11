package poo;
public class Retangulo {
    
    //atributos
    private int x;
    private int y;
    
    public int get_x(){
        return this.x;
    } 
    
    public int get_y(){
        return this.y;
    } 
    
    public void set_x(int x){
        this.x = x;
    }
    
    public void set_y(int y){
        this.y = y;
    }
        
    public int getArea(){
        return x * y;
    }
    
    public int getPerimetro(){
        return (x+y)*2;
    }
    
    public boolean isQuadrado(){
        return x == y;
    }
    
    
    
}
