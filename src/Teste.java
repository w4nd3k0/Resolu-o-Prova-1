/*Crie uma classe chamada teste.*/

public class Teste {
    
    public static void main(String[] args) {
        
        Diretor D1 = new Diretor();
        D1.setNome("Anthony C. Ferrante");
        
        Data DD = new Data();
        DD.setDia(10);
        DD.setMes(11);
        DD.setAno(1987);
        
        D1.setDataNascimento(DD);
        
        /* */
        Filme F1 = new Filme();
        F1.setNomeFilme("Sharknado");
                
        Data DF = new Data();
        DF.setDia(11);
        DF.setMes(7);
        DF.setAno(2013);
        
        F1.setDataFilme(DF);
        F1.setNDiretor(D1);
        
        F1.InformaGenero("Terror");
        F1.Mostrar();
    }
    
}
