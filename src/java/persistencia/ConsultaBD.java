/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.thoughtworks.xstream.XStream;
import dominio.Consulta;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nelsonfonseca
 */
public class ConsultaBD {
    private static ArrayList<Consulta> lista = new ArrayList<Consulta>();
    private static String caminho = "/srv/ConsultaOnline/";
    
    public static void inserir(Consulta novaConsulta){
        lerXml();
        lista.add(novaConsulta);
        salvarXml();
    }
    
    public static void alterar(Consulta consultaAlterada){
        excluir(consultaAlterada.getDatac());
        inserir(consultaAlterada);
    }
    
    public static void excluir(Date datac){
        lerXml();
        for(int i=0; i< lista.size(); i++){
            Consulta cadaConsulta = lista.get(i);
            if (cadaConsulta.getDatac().equals(datac)){
            lista.remove(i);
            break;
            }
        }
        salvarXml();
    }
    
    public static ArrayList<Consulta> listar(){
        lerXml();
        return lista;
    }
    
    //pega o que esta no XML e coloca na lista
    public static void lerXml(){
        File arquivo=new File(caminho+"consultas.xml");
        if (arquivo.exists()){
            //armazenas XML no vetor
            XStream xstream=new XStream();
            xstream.alias("consulta",Consulta.class);
            lista =(ArrayList<Consulta>) xstream.fromXML(arquivo);
        }else{
            lista = new ArrayList<Consulta>();
        }
    }
    
    //pega o que esta na lista e salva no XML
    public static void salvarXml(){
        XStream xstream = new XStream();
        xstream.alias("consulta",Consulta.class);
        try{
            FileWriter escritor=new FileWriter(caminho+"consultas.xml");
            escritor.write(xstream.toXML(lista));
            escritor.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
    
