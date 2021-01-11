package aula9;

/**
 * @author Gilberto Toledo
 */
public class Funcionario {
    private int Matricula;
    private String Nome;
    private Departamento Dep;

    public Funcionario() {
    }

    public Funcionario(int Matricula, String Nome) {
        this.Matricula = Matricula;
        this.Nome = Nome;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Departamento getDep() {
        return Dep;
    }

    public void setDep(Departamento Dep) {
        this.Dep = Dep;
    }
    
    
}
