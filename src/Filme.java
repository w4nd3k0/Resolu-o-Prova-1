/*Crie uma classe chamada filme.*/

public class Filme {
    private String NomeFilme;
    private Diretor NDiretor;
    private Data DataFilme;
    private String Genero;
    
    public String getNomeFilme(){
        return this.NomeFilme;
    }
    
    public Diretor getNDiretor(){
        return this.NDiretor;
    }
    
    public Data getDataFilme(){
        return this.DataFilme;                
    }
    
    public String getGenero(){
        return this.Genero;
    }
    
    public void setNomeFilme(String nf){
        this.NomeFilme = nf;
    }
    
    public void setNDiretor(Diretor df){
        this.NDiretor = df;
    }
    
    public void setDataFilme(Data df){
        this.DataFilme = df;
    }
    
    public void setGenero(String gf){
        this.Genero = gf;
    }
    
    public void Mostrar(){
        System.out.println("Nome: " + getNomeFilme());
        
        System.out.print("Diretor: ");
        this.getNDiretor().Mostrar();
        
        System.out.print("Data: " );
        this.getDataFilme().Mostrar();
        
        System.out.println("Genero: " + this.getGenero());
    }
    
    public boolean InformaGenero(String gf){
        
        setGenero(gf);
        
        if((gf == "Terror")||(gf == "Romance")||(gf == "Ação")){
            this.setGenero(gf);
            return true;
        }
        else{
            return false;
        }
    }
}
