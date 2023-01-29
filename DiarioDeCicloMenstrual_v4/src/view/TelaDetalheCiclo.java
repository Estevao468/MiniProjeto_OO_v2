package view;

import java.awt.event.*;
import javax.swing.*;
import controle.*;

/**
 * Classe referente a tela de detalhes dos Ciclos já cadastrados ou 
 * que serão cadastrados 
 * @author Estevão e Rhumenigue
 * @since 2023
 * @version 1.0
 *
 */
public class TelaDetalheCiclo  implements ActionListener{
    private JFrame janela = new JFrame("Cadastro Diario");
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelData = new JLabel("Data: ");
	private JTextField valorData;
	private JLabel labelObservacao = new JLabel("Observação: ");
	private JTextField valorObservacao;
	private JLabel labelIntensidade = new JLabel("Intensidade do Ciclo: ");
	private JTextField valorIntensidade;
	private JButton excluirButtonCiclo = new JButton("Excluir");
	private JButton excluirButtonSintoma = new JButton("Excluir");
    private JButton salvarButton = new JButton("Salvar");
    private String[] dadosDiario = new String[50];
    private static ControleDados dados;
    private int posicao;
    private int opcao;

    /**
     * Método que mostrará tela com detalhes os Ciclos para serem editados
     * @param op escolha entre edição ou cadastro de ciclo
     * @param d dados referentes a classe ControleDados
     * @param pos posição ocupada pelo dado requisitado
     * 
     */
    public void inserirEditar(int op, ControleDados d, int pos){

        dados = d;
        posicao = pos;
        opcao = op;


        if(op == 2){ //se for edicao, preenche os campos com os dados do ciclo
            
            valorNome = new JTextField(dados.getCiclo()[pos].getNome(), 200);
            valorData = new JTextField(dados.getCiclo()[pos].getData(), 200);
            valorObservacao = new JTextField(dados.getCiclo()[pos].getObservacao(), 200);
            valorIntensidade = new JTextField(dados.getCiclo()[pos].getIntensidadeCiclo(), 200);
            excluirButtonCiclo.setBounds(230, 200, 120, 30);
            
        } 

        else{ // senão, aparece com campos vazios para cadastro de ciclo
            valorNome = new JTextField(200);
            valorData = new JTextField(200);
            valorObservacao = new JTextField(200);
            valorIntensidade = new JTextField(200);
            excluirButtonSintoma.setBounds(230, 200, 120, 30);
            
        }

        labelNome.setBounds(30, 20, 150, 25);
        valorNome.setBounds(180, 20, 180, 25);
        
        labelData.setBounds(30, 50, 150, 25);
        valorData.setBounds(180, 50, 180, 25);
        
        labelObservacao.setBounds(30, 80,150,25);
        valorObservacao.setBounds(180, 80, 180,25);
        
        labelIntensidade.setBounds(30, 110,150,25);
        valorIntensidade.setBounds(180, 110, 180,25);
        
        salvarButton.setBounds(100, 200, 120, 30);

        this.janela.add(labelNome);
        this.janela.add(valorNome);
        this.janela.add(labelData);
        this.janela.add(valorData);
        this.janela.add(labelObservacao);
        this.janela.add(valorObservacao);
        this.janela.add(labelIntensidade);
        this.janela.add(valorIntensidade);
        this.janela.add(salvarButton);
        this.janela.add(excluirButtonCiclo);
        this.janela.add(excluirButtonSintoma);

        this.janela.setLayout(null);

        this.janela.setSize(520, 320);
		this.janela.setVisible(true);

		salvarButton.addActionListener(this);
		excluirButtonCiclo.addActionListener(this);
		excluirButtonSintoma.addActionListener(this);

    }
    
    /**
     * Método de ativação de botões
     * @param e evento de clique
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     *
     */
    public void actionPerformed(ActionEvent e) {  
        Object src = e.getSource();

        if(src == salvarButton){ //se for salvar, salva os dados no ciclo
                boolean resultado;
                if(opcao == 1){ //se for cadastro, cria um novo ciclo
                    dadosDiario[0] = Integer.toString(dados.getQtdCiclo());
                }  
                else { //se for edição, pega os dados do ciclo
                	dadosDiario[0] = Integer.toString(posicao);
                }
                
                
                if(opcao == 1 || opcao == 2) { //
                	dadosDiario[1] = valorNome.getText();
                    dadosDiario[2] = valorData.getText();
                    dadosDiario[3] = valorObservacao.getText();
                    dadosDiario[4] = valorIntensidade.getText();
                    resultado = dados.inserirEditarCiclo(dadosDiario);
                    mensagemCadastroConcluido();
                }
        
         }
        
        if(src == excluirButtonCiclo) { //se for excluir, exclui o ciclo
        	boolean resposta = false;
        	
        	resposta = dados.deletarCiclo(posicao);
        	if(resposta == true) {
        		mensagemDeletarConcluido();
        	}
        }
        
    }

    public void mensagemCadastroConcluido(){
        JOptionPane.showMessageDialog(null, "Ciclo Cadastrado");
        janela.dispose();
    }
    public void mensagemDeletarConcluido(){
        JOptionPane.showMessageDialog(null, "Ciclo Excluido");
        janela.dispose();
    }
    
    
}

