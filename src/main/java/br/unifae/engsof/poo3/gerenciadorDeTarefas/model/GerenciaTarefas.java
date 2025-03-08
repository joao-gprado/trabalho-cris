package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cimam
 */
public class GerenciaTarefas {
    
    //Tentando criar uma lista unica 
    //´para o cadastro
    private static List<Tarefa> tarefas = new ArrayList<Tarefa>();
    
    public GerenciaTarefas(){
    }
    
    public static boolean cadastrar(Tarefa tarefa){
        if(tarefa!= null)
            if(!(tarefas.contains(tarefa)))
                return tarefas.add(tarefa);
        
       return false;
    } 
    public static  List<Tarefa> getTarefas(){
        return tarefas;
    }
    public static boolean removeTarefas(Tarefa tarefa){
        if(tarefa!=null)
            return tarefas.remove(tarefa);
        return false;
    }
}
