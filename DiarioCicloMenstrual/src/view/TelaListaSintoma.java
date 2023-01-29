package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Classe referente a criação da tela de listagem de pacientes
 * @author Diógenes Júnior	
 * @since 2022
 *
 */
public class TelaListaSintoma implements ActionListener, ListSelectionListener {

    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroSintoma;
    private JButton atualizarSintoma;
    private JButton medicamentosGerais;
    private static ControleDados dados;
    private JList<String> listaSintomaCadastrados;
    private String[] listaSintoma = new String[50];
	
    /**
     * Método que adiciona todos elementos visuais referentes a TelaListaPaciente
     * @param d dados referentes a ControleDados
     * 
     */
	public void mostrarDados(ControleDados d){
        dados = d;
      
        listaSintoma = new ControleSintoma(dados).getNomeSintoma(); // pega os nomes dos pacientes cadastrados
        listaSintomaCadastrados = new JList<String>(listaSintoma); // adiciona os nomes dos pacientes cadastrados na lista
        janela = new JFrame("Controle de Pacientes");
        titulo = new JLabel("Lista de Pacientes");
       
        //buttons da tela
        cadastroSintoma = new JButton("Cadastrar");
        atualizarSintoma = new JButton("Atualizar");
        medicamentosGerais = new JButton("Medicamentos");

        //layout da tela da lista dos pacientes
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(230, 10, 600, 30);
        
        listaSintomaCadastrados.setBounds(150, 100, 350, 120);
        listaSintomaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaSintomaCadastrados.setVisibleRowCount(10);
        
        medicamentosGerais.setBounds(265, 300, 115, 30);
        cadastroSintoma.setBounds(200, 250, 115, 30);
        atualizarSintoma.setBounds(340, 250, 115, 30);
        
        janela.setLayout(null);

        janela.add(titulo);
        janela.add(listaSintomaCadastrados);
        janela.add(cadastroSintoma);
        janela.add(atualizarSintoma);
        janela.add(medicamentosGerais);

        janela.setSize(700, 500);
        janela.setVisible(true);

        cadastroSintoma.addActionListener(this);
        atualizarSintoma.addActionListener(this);
        medicamentosGerais.addActionListener(this);
        listaSintomaCadastrados.addListSelectionListener(this);

    }
	
    /**
     * Método que adiciona ações aos botões da tela
     * @param e evento referente ao botão
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     *  
     */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
        
		
        if (src == cadastroSintoma) { // se o botão cadastroPaciente for ativado, chama a tela de cadastra o paciente
            new TelaDetalheSintoma().inserirEditar(2, dados, this, 0);
        }
        
        
        if (src == atualizarSintoma) { // se o botão refreshPaciente for ativado, atualiza a lista de pacientes
            listaSintomaCadastrados.setListData(new ControleSintoma(dados).getNomeSintoma());			
			listaSintomaCadastrados.updateUI();
        }
        
        
        if(src == medicamentosGerais) { // se o botão medicamentosGerais for ativado, chama a tela de medicamentos gerais
        	new TelaEscolhaMedicamento();
        	janela.dispose();
        }
	
	}

    /**
     * Método que adiciona ações a lista de pacientes
     * @param e evento referente a lista de pacientes
     * @see javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.ListSelectionEvent)
     *  
     */
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaSintomaCadastrados) { // seleciona um paciente
        	new TelaDetalheSintoma().inserirEditar(1, dados, this, listaSintomaCadastrados.getSelectedIndex());
        }
        
    }

}
