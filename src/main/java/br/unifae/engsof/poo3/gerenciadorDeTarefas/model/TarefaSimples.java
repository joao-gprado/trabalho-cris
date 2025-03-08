package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

import java.time.LocalDate;

/**
 *
 * @author cimam
 */
public class TarefaSimples extends Tarefa {

    public TarefaSimples() {
    }

    public TarefaSimples(String descricao, int prioridade, LocalDate dataCriacao) {
        super(descricao, prioridade, dataCriacao);
    }
    
    
    
}
