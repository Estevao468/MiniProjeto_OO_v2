package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Classe referente a Tela de listagem dos medicamentos cadastrados
 * @author Henrique Pucci
 * @since 2022
 * 
 */
public class TelaListaMedicamentos implements ActionListener, ListSelectionListener {
    private JFrame janela;
	private JLabel titulo;
    private JButton cadastroComprimido;
    private JButton refreshComprimido;
    private JButton cadastroLiquido;
    private JButton refreshLiquido;
	private static ControleDados dados;
	private JList<String> listaComprimidosCadastrados;
	private JList<String> listaLiquidosCadastrados;
    private int opcao;
	private String[] listaNomesComprimidos = new String[50];
    private String[] listaNomesLiquidos = new String[50];
    
    /**
     * Método para listagem de todos medicamentos cadastrados no sistema
     * @param d dados referentes a classe ControleDados
     * @param op opção de medicamento escolhida pelo usuário
     * 
     */
	public void mostrarDados(ControleDados d, int op){
		dados = d;
        opcao = op;

		switch (op) {
		case 1: //mostrar lista de comprimidos cadastrados
            listaNomesComprimidos = new ControleComprimido(dados).getNomeComprimido(); // chamando nomes de comprimidos cadastrados da controle
            listaComprimidosCadastrados = new JList<String>(listaNomesComprimidos);// criando a lista de nomes de comprimidos cadastrados
            janela = new JFrame("Controle de Medicamento");
            titulo = new JLabel("Comprimidos Cadastrados");
            cadastroComprimido = new JButton("Cadastrar");
            refreshComprimido = new JButton("Atualizar");
            
            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(230, 10, 600, 30);
            listaComprimidosCadastrados.setBounds(150, 50, 350, 120);
            listaComprimidosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listaComprimidosCadastrados.setVisibleRowCount(10);
            
            cadastroComprimido.setBounds(200, 175, 110, 30);
            refreshComprimido.setBounds(340, 175, 110, 30);
            
            janela.setLayout(null);

            janela.add(titulo);
            janela.add(listaComprimidosCadastrados);
            janela.add(cadastroComprimido);
            janela.add(refreshComprimido);

            janela.setSize(700, 500);
            janela.setVisible(true);

            cadastroComprimido.addActionListener(this);
            refreshComprimido.addActionListener(this);
            listaComprimidosCadastrados.addListSelectionListener(this);
        break;

		case 2://mostrar lista de liquidos cadastrados
            listaNomesLiquidos = new ControleLiquido(dados).getNomeLiquido(); // chamando nomes de liquidos cadastrados da controle
            listaLiquidosCadastrados = new JList<String>(listaNomesLiquidos); // criando a lista de nomes de liquidos cadastrados
            janela = new JFrame("Controle de Medicamento");
            titulo = new JLabel("Liquidos Cadastrados");
            cadastroLiquido = new JButton("Cadastrar");
            refreshLiquido = new JButton("Atualizar");
            
            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(230, 10, 600, 30);
            listaLiquidosCadastrados.setBounds(150, 50, 350, 120);
            listaLiquidosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listaLiquidosCadastrados.setVisibleRowCount(10);
            

            cadastroLiquido.setBounds(200, 175, 110, 30);
            refreshLiquido.setBounds(340, 175, 110, 30);
            

            janela.setLayout(null);

            janela.add(titulo);
            janela.add(listaLiquidosCadastrados);
            janela.add(cadastroLiquido);
            janela.add(refreshLiquido);
        
            janela.setSize(700, 500);
            janela.setVisible(true);

            cadastroLiquido.addActionListener(this);
            refreshLiquido.addActionListener(this);
            listaLiquidosCadastrados.addListSelectionListener(this);
		break;
		
		default:
			JOptionPane.showMessageDialog(null,"Opcao nao encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

    
	}

    /**
     * Método para ação de botões
     * @param e evento de clique do botão
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     *
     */
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        if (src == cadastroComprimido) { // botao cadastra comprimido
        	new TelaDetalheMedicamentoComprimido().inserirEditar(1, dados, 0);
        }
        if (src == refreshComprimido){ // botao atualiza comprimido
        	listaComprimidosCadastrados.setListData(new ControleComprimido(dados).getNomeComprimido());			
			listaComprimidosCadastrados.updateUI();
        }
        if (src == cadastroLiquido) { // botao cadastra liquido
        	new TelaDetalheMedicamentoLiquido().inserirEditar(1, dados, 0);
        }
        
        if (src == refreshLiquido){  // botao atualiza liquido
        	listaLiquidosCadastrados.setListData(new ControleLiquido(dados).getNomeLiquido());			
			listaLiquidosCadastrados.updateUI();
        }
        
    }

    /**
     * Método para ação de seleção de item da lista
     * @param e evento de seleção de item da lista
     * @see javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.ListSelectionEvent)
     * 
     */
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();
        
        if(e.getValueIsAdjusting() && src == listaComprimidosCadastrados){ // seleciona comprimido
            new TelaDetalheMedicamentoComprimido().inserirEditar(2, dados, listaComprimidosCadastrados.getSelectedIndex());
            //janela.dispose();
        }

        if (e.getValueIsAdjusting() && src == listaLiquidosCadastrados) { // seleciona liquido
            new TelaDetalheMedicamentoLiquido().inserirEditar(2, dados, listaLiquidosCadastrados.getSelectedIndex());
            //janela.dispose();
        }
        
    }

    

   

}



	



