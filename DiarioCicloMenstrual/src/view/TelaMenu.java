 package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

/**
 * Classe referente a criação da tela principal do sistema 
 * @author Henrique Pucci
 * @since 2022
 *
 */
public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle de Medicamento");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton medicamento = new JButton("Medicamentos");
//	private static JButton paciente = new JButton("Pacientes");
	public static ControleDados dados = new ControleDados();
	private static JButton ciclo = new JButton("Ciclos");

	
	/**
	 * Método que adiciona todos elementos visuais referentes a TelaMenu
	 * 
	 */
	public TelaMenu() { // layout do menu principal
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBounds(285, 10, 600, 30);
		medicamento.setBounds(355, 70, 140, 100);
		ciclo.setBounds(170, 70, 140, 100);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(ciclo);
		janela.add(medicamento);
		
		
		janela.setSize(700, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	/**
	 * Método Main do sistema
	 * @param args
	 * 
	 */
	public static void main(String[] args) { // funcao main do sistema
		TelaMenu menu = new TelaMenu();
		
		//aqui eu mudei paciente por ciclo - rhumenigue
		ciclo.addActionListener(menu);
		medicamento.addActionListener(menu);
	}
	
	/**
	 * Método de ativação da ação nos botões presentes
	 * @param e evento de clique
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 *
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//aqui eu mudei paciente por ciclo - rhumenigue

		if(src == ciclo){
			janela.dispose();
			new TelaListaCiclo().mostrarDados(dados);
			// chama a tela que lista os ciclos cadastrados
		}

		if(src == medicamento) {
			janela.dispose();
			new TelaEscolhaMedicamento();
			
		}	// chama a tela de escolha do tipo de medicamentos
	}
		
}
