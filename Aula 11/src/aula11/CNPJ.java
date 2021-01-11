package aula11;

import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 * @author Gilberto Toledo
 */
public class CNPJ {
    private String cnpj;
    private static final String Formato = "##.###.###/####-##";
    
    public CNPJ(String C) {
        this.cnpj = this.Format(C,false);
    }
    
    
    public boolean isCNPJ(){
        
        if (this.cnpj.equals("00000000000000") || 
            this.cnpj.equals("11111111111111") ||
            this.cnpj.equals("22222222222222") || 
            this.cnpj.equals("33333333333333") ||
            this.cnpj.equals("44444444444444") || 
            this.cnpj.equals("55555555555555") ||
            this.cnpj.equals("66666666666666") || 
            this.cnpj.equals("77777777777777") ||
            this.cnpj.equals("88888888888888") || 
            this.cnpj.equals("99999999999999") ||
            this.cnpj.length() != 14)
            return(false);

        char dig13, dig14;
        int sm, i, r, num, peso;

        try {
            // Calculo do primeiro Digito Verificador
            sm = 0;
            peso = 2;
            for (i=11; i>=0; i--) {
                num = (int)(this.cnpj.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1))
                dig13 = '0';
            else dig13 = (char)((11-r) + 48);

            // Calculo do segundo Digito Verificador
            sm = 0;
            peso = 2;
            for (i=12; i>=0; i--) {
                num = (int)(this.cnpj.charAt(i)- 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1))
                dig14 = '0';
            else dig14 = (char)((11-r) + 48);

            
            if ((dig13 == this.cnpj.charAt(12)) && (dig14 == this.cnpj.charAt(13)))
                return(true);
            else
                return(false);
        } catch (Exception e) {
           return(false);
        }
    }

    public String getCNPJ(boolean Mascara) {
        return Format(this.cnpj,Mascara);
    }

    private String Format(String Cnpj, boolean Mascara){
        if(Mascara){
            return(Cnpj.substring(0, 2) + "." + Cnpj.substring(2, 5) + "." +
            Cnpj.substring(5, 8) + "/" + Cnpj.substring(8, 12) + "-" +
            Cnpj.substring(12, 14));
        }else{
            Cnpj = Cnpj.replace(".","");
            Cnpj = Cnpj.replace("-","");
            Cnpj = Cnpj.replace("/","");
            return Cnpj;
        }
    }
    
    public static DefaultFormatterFactory getFormat(){
        try {
            return new DefaultFormatterFactory(new MaskFormatter(Formato));
        } catch (Exception e) {
            return null;
        }
    }

}
