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
public class TelaDetalheSintoma implements ActionListener {
    private JFrame janela = new JFrame("Cadastro Sintoma");
    private JLabel nomeJLabel = new JLabel("Nome: ");
    private JTextField nomeSintoma;
    private JLabel datadeSintoma = new JLabel("Nascimento: ");
    private JTextField dataSintoma;
    private JLabel nomeMedicamentoJLabel = new JLabel("Nome Medicamento: ");
    private JTextField nomeMedicamento;
    private JLabel marcaJLabel = new JLabel("Marca: ");
    private JTextField marcaMedicamento;
    private JLabel frequenciaJLabel = new JLabel("Frequência: ");
    private JTextField frequenciaMedicamento;
    private JLabel detalheJLabel = new JLabel("Detalhe: ");
    private JTextField detalhe;
    private JButton selecionarMedicamentoButton = new JButton("Escolher");
    private JButton excluirButton = new JButton("Excluir");
    private JButton salvarButton = new JButton("Salvar");
    private static ControleDados dados;
    public String nomeLiquido;
    private  String[] dadosSintoma = new String[50];
    private int posicao;
    private int opcao;
    
    /**
     * Método que adiciona todos elementos visuais referentes a TelaDetalhePaciente
     * @param d dados referentes a ControleDados
     * @param op opção de escolha entre cadastro ou edição de um paciente
     * @param posicao posição referente a qual paciente será aberto
     */
    public void inserirEditar(int op, ControleDados d, TelaListaSintoma p, int pos){
        opcao = op;
        posicao = pos;
        dados = d;
        
     
        if (op == 1) { //se for edicao, preenche os campos com os dados do paciente
        	//dados Paciente
        	nomeSintoma = new JTextField(dados.getSintoma()[pos].getNome(), 200);
            dataSintoma = new JTextField(dados.getSintoma()[pos].getDataSintoma(), 200);
            
            //medicamento
            nomeMedicamento = new JTextField(dados.getSintoma()[pos].getLiquidos().getNome(), 200);
            marcaMedicamento = new JTextField(dados.getSintoma()[pos].getLiquidos().getMarca(), 200);
            frequenciaMedicamento = new JTextField(dados.getSintoma()[pos].getLiquidos().getFrequencia(), 200);
            detalhe = new JTextField();
            
        }
        else{ //se for cadastro, cria campos vazios
            nomeSintoma = new JTextField(200);
            dataSintoma = new JTextField(200);
            
            nomeMedicamento = new JTextField(200);
            marcaMedicamento = new JTextField(200);
            frequenciaMedicamento = new JTextField(200);
            detalhe = new JTextField(200);
        }

        nomeJLabel.setBounds(30, 20, 150, 25);
		nomeSintoma.setBounds(180, 20, 180, 25);

		datadeSintoma.setBounds(30, 80, 150, 25);
		dataSintoma.setBounds(180, 80, 180, 25);

		nomeMedicamentoJLabel.setBounds(30, 200, 150, 25);
		nomeMedicamento.setBounds(180, 200, 180, 25);

		marcaJLabel.setBounds(30, 230, 150, 25);
		marcaMedicamento.setBounds(180, 230, 180, 25);

		frequenciaJLabel.setBounds(30, 260, 150, 25);
		frequenciaMedicamento.setBounds(180, 260, 180, 25);

		detalheJLabel.setBounds(30, 410, 150, 25);
		detalhe.setBounds(180, 410, 180, 25);
		
	
		salvarButton.setBounds(180, 500, 120, 30);
		excluirButton.setBounds(310, 500, 120, 30);
		
		//pacientes
        this.janela.add(nomeJLabel);
        this.janela.add(nomeSintoma);
        this.janela.add(datadeSintoma);
        this.janela.add(dataSintoma);
        
        //medicamento
        this.janela.add(nomeMedicamentoJLabel);
        this.janela.add(nomeMedicamento);
        this.janela.add(marcaJLabel);
        this.janela.add(marcaMedicamento);
        this.janela.add(frequenciaJLabel);
        this.janela.add(frequenciaMedicamento);
        this.janela.add(detalheJLabel);
        this.janela.add(detalhe);
        
  
        this.janela.add(salvarButton);
        this.janela.add(excluirButton);
        this.janela.add(selecionarMedicamentoButton);

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
                dadosSintoma[0] = Integer.toString(dados.getQtdSintoma());
            }
            else { // se for alteração, pega a posicao do comprimido
                dadosSintoma[0] = Integer.toString(posicao);
            }
                
                dadosSintoma[1] = nomeSintoma.getText();
                dadosSintoma[2] = datadeSintoma.getText();
                dadosSintoma[3] = nomeMedicamento.getText();
                dadosSintoma[4] = marcaMedicamento.getText();
                dadosSintoma[5] = frequenciaMedicamento.getText();
                dadosSintoma[6] = detalhe.getText();
                
                resposta = dados.inserirEditarSintoma(dadosSintoma);
                
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
        JOptionPane.showMessageDialog(null, "Paciente Cadastrado");
        //janela.dispose();
    }
    public void mensagemCadastroErro() {
    	JOptionPane.showMessageDialog(null, "Erro no Cadastro");
    	//janela.dispose();
    }
    public void mensagemDeletarConcluido(){
        JOptionPane.showMessageDialog(null, "Paciente Excluido");
        //janela.dispose();
    }

}
