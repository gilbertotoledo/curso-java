package aula13;

import java.sql.Timestamp;

/**
 * @author Gilberto Toledo
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.setNome("Gilberto");
        a.setMatricula("111");
        a.setIdade(21);
        a.setNascimento(Timestamp.valueOf("1994-08-12 00:00:00"));
        
        System.out.println(a.toJson().toString());
        
        Aluno b = new Aluno(a.toJson());
        System.out.println("Nome: "+b.getNome());
        
    }
    
}
