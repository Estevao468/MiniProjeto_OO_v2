package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class TelaFuncoes implements ActionListener, ListSelectionListener {		
	
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
		case 1:// Mostrar dados de alunos cadastrados (JList)
			listaNomes = new ControleUsuario(dados).getNomeUsuario();
			listaAlunosCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Usuario");
			titulo = new JLabel("Usuario Cadastrado");
			cadastroAluno = new JButton("Cadastrar");
			refreshAluno = new JButton("Cancelar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaAlunosCadastrados.setBounds(20, 50, 350, 120);
			listaAlunosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaAlunosCadastrados.setVisibleRowCount(10);

			cadastroAluno.setBounds(70, 177, 100, 30);
			refreshAluno.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaAlunosCadastrados);
			janela.add(cadastroAluno);
			janela.add(refreshAluno);

			janela.setSize(900, 700);
			janela.setVisible(true);

			cadastroAluno.addActionListener(this);
			refreshAluno.addActionListener(this);
			listaAlunosCadastrados.addListSelectionListener(this);

			break;

		case 2:// Mostrar dados de professores cadastrados (JList)
			listaNomes = new ContoleCiclo(dados).getNomeCiclo();
			listaProfsCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Ciclo");
			titulo = new JLabel("Ciclo Cadastrado");
			cadastroProf = new JButton("Cadastrar");
			refreshProf = new JButton("Cancelar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaProfsCadastrados.setBounds(20, 50, 350, 120);
			listaProfsCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaProfsCadastrados.setVisibleRowCount(10);


			cadastroProf.setBounds(70, 177, 100, 30);
			refreshProf.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaProfsCadastrados);
			janela.add(cadastroProf);
			janela.add(refreshProf);

			janela.setSize(900, 700);
			janela.setVisible(true);

			cadastroProf.addActionListener(this);
			refreshProf.addActionListener(this);
			listaProfsCadastrados.addListSelectionListener(this);
			break;

		default:
			JOptionPane.showMessageDialog(null,"Op��o n�o encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Stub de método gerado automaticamente
		
	}

}