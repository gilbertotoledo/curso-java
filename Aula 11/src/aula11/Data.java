package aula11;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Gilberto Toledo
 */
public class Data {
    private Timestamp data;
    public static final String BarraSemHora="dd/MM/yyyy";
    public static final String BarraComHora="dd/MM/yyyy hh:mm";
    public static final String HifenSemHora="yyyy-MM-dd";
    public static final String HifenComHora="yyyy-MM-dd hh:mm:ss";

    public Data() {
        Timestamp timestamp = null;  
        try { 
            Timestamp agora = new Timestamp(System.currentTimeMillis());
            SimpleDateFormat formatoData = new SimpleDateFormat(HifenComHora);
            Calendar c = Calendar.getInstance();  
            c.setTime(formatoData.parse(agora.toString()));  
            timestamp = new Timestamp(c.getTimeInMillis());  
        } catch (Exception e) { 
            System.err.println(e.getMessage());
        }
        this.data = timestamp;
    }
    
    public Data(Timestamp Data) {
        this.data = Data;
    }
    
    public Data(String Data,String Format) {
        if(Format.isEmpty())
            Format=BarraComHora;
        
        //if(Format.equals(BarraSemHora) || Format.equals(HifenSemHora))
            //Data+=" 00:00:00";
        
        Timestamp timestamp = null;
        try {  
            SimpleDateFormat formatoData = new SimpleDateFormat(Format);  
            Calendar c = Calendar.getInstance();  
            c.setTime(formatoData.parse(Data));  
            timestamp = new Timestamp(c.getTimeInMillis());  
        } catch (Exception e) { 
            System.err.println(e.getMessage());
        }  
        this.data = timestamp;
    }
    
    //Retorna "dd/MM/yyyy hh:mm"
    public String getDataHoraString(){
        String dataS = this.data.toString().split(" ")[0];
        String horaS = this.data.toString().split(" ")[1];
        
        String data = dataS.split("-")[2]+"/"+dataS.split("-")[1]+"/"+dataS.split("-")[0];
        String hora = horaS.split(":")[0]+":"+horaS.split(":")[1];
        return data+" "+hora;
    }
    
    //Retorna "dd/MM/yy hh:mm"
    public String getDataHoraStringAnoResumido(){
        String dataS = this.data.toString().split(" ")[0];
        String horaS = this.data.toString().split(" ")[1];
        
        String data = dataS.split("-")[2]+"/"+dataS.split("-")[1]+"/"+(Integer.parseInt(dataS.split("-")[0])-2000);
        String hora = horaS.split(":")[0]+":"+horaS.split(":")[1];
        return data+" "+hora;
    }
    
    //Retorna "dd/MM/yyyy"
    public String getDataString(){
        String dataS = this.data.toString().split(" ")[0];
        return dataS.split("-")[2]+"/"+dataS.split("-")[1]+"/"+dataS.split("-")[0];
    }
    
    //Retorna "dd/MM/yyyy"
    public String getDataStringAnoResumido(){
        String dataS = this.data.toString().split(" ")[0];
        return dataS.split("-")[2]+"/"+dataS.split("-")[1]+"/"+(Integer.parseInt(dataS.split("-")[0])-2000);
    }
    
    //Retorna "hh:mm"
    public String getHoraString(){
        String horaS = this.data.toString().split(" ")[1];
        return horaS.split(":")[0]+":"+horaS.split(":")[1];
    }
    
    public Timestamp getTimestamp() {
        return data;
    }
    
    public int getDia(){
        return Integer.parseInt(this.data.toString().split(" ")[0].split("-")[2]);
    }
    public String getDiaString(){
        return this.data.toString().split(" ")[0].split("-")[2];
    }
    
    public int getMes(){
        return Integer.parseInt(this.data.toString().split(" ")[0].split("-")[1]);
    }
    
    public String getMesNome(){
        String meses[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        return meses[this.getMes()-1];
    }
    
    public String getMesString(){
        return this.data.toString().split(" ")[0].split("-")[1];
    }
    
    public int getAno(){
        return Integer.parseInt(this.data.toString().split(" ")[0].split("-")[0]);
    }
    
    public void AddMes(int mes){
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
	cal.add(Calendar.MONTH, mes);
        
        data = new Timestamp(cal.getTimeInMillis()); 
    }
    
    public static int getUltimoDiaMes(String mes,String ano){
        Data D = new Data("01/"+mes+"/"+ano,Data.BarraSemHora);
        
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime( D.getTimestamp() );
        int dia = cal.getActualMaximum( Calendar.DAY_OF_MONTH );
        return dia;
    }
    
}
