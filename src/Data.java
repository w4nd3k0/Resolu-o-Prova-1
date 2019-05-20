/*Crie uma classe camada data */

public class Data {
    public int Dia;
    public int Mes;
    public int Ano;
    
    public int getDia(){
        return this.Dia;
    }
    public int getMes(){
        return this.Mes;
    }
    
    public int getAno(){
        return this.Ano;
    }
    
    public void setDia(int d){
        this.Dia = d;
    }
    
    public void setMes(int m){
        this.Mes = m;
    }
    
    public void setAno(int a){
        this.Ano = a;
    }
    
    public void Mostrar(){
        System.out.println(getDia()+ "/" + getMes() + "/" + getAno());
    }
    
    
}
