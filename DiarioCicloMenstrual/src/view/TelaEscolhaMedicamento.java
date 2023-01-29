package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

/**
 * Classe referente a criação da tela de escolha de medicamento
 * @author Henrique Pucci
 * @since 2022
 *
 */
public class TelaEscolhaMedicamento implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle de Medicamento");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton comprimido = new JButton("Comprimido");
	private static JButton liquido = new JButton("Líquido");
	public static ControleDados dados = new ControleDados();
	private int opcao;
	
	/**
	 * Método que adiciona todos elementos visuais referentes a TelaEscolhaMedicamento
	 * 
	 */
	public TelaEscolhaMedicamento() {
		 
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBounds(285, 10, 600, 30);

		comprimido.setBounds(355, 70, 140, 100);
		liquido.setBounds(170, 70, 140, 100);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(comprimido);
		janela.add(liquido);
		
		
		janela.setSize(700, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

		comprimido.addActionListener(this);
		liquido.addActionListener(this);
		 
	}
	
	/**
	 * Método de ativação da ação nos botões presentes
	 * @param e evento de clique
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 *
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == comprimido) { // chama tela lista de comprimidos
			janela.dispose();
			new TelaListaMedicamentos().mostrarDados(dados, 1);
			
		}
		if(src == liquido) { // chama tela lista de liquidos
			new TelaListaMedicamentos().mostrarDados(dados, 2);
			
		}
		
	}
		
	
}