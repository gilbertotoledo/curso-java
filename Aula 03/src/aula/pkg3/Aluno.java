/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg3;

/**
 *
 * @author Gilberto Toledo
 */
public class Aluno {
    private String Nome;
    private String Matricula;
    private String Telefone;

    public Aluno() {
    }

    public Aluno(String Nome, String Matricula, String Telefone) {
        this.Nome = Nome;
        this.Matricula = Matricula;
        this.Telefone = Telefone;
    }    
    
    public String getNome() {
        return Nome;
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

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public String getDados(){
        return  "Nome: "+this.Nome+
                "\nMat.: "+this.Matricula+
                "\nTel.: "+this.Telefone+
                "\n";
    }
    
}
