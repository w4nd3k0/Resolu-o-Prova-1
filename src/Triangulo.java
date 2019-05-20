/*Crie uma classe java chamada Triângulo que contenha o método calcular
área que deverá calcular a área do triângulo.

a) Crie os atributos que achar necessário.
b) A área de um triãngulo é dada pela fórmula:

a = (b * h)/2.
 */
public class Triangulo {
    
    private double A;
    private double B;
    private double H;
      
    public double getB(){
        return B;
    }
    
    public double getA(){
        return A;
    }
    
    public double getH(){
        return H;
    }
    
    public void setA(double a){
        this.A = a;
    }
        
    public void setB(double b){
        this.B = b;
    }
    
    public void setH(double h){
        this.H = h;
    }
    
    public double CalcularArea(double a){
        a = (B * H)/2;
        return a;
    }
    
}
