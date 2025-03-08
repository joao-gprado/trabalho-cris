/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciadorDeTarefas.controller;

import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.GerenciaTarefas;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.Tarefa;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaComPrazo;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaop
 */
public class TableController {
    public void preencherTableTarefas(JTable jTableTarefas, List<Tarefa> tarefas) {
        DefaultTableModel modelo = (DefaultTableModel) jTableTarefas.getModel();
        modelo.setRowCount(tarefas.size());

        // Preenche a tabela com as tarefas
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            if (tarefa != null) {
                modelo.setValueAt(tarefa.getDescricao(), i, 0);
                modelo.setValueAt(tarefa.getPrioridade(), i, 1);
                modelo.setValueAt(tarefa.getDataCriacao().toString(), i, 2);

                if (tarefa instanceof TarefaComPrazo tarefaComPrazo) {
                    modelo.setValueAt(tarefaComPrazo.getPrazo().toString(), i, 3);
                }
            }
        }
    }
    
    public void excluir(JTable jTableTarefas){
        List<Tarefa> listaTarefas = GerenciaTarefas.getTarefas();
        DefaultTableModel model = (DefaultTableModel) jTableTarefas.getModel();
        
        if(jTableTarefas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela!", "Aviso", 0);
        }
        else {
            int resposta = JOptionPane.showConfirmDialog(
                    null, 
                    "Tem certeza que deseja excluir o produto?", 
                    "Aviso", 
                    JOptionPane.YES_NO_OPTION
            );
            
            if(resposta == JOptionPane.YES_OPTION){
                Tarefa tarefaSelec = listaTarefas.get(jTableTarefas.getSelectedRow());
                
                listaTarefas.remove(tarefaSelec);
                
                model.removeRow(jTableTarefas.getSelectedRow());
                
                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso", "Aviso", 1);
                
                preencherTableTarefas(jTableTarefas, listaTarefas);
            }   
        }
    }
}
