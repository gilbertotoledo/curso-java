package aula4;

/**
 * @author Gilberto Toledo
 */
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        if(args.length>0)
            System.out.println(args[0]);
        else
            System.out.println("Nenhum argumento informado!");
        */
        
        try{
            System.out.println(args[0]+"\n\n");
            
            double valor = Double.parseDouble(args[0]);
            System.out.println(valor);
        }catch(ArrayIndexOutOfBoundsException eArray){
            System.out.println("Nenhum argumento informado! ");            
        }catch(NumberFormatException eFormato){
            System.out.println("Valor inválido!");
        }finally{
            System.out.println("Obrigado!");
        }
        
        /*catch(Exception e){
            System.out.println("Ocorreu um problema!");
        }*/
        
        
        
        
    }
    
}
