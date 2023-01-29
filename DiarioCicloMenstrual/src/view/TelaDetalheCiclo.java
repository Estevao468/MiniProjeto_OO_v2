package view;


import java.awt.event.*;
import javax.swing.*;
import controle.*;

/**
 * Classe referente a crição da tela de detalhes do paciente
 * @author Diógenes Júnior
 * @since 2022
 * 
 */
public class TelaDetalheCiclo implements ActionListener {
    private JFrame janela = new JFrame("Cadastro Ciclo");
    private JLabel nomeJLabel = new JLabel("Nome do Ciclo: ");
    private JTextField nomeCiclo;
    private JLabel dataPeriodo = new JLabel("Data do Período: ");
    private JTextField dataCiclo;
    private JLabel detalheJLabel = new JLabel("Detalhe: ");
    private JTextField detalhe;
    private JButton excluirButton = new JButton("Excluir");
    private JButton salvarButton = new JButton("Salvar");
    private static ControleDados dados;
    private  String[] dadosCiclo = new String[50];
    private int posicao;
    private int opcao;
    
    /**
     * Método que adiciona todos elementos visuais referentes a TelaDetalhePaciente
     * @param d dados referentes a ControleDados
     * @param op opção de escolha entre cadastro ou edição de um paciente
     * @param posicao posição referente a qual paciente será aberto
     */
    public void inserirEditar(int op, ControleDados d, TelaListaCiclo p, int pos){
        opcao = op;
        posicao = pos;
        dados = d;
        
     
        if (op == 1) { //se for edicao, preenche os campos com os dados do paciente
        	//dados Paciente
        	nomeCiclo = new JTextField(dados.getCiclos()[pos].getNome(), 200);
            dataCiclo = new JTextField(dados.getCiclos()[pos].getDataPeriodo(), 200);
         
            
        }
        else{ //se for cadastro, cria campos vazios
            nomeCiclo = new JTextField(200);
            dataCiclo = new JTextField(200);
            detalhe = new JTextField(200);
        }

        nomeJLabel.setBounds(30, 20, 150, 25);
		nomeCiclo.setBounds(180, 20, 180, 25);

		dataPeriodo.setBounds(30, 80, 150, 25);
		dataCiclo.setBounds(180, 80, 180, 25);
        detalheJLabel.setBounds(30, 410, 150, 25);
		detalhe.setBounds(180, 410, 180, 25);
		
	
		salvarButton.setBounds(180, 500, 120, 30);
		excluirButton.setBounds(310, 500, 120, 30);
		
		//pacientes
        this.janela.add(nomeJLabel);
        this.janela.add(nomeCiclo);
        this.janela.add(dataPeriodo);
        this.janela.add(dataCiclo);
        this.janela.add(detalheJLabel);
        this.janela.add(detalhe); 
  
        this.janela.add(salvarButton);
        this.janela.add(excluirButton);
       
        this.janela.setLayout(null);

        this.janela.setSize(1000, 700);
		this.janela.setVisible(true);

		salvarButton.addActionListener(this);
		excluirButton.addActionListener(this);

    }
    
    /**
     * Método que trata os eventos dos botões
     * @param e eventos relacionados aos botões
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     *
     */
    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();
        

        if (src == salvarButton) { //se for salvar, salva os dados no comprimido
        	boolean resposta;
            if (opcao == 2) { // se for cadastro, cria um novo comprimido
                dadosCiclo[0] = Integer.toString(dados.getQtdCiclos());
            }
            else { // se for alteração, pega a posicao do comprimido
                dadosCiclo[0] = Integer.toString(posicao);
            }
                
                dadosCiclo[1] = nomeCiclo.getText();
                dadosCiclo[3] = dataPeriodo.getText();
                dadosCiclo[16] = detalhe.getText();
                
                resposta = dados.inserirEditarSintoma(dadosCiclo);
                
                if(resposta == true) {
                	mensagemCadastroConcluido();
                }
                else {
                	mensagemCadastroErro();
                }
        }
           
        if(src == excluirButton) {
        	boolean resposta = false;
        	
        	resposta = dados.deletarSintoma(posicao);
        	if(resposta == true) {
        		mensagemDeletarConcluido();
        	}
        }
        janela.dispose();
    }
    
    
    public void mensagemCadastroConcluido(){
        JOptionPane.showMessageDialog(null, "Ciclo Cadastrado");
        //janela.dispose();
    }
    public void mensagemCadastroErro() {
    	JOptionPane.showMessageDialog(null, "Erro no Cadastro");
    	//janela.dispose();
    }
    public void mensagemDeletarConcluido(){
        JOptionPane.showMessageDialog(null, "Ciclo Excluido");
        //janela.dispose();
    }

}
