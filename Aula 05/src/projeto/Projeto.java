package projeto;

import java.util.ArrayList;

/**
  * @author Gilberto Toledo
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vendedor V1 = new Vendedor("Gilberto", "0000000000","888888888");
        V1.setSalario(800.0);
        V1.setComissao(10.00);
        V1.setQuantVendas(10);
        //System.out.println(V1.getDados()+"\n");
        
        Motorista M1 = new Motorista("Lucas", "111111111","99999999999");
        M1.setSalario(800.0);
        //System.out.println(M1.getDados());
                
        
        ArrayList<Funcionario> Funcs = new ArrayList();
        Funcs.add(V1);
        Funcs.add(M1);
        
        for(int i=0;i<Funcs.size();i++){
            System.out.println(Funcs.get(i).getDados());
        }
        
    }
    
}
