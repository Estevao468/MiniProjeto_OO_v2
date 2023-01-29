package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Classe responsável pelo objeto usuario
 * @author Rhumenigue e Estevao
 * @since 2023
 * 
 */
public class TelaDetalheSintoma implements ActionListener, ListSelectionListener {

    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroSintoma;
    private JButton refreshSintoma;
    private JButton medicamentosGerais;
    private static ControleDados dados;
    private JList<String> listaSintomasCadastrados;
    private String[] listaSintomas = new String[50];
	
    /**
     * Método que adiciona todos elementos visuais referentes a TelaListaUsuario
     * @param d dados referentes a ControleDados
     * 
     */
	public void mostrarDados(ControleDados d){
        dados = d;
      
        listaSintomas = new ControleSintomas(dados).getNomeSintoma(); // pega os nomes dos sintomas cadastrados
        listaSintomasCadastrados = new JList<String>(listaSintomas); // adiciona os nomes dos sintomas cadastrados 
        janela = new JFrame("Controle de Sintomas");
        titulo = new JLabel("Lista de Sintomas");
       
        //botos na tela
        cadastroSintoma = new JButton("Cadastrar");
        refreshSintoma = new JButton("Atualizar");
        medicamentosGerais = new JButton("Medicamentos");

        //tela com a lista dos Sintomas
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(200, 10, 600, 30);
        
        listaSintomasCadastrados.setBounds(150, 100, 350, 120);
        listaSintomasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaSintomasCadastrados.setVisibleRowCount(10);
        
        medicamentosGerais.setBounds(200, 300, 115, 30);
        cadastroSintoma.setBounds(200, 250, 115, 30);
        refreshSintoma.setBounds(340, 250, 115, 30);
        
        janela.setLayout(null);

        janela.add(titulo);
        janela.add(listaSintomasCadastrados);
        janela.add(cadastroSintoma);
        janela.add(refreshSintoma);
        janela.add(medicamentosGerais);

        janela.setSize(600, 500);
        janela.setVisible(true);

        cadastroSintoma.addActionListener(this);
        refreshSintoma.addActionListener(this);
        medicamentosGerais.addActionListener(this);
        listaSintomasCadastrados.addListSelectionListener(this);

    }
	
    /**
     * Método para adicionar acoes nos botoes da tela
     * @param e evento referente ao botão
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     *  
     */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
        
		
        if (src == cadastroSintoma) { // se o botão cadastroUsuario for ativado, entao ativa a tela de cadastro do Sintoma
            new TelaDetalheSintoma().inserirEditarSintomas(2, dados, this, 0);
        }
        
        
        if (src == refreshSintoma) { // se o botão refreshUsuario for ativado, entao atualizara os usuarios
            listaSintomasCadastrados.setListData(new ControleSintomas(dados).getNomeSintoma());			
			listaSintomasCadastrados.updateUI();
        }
        
        
        if(src == medicamentosGerais) { // se o botão medicamentosGerais for ativado, chama a tela de medicamentos gerais
        	new TelaEscolhaMedicamento();
        	janela.dispose();
        }
	
	}

	/**
     * Método que adiciona ações a lista de Usuarios
     * @param e evento referente a lista de Usuarios
     * @see javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.ListSelectionEvent)
     *  
     */
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaSintomasCadastrados) { // seleciona um usuario
        	new TelaDetalheSintoma().inserirEditarSintomas(1, dados, this, listaSintomasCadastrados.getSelectedIndex());
        }
        
    }

	private void inserirEditarSintomas(int i, ControleDados dados2, TelaDetalheSintoma telaDetalheSintoma,
			int selectedIndex) {
		// TODO Stub de método gerado automaticamente
		
	}


}