package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.ControleDados;
import controle.ControleUsuario;
import controle.ControleCiclo;


public class TelaFuncoes implements ListSelectionListener {		
	
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroAluno;
	private JButton refreshAluno;
	private JButton cadastroProf;
	private JButton refreshProf;
	private static ControleDados dados;
	private JList<String> listaAlunosCadastrados;
	private JList<String> listaProfsCadastrados;
	private String[] listaNomes = new String[50];
	private JLabel labelNome = new JLabel("Nome: ");
	private JLabel labelSexo = new JLabel("Sexo: ");
	private JLabel labelDataNasc = new JLabel("Data de Nacimento: ");
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	public void mostrarDados(ControleDados d, int op){
		dados = d;

		switch (op) {
		case 1:
			listaNomes = new ControleUsuario(dados).getNomeUsuario();
			listaAlunosCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Usuario");
			titulo = new JLabel("Usuario Cadastrado");
			cadastroAluno = new JButton("Cadastrar");
			refreshAluno = new JButton("Cancelar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(150, 10, 250, 30);
			listaAlunosCadastrados.setBounds(20, 50, 400, 90);
			listaAlunosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaAlunosCadastrados.setVisibleRowCount(10);

			cadastroAluno.setBounds(70, 177, 100, 30);
			refreshAluno.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaAlunosCadastrados);
			janela.add(cadastroAluno);
			janela.add(refreshAluno);

			janela.setSize(500, 400);
			janela.setVisible(true);

			listaAlunosCadastrados.addListSelectionListener(this);

			break;

		case 2:
			listaNomes = new ControleCiclo(dados).getNomeCiclo();
			listaProfsCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Ciclo");
			titulo = new JLabel("Ciclo Cadastrado");
			cadastroProf = new JButton("Cadastrar");
			refreshProf = new JButton("Cancelar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaProfsCadastrados.setBounds(20, 50, 400, 30);
			listaProfsCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaProfsCadastrados.setVisibleRowCount(10);


			cadastroProf.setBounds(70, 177, 100, 30);
			refreshProf.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaProfsCadastrados);
			janela.add(cadastroProf);
			janela.add(refreshProf);

			janela.setSize(500, 400);
			janela.setVisible(true);

			listaProfsCadastrados.addListSelectionListener(this);
			break;

		default:
			JOptionPane.showMessageDialog(null,"Op��o n�o encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}
	//Captura eventos relacionados aos botões da interface
		public void actionPerformed1(ActionEvent e) {
			Object src = e.getSource();
			
			//Cadastro de novo aluno
			if(src == cadastroAluno)
				new TelaView().inserirEditar(1, dados, this, 0);

			//Cadastro de novo professor
			if(src == cadastroProf)
				new TelaView().inserirEditar(2, dados, this, 0);

			// Atualiza a lista de nomes de alunos mostrada no JList
			if(src == refreshAluno) {
				listaAlunosCadastrados.setListData(new ControleUsuario(dados).getNomeUsuario());			
				listaAlunosCadastrados.updateUI();
			}

			// Atualiza a lista de nomes de professores mostrada no JList
			if(src == refreshProf) {
				listaProfsCadastrados.setListData(new ControleCiclo(dados).getNomeCiclo());
				listaProfsCadastrados.updateUI();
			}

		}


	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaAlunosCadastrados) {
			new TelaView().inserirEditar(3, dados, this, 
					listaAlunosCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaProfsCadastrados) {
			new TelaView().inserirEditar(4, dados, this, 
					listaProfsCadastrados.getSelectedIndex());
		}
	}
}