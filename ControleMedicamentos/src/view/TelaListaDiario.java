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
public class TelaListaDiario implements ActionListener, ListSelectionListener {
    private JFrame janela;
	private JLabel titulo;
    private JButton cadastroCiclo;
    private JButton refreshCiclo;
    private JButton cadastroSintoma;
    private JButton refreshSintoma;
	private static ControleDados dados;
	private JList<String> listaCicloCadastrados;
	private JList<String> listaSintomaCadastrados;
    private int opcao;
	private String[] listaNomesCiclo = new String[50];
    private String[] listaNomesSintoma = new String[50];
    
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
            listaNomesCiclo = new ControleCiclo(dados).getNomeCiclo(); // chamando nomes de comprimidos cadastrados da controle
            listaCicloCadastrados = new JList<String>(listaNomesCiclo);// criando a lista de nomes de comprimidos cadastrados
            janela = new JFrame("Controle de Medicamento");
            titulo = new JLabel("Comprimidos Cadastrados");
            cadastroCiclo = new JButton("Cadastrar");
            refreshCiclo = new JButton("Atualizar");
            
            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(230, 10, 600, 30);
            listaCicloCadastrados.setBounds(150, 50, 350, 120);
            listaCicloCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listaCicloCadastrados.setVisibleRowCount(10);
            
            cadastroCiclo.setBounds(200, 175, 110, 30);
            refreshCiclo.setBounds(340, 175, 110, 30);
            
            janela.setLayout(null);

            janela.add(titulo);
            janela.add(listaCicloCadastrados);
            janela.add(cadastroCiclo);
            janela.add(refreshCiclo);

            janela.setSize(700, 500);
            janela.setVisible(true);

            cadastroCiclo.addActionListener(this);
            refreshCiclo.addActionListener(this);
            listaCicloCadastrados.addListSelectionListener(this);
        break;

		case 2://mostrar lista de liquidos cadastrados
            listaNomesSintoma = new ControleSintoma(dados).getNomeSintoma(); // chamando nomes de liquidos cadastrados da controle
            listaSintomaCadastrados = new JList<String>(listaNomesSintoma); // criando a lista de nomes de liquidos cadastrados
            janela = new JFrame("Controle de Medicamento");
            titulo = new JLabel("Liquidos Cadastrados");
            cadastroSintoma = new JButton("Cadastrar");
            refreshSintoma = new JButton("Atualizar");
            
            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(230, 10, 600, 30);
            listaSintomaCadastrados.setBounds(150, 50, 350, 120);
            listaSintomaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listaSintomaCadastrados.setVisibleRowCount(10);
            

            cadastroSintoma.setBounds(200, 175, 110, 30);
            refreshSintoma.setBounds(340, 175, 110, 30);
            

            janela.setLayout(null);

            janela.add(titulo);
            janela.add(listaSintomaCadastrados);
            janela.add(cadastroSintoma);
            janela.add(refreshSintoma);
        
            janela.setSize(700, 500);
            janela.setVisible(true);

            cadastroSintoma.addActionListener(this);
            refreshSintoma.addActionListener(this);
            listaSintomaCadastrados.addListSelectionListener(this);
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
        
        if (src == cadastroCiclo) { // botao cadastra comprimido
        	new TelaDetalheCiclo().inserirEditar(1, dados, 0);
        }
        if (src == refreshCiclo){ // botao atualiza comprimido
        	listaCicloCadastrados.setListData(new ControleCiclo(dados).getNomeCiclo());			
			listaCicloCadastrados.updateUI();
        }
        if (src == cadastroSintoma) { // botao cadastra liquido
        	new TelaDetalheSintoma().inserirEditar(1, dados, 0);
        }
        
        if (src == refreshSintoma){  // botao atualiza liquido
        	listaSintomaCadastrados.setListData(new ControleSintoma(dados).getNomeSintoma());			
			listaSintomaCadastrados.updateUI();
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
        
        if(e.getValueIsAdjusting() && src == listaCicloCadastrados){ // seleciona comprimido
            new TelaDetalheCiclo().inserirEditar(2, dados, listaCicloCadastrados.getSelectedIndex());
            //janela.dispose();
        }

        if (e.getValueIsAdjusting() && src == listaSintomaCadastrados) { // seleciona liquido
            new TelaDetalheSintoma().inserirEditar(2, dados, listaSintomaCadastrados.getSelectedIndex());
            //janela.dispose();
        }
        
    }

    

   

}



	



