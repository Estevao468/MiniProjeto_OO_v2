package view;

import java.awt.event.*;
import javax.swing.*;
import controle.*;

/**
 * Classe referente a tela de detalhes de medicamento liquido cadastrados
 * @author Henrique Pucci
 * @since 2022
 * 
 */
public class TelaDetalheSintoma implements ActionListener{
	private JFrame janela = new JFrame("Cadastro Medicamento");
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelData = new JLabel("Data: ");
	private JTextField valorData;
	private JLabel labelObservacao = new JLabel("Observação: ");
	private JTextField valorObservacao;
	private JButton excluirButtonSintoma = new JButton("Excluir");
    private JButton salvarButton = new JButton("Salvar");
    private String[] dadosDiario = new String[50];
    private static ControleDados dados;
    private int posicao;
    private int opcao;

    /**
     * Método que mostrará tela com detalhes de medicamentos para serem editados em medicamentos cadastrados
     * @param op escolha entre edição ou cadastro de liquidos
     * @param d dados referentes a classe ControleDados
     * @param l referente a classe de TelaListaMedicamento
     * @param pos posição ocupada pelo dado requisitado
     * 
     */
    public void inserirEditar(int op, ControleDados d, int pos){

        dados = d;
        posicao = pos;
        opcao = op;


        if(op == 2){ //se for edicao, preenche os campos com os dados do liquido
            
            valorNome = new JTextField(dados.getSintoma()[pos].getNome(), 200);
            valorData = new JTextField(dados.getSintoma()[pos].getData(), 200);
            valorObservacao = new JTextField(dados.getSintoma()[pos].getObservacao(), 200);
            excluirButtonSintoma.setBounds(230, 200, 120, 30);
            
        } 

        else{ //se for cadastro, cria campos vazios
            valorNome = new JTextField(200);
            valorData = new JTextField(200);
            valorObservacao = new JTextField(200);
            excluirButtonSintoma.setBounds(230, 200, 120, 30);
            
        }

        labelNome.setBounds(30, 20, 150, 25);
        valorNome.setBounds(180, 20, 180, 25);
        
        labelData.setBounds(30, 50, 150, 25);
        valorData.setBounds(180, 50, 180, 25);
        
        labelObservacao.setBounds(30, 80,150,25);
        valorObservacao.setBounds(180, 80, 180,25);
        salvarButton.setBounds(100, 200, 120, 30);

        this.janela.add(labelNome);
        this.janela.add(valorNome);
        this.janela.add(labelData);
        this.janela.add(valorData);
        this.janela.add(labelObservacao);
        this.janela.add(valorObservacao);
        this.janela.add(salvarButton);
        this.janela.add(excluirButtonSintoma);

        this.janela.setLayout(null);

        this.janela.setSize(700, 500);
		this.janela.setVisible(true);

		salvarButton.addActionListener(this);
		excluirButtonSintoma.addActionListener(this);

    }
    
    /**
     * Método de ação dos botões da tela
     * @param e evento de clique
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     * 
     */
    public void actionPerformed(ActionEvent e) {  
        Object src = e.getSource();

        if(src == salvarButton){ //se for salvar, salva os dados no comprimido
                boolean resultado;
                if(opcao == 1){ //se for cadastro, cria um novo liquido
                    dadosDiario[0] = Integer.toString(dados.getQtdSintoma());
                }  
                else { //se for edicao, pega os dados do liquido
                	dadosDiario[0] = Integer.toString(posicao);
                }
                
                
                if(opcao == 1 || opcao == 2) {
                	dadosDiario[1] = valorNome.getText();
                    dadosDiario[2] = valorData.getText();
                    dadosDiario[3] = valorObservacao.getText();
                    resultado = dados.inserirEditarSintoma(dadosDiario);
                    mensagemCadastroConcluido();
                }
        
         }
        
        if(src == excluirButtonSintoma) { //se for excluir, exclui o liquido
        	boolean resposta = false;
        	
        	resposta = dados.deletarSintoma(posicao);
        	if(resposta == true) {
        		mensagemDeletarConcluido();
        	}
        }
        
    }

    public void mensagemCadastroConcluido(){
        JOptionPane.showMessageDialog(null, "Medicamento Cadastrado");
        janela.dispose();
    }
    public void mensagemDeletarConcluido(){
        JOptionPane.showMessageDialog(null, "Medicamento Excluido");
        janela.dispose();
    }
    
    
}