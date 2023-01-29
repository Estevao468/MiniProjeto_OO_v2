package view;

import java.awt.event.*;
import javax.swing.*;
import controle.*;

/**
 * Classe referente a tela de detalhes de medicamentos comprimidos já cadastrados ou 
 * que serão cadastrados 
 * @author Diógenes Júnior
 * @since 2022
 *
 */
public class TelaDetalheMedicamentoComprimido  implements ActionListener{
    private JFrame janela = new JFrame("Cadastro Medicamento");
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel frequenciaJLabel = new JLabel("Frequência: ");
	private JTextField frequenciaMedicamento;
	private JLabel comprimidosPorDiaJLabel = new JLabel("Por Dia: ");
	private JTextField porDia;
	private JLabel labelCT = new JLabel("Comprimidos Totais: ");
	private JTextField valorTotal;
	private JButton excluirButtonComprimido = new JButton("Excluir");
	private JButton excluirButtonLiquido = new JButton("Excluir");
    private JButton salvarButton = new JButton("Salvar");
    private String[] dadosMedicamento = new String[50];
    private static ControleDados dados;
    private int posicao;
    private int opcao;

    /**
     * Método que mostrará tela com detalhes de medicamentos para serem editados em medicamentos cadastrados
     * @param op escolha entre edição ou cadastro de comprimidos
     * @param d dados referentes a classe ControleDados
     * @param l referente a classe de TelaListaMedicamento
     * @param pos posição ocupada pelo dado requisitado
     * 
     */
    public void inserirEditar(int op, ControleDados d, int pos){

        dados = d;
        posicao = pos;
        opcao = op;


        if(op == 2){ //se for edicao, preenche os campos com os dados do comprimido
            
            valorNome = new JTextField(dados.getComprimidos()[pos].getNome(), 200);
            valorMarca = new JTextField(dados.getComprimidos()[pos].getMarca(), 200);
            frequenciaMedicamento = new JTextField(dados.getComprimidos()[pos].getFrequencia(), 200);
            porDia = new JTextField(String.valueOf(dados.getComprimidos()[pos].getComprimidosporDia()), 200);
            valorTotal = new JTextField(String.valueOf(dados.getComprimidos()[pos].getComprimidosTotal()), 200);
            
            comprimidosPorDiaJLabel.setBounds(30, 110, 150, 25);
            excluirButtonComprimido.setBounds(230, 200, 120, 30);
            labelCT.setBounds(30, 140, 150, 25);
            
        } 

        else{ // senão, aparece com campos vazios para cadastro de comprimidos
            valorNome = new JTextField(200);
            valorMarca = new JTextField(200);
            frequenciaMedicamento = new JTextField(200);
            porDia = new JTextField(200);
            valorTotal = new JTextField(200);
            comprimidosPorDiaJLabel.setBounds(30, 110, 150, 25);
            labelCT.setBounds(30, 140, 150, 25);
            excluirButtonLiquido.setBounds(230, 200, 120, 30);
            
        }

        labelNome.setBounds(30, 20, 150, 25);
        valorNome.setBounds(180, 20, 180, 25);
        
        labelMarca.setBounds(30, 50, 150, 25);
        valorMarca.setBounds(180, 50, 180, 25);
        
        frequenciaJLabel.setBounds(30, 80,150,25);
        frequenciaMedicamento.setBounds(180, 80, 180,25);
        
        porDia.setBounds(180, 110, 180, 25);
        valorTotal.setBounds(180, 140, 180, 25);
        
        salvarButton.setBounds(100, 200, 120, 30);

        this.janela.add(labelNome);
        this.janela.add(valorNome);
        this.janela.add(labelMarca);
        this.janela.add(valorMarca);
        this.janela.add(frequenciaJLabel);
        this.janela.add(frequenciaMedicamento);
        this.janela.add(labelCT);
        this.janela.add(valorTotal);
        this.janela.add(comprimidosPorDiaJLabel);
        this.janela.add(porDia);
        this.janela.add(salvarButton);
        this.janela.add(excluirButtonComprimido);
        this.janela.add(excluirButtonLiquido);

        this.janela.setLayout(null);

        this.janela.setSize(700, 500);
		this.janela.setVisible(true);

		salvarButton.addActionListener(this);
		excluirButtonComprimido.addActionListener(this);
		excluirButtonLiquido.addActionListener(this);

    }
    
    /**
     * Método de ativação de botões
     * @param e evento de clique
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     *
     */
    public void actionPerformed(ActionEvent e) {  
        Object src = e.getSource();

        if(src == salvarButton){ //se for salvar, salva os dados no comprimido
                boolean resultado;
                if(opcao == 1){ //se for cadastro, cria um novo comprimido
                    dadosMedicamento[0] = Integer.toString(dados.getQtdComprimidos());
                }  
                else { //se for edição, pega os dados do comprimido
                	dadosMedicamento[0] = Integer.toString(posicao);
                }
                
                
                if(opcao == 1 || opcao == 2) { //
                	dadosMedicamento[1] = valorNome.getText();
                    dadosMedicamento[2] = valorMarca.getText();
                    dadosMedicamento[3] = frequenciaMedicamento.getText();
                    dadosMedicamento[4] = porDia.getText();
                    dadosMedicamento[5] = valorTotal.getText();
                    resultado = dados.inserirEditarComprimido(dadosMedicamento);
                    mensagemCadastroConcluido();
                }
        
         }
        
        if(src == excluirButtonComprimido) { //se for excluir, exclui o comprimido
        	boolean resposta = false;
        	
        	resposta = dados.deletarComprimido(posicao);
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

