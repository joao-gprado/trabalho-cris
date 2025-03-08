package br.unifae.engsof.poo3.gerenciadorDeTarefas.controller;

import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.GerenciaTarefas;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaComPrazo;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaSimples;
import java.time.LocalDate;


/**
 *
 * @author cimam
 */
public class TarefaController {
    
    /**
     * Tenta cadastrar os dados
     * 
     * @param desc:descrição da tarefa
     * @param prior: 1 a 5
     * @param data: data de criação da tarefa
     * @return : true se pode cadastrar e false, 
     * caso contrario
     */
    public boolean addTarefaSimples(String desc, int prior, LocalDate data){
        if(desc==null || desc.isEmpty()){
            throw new IllegalArgumentException("A descricao nao pode ser vazia");
        }else if(data==null){
            throw new IllegalArgumentException("A data de criacao não pode ser vazia");
        }else{
           //Criar a tarefa
           return GerenciaTarefas.cadastrar(new TarefaSimples(desc, prior,data));
       }
    } 
    
    public boolean addTarefaComPrazo(String desc, int prior, LocalDate data, LocalDate prazo){
        if(desc==null || desc.isEmpty()){
            throw new IllegalArgumentException("A descricao nao pode ser vazia");
        }else if(prazo==null){
            throw new IllegalArgumentException("A data do prazo nao pode ser vazia");
        } else if(data==null){
            throw new IllegalArgumentException("A data de criacao não pode ser vazia");
        }else if(prazo.isBefore(data)){
            throw new IllegalArgumentException("A data do prazo nao pode ser antes que a data de criacao");
        } else{
            //Criar a tarefa
            return GerenciaTarefas.cadastrar(new TarefaComPrazo(desc, prior, data, prazo));
        }
    }
}
