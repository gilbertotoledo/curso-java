/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Gilberto Toledo
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Cadeira c1 = new Cadeira();
        c1.serrar();
        c1.lixar();
        c1.setCor("Azul");
        c1.pintar();
        System.out.println("Cor atual: "+c1.getCor());
        */
        
        Aluno a1 = new Aluno("Gilberto");
        a1.setTelefone("1111111111");
        a1.setMatricula("0000001");
        
        Aluno a2 = new Aluno("Pedro");
        a2.setTelefone("2222222222");
        a2.setMatricula("00000002");
                
        a1.ImprimeDados();
        System.out.println("\n");
        a2.ImprimeDados();
        
        double media = Aluno.Media(10, 15);
        System.out.println("Média: "+media);
    }
       
}

