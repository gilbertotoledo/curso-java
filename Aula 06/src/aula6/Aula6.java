package aula6;

/**
 * @author Gilberto Toledo
 */
public class Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno A1 = new Aluno("Gilberto Toledo", "111");
        
        Aluno A2 = new Aluno();
        A2.setNome("Lucas");
        A2.setMatricula("222");
        
        System.out.println(A1.getNome());
        
    }
    
}
