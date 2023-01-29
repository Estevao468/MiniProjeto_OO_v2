package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Classe referente a criação da tela de listagem de pacientes
 * @author Diógenes Júnior	
 * @since 2023
 *
 */
public class TelaListaCiclo implements ActionListener, ListSelectionListener {

    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroCiclo;
    private JButton refreshCiclo;
    private JButton medicamentosGerais;
    private static ControleDados dados;
    private JList<String> listaCiclosCadastrados;
    private String[] listaCiclos = new String[50];
	
    /**
     * Método que adiciona todos elementos visuais referentes a TelaListaPaciente
     * @param d dados referentes a ControleDados
     * 
     */
	public void mostrarDados(ControleDados d){
        dados = d;
      
        listaCiclos = new ControleCiclo(dados).getNomeCiclo(); // pega os nomes dos pacientes ciclos
        listaCiclosCadastrados = new JList<String>(listaCiclos); // adiciona os nomes dos pacientes ciclos na lista
        janela = new JFrame("Controle de Ciclos");
        titulo = new JLabel("Lista de Ciclos");
       
        //buttons da tela
        cadastroCiclo = new JButton("Cadastrar");
        refreshCiclo = new JButton("Atualizar");
        medicamentosGerais = new JButton("Medicamentos");

        //layout da tela da lista dos pacientes
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(230, 10, 600, 30);
        
        listaCiclosCadastrados.setBounds(150, 100, 350, 120);
        listaCiclosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaCiclosCadastrados.setVisibleRowCount(10);
        
        medicamentosGerais.setBounds(265, 300, 115, 30);
        cadastroCiclo.setBounds(200, 250, 115, 30);
        refreshCiclo.setBounds(340, 250, 115, 30);
        
        janela.setLayout(null);

        janela.add(titulo);
        janela.add(listaCiclosCadastrados);
        janela.add(cadastroCiclo);
        janela.add(refreshCiclo);
        janela.add(medicamentosGerais);

        janela.setSize(700, 500);
        janela.setVisible(true);

        cadastroCiclo.addActionListener(this);
        refreshCiclo.addActionListener(this);
        medicamentosGerais.addActionListener(this);
        listaCiclosCadastrados.addListSelectionListener(this);

    }
	
    /**
     * Método que adiciona ações aos botões da tela
     * @param e evento referente ao botão
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     *  
     */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
        
		
        if (src == cadastroCiclo) { // se o botão cadastroCiclo for ativado, chama a tela de cadastra o ciclo
            new TelaDetalheCiclo().inserirEditar(2, dados, this, 0);
        }
        
        
        if (src == refreshCiclo) { // se o botão refreshCiclo for ativado, atualiza a lista de pacientes
            listaCiclosCadastrados.setListData(new ControleCiclo(dados).getNomeCiclo());			
			listaCiclosCadastrados.updateUI();
        }
        
        
        if(src == medicamentosGerais) { // se o botão medicamentosGerais for ativado, chama a tela de medicamentos gerais
        	new TelaEscolhaMedicamento();
        	janela.dispose();
        }
	
	}


	/**
     * Método que adiciona ações a lista de ciclos
     * @param e evento referente a lista de ciclos
     * @see javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.ListSelectionEvent)
     *  
     */
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaCiclosCadastrados) { // seleciona um ciclo
        	new TelaDetalheCiclo().inserirEditar(1, dados, this, listaCiclosCadastrados.getSelectedIndex());
        }
        
    }

}
