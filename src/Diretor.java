/*Crie uma clase chamada Diretor*/

public class Diretor {
    
    private String Nome;
    private Data DataNascimento;
    
    public String getNome(){
        return this.Nome;
    }
    
    public Data getDataNascimento(){
        return this.DataNascimento;
    }
    
    public void setNome(String n){
        this.Nome = n;
    }
    
    public void setDataNascimento(Data d){
        this.DataNascimento = d;
    }
    
    public void Mostrar(){
        
        System.out.println(this.getNome());
        System.out.print("Data Nascimento: " );
        this.getDataNascimento().Mostrar();
    }
    
}
