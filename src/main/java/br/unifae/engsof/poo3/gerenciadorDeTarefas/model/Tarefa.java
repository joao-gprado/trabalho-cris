package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

import java.time.LocalDate;

/**
 *
 * @author cimam
 */
public abstract class Tarefa extends Object {

    private String descricao;// descrição da tarefa
    private int prioridade; //nível de prioridade da tarefa (1 a 5)
    private LocalDate dataCriacao;

    //construtor util para realizar consultas
    public Tarefa() {
    }

    //sobrecarregando com dados obrigatórios
    public Tarefa(String descricao, int prioridade, LocalDate dataCriacao) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Tarefa:" + "descricao=" + descricao + ", prioridade=" + prioridade + ", dataCriacao=" + dataCriacao ;
    }

    

    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
}


