package Model;

import java.util.ArrayList;

/**
 *
 * @author Gilberto Toledo
 */
public class Aluno {
    private String Matricula;
    private String Nome;

    public Aluno() {
    }

    public Aluno(String Matricula, String Nome) {
        this.Matricula = Matricula;
        this.Nome = Nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public boolean Persistir(){
        return true;
    }
    
    public static ArrayList<Aluno> getAlunos(){
        ArrayList<Aluno> alunos = new ArrayList();
        return alunos;
    }
    
}
