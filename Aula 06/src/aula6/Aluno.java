package aula6;

/**
 * @author Gilberto Toledo
 */
public class Aluno {
    private String Nome;
    private String Matricula;
    
    public Aluno(){
    }
    
    public Aluno(String Nome, String Matricula){
        this.Nome = Nome;
        this.Matricula = Matricula;
    }
    
    public String getNome() {
        return Nome;
    }
    
    public String getNome(boolean pNome){
        //Gilberto Toledo
        
        if(pNome){
            String p[] = this.Nome.split(" ");
            return p[0];
        }else
            return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    
    
}
