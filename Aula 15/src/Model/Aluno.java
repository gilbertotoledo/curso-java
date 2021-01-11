package Model;

import Util.Arquivo;
import java.util.ArrayList;
import json.JSONArray;
import json.JSONObject;

/**
 *
 * @author Gilberto Toledo
 */
public class Aluno {
    private String Matricula;
    private String Nome;

    public Aluno() {
    }

    public Aluno(String Matricula, String Nome) {
        this.Matricula = Matricula;
        this.Nome = Nome;
    }
    
    public Aluno(JSONObject json) {
        this.Matricula = json.getString("matricula");
        this.Nome = json.getString("nome");
    }
    
    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public JSONObject toJson(){
        JSONObject json = new JSONObject();
        json.put("nome",this.Nome);
        json.put("matricula",this.Matricula);
        return json;
    }
    
    public boolean Persistir(){
        JSONObject json = this.toJson();
        
        String base = Arquivo.Read();
        JSONArray jA = new JSONArray();
        if(!base.isEmpty() && base.length()>5)
            jA = new JSONArray(base);
        
        jA.put(json);
        Arquivo.Write(jA.toString());
       
        return true;
    }
    
    public static ArrayList<Aluno> getAlunos(){
        ArrayList<Aluno> alunos = new ArrayList();
        String base = Arquivo.Read();
        if(base.isEmpty() || base.length()<5)
            return null;
        
        JSONArray jA = new JSONArray(base);
        for(int i=0;i<jA.length();i++){
            Aluno A = new Aluno(jA.getJSONObject(i));
            alunos.add(A);
        }
        return alunos;
    }
    
}
