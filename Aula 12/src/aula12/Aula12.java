package aula12;

/**
  * @author Gilberto Toledo
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String arq = "teste.txt";
        
        /*
        //GRAVAÇÃO
        String texto ="Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos,\r\n"
                + "e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja\r\n"
                + "de tipos e os embaralhou para fazer um livro de modelos de tipos.";
        
        if(Arquivo.Write(arq, texto))
            System.out.println("Arquivo salvo com sucesso!");
        else
            System.out.println("Erro ao salvar o arquivo!");
        
        //LEITURA
        String texto = Arquivo.Read(arq);
        if(texto.isEmpty())
            System.out.println("Erro ao ler do arquivo!");
        else
            System.out.println(texto);
        */
        
        String ArqConfig = "conf.con";
        /*
        String nome = "Gilberto";
        String login = "admin";
        String versao = "1.0.5";
        
        String print = nome+";"+login+";"+versao;
        Arquivo.Write(ArqConfig,print);
        */
        
        String conteudo = Arquivo.Read(ArqConfig);
        String c1 = conteudo.split(";")[0];
        String c2 = conteudo.split(";")[1];
        String c3 = conteudo.split(";")[2];
        
        System.out.println("Nome: "+c1);
        System.out.println("Login: "+c2);
        System.out.println("Versão: "+c3);
    }
    
}
