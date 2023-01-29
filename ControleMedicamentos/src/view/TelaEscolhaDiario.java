package view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;
import controle.*;
import objetos.*;

/**
 * Classe referente a criação da tela de escolha de medicamento
 * @author Henrique Pucci
 * @since 2022
 *
 */
public class TelaEscolhaDiario implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle de Medicamento");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton ciclo = new JButton("Ciclo");
	private static JButton sintoma = new JButton("Sintoma");
	public static ControleDados dados = new ControleDados();
	private int opcao;
	
	/**
	 * Método que adiciona todos elementos visuais referentes a TelaEscolhaMedicamento
	 * 
	 */
	public TelaEscolhaDiario() {
		 
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBounds(285, 10, 600, 30);

		ciclo.setBounds(355, 70, 140, 100);
		sintoma.setBounds(170, 70, 140, 100);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(ciclo);
		janela.add(sintoma);
		
		
		janela.setSize(700, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

		ciclo.addActionListener(this);
		sintoma.addActionListener(this);
		 
	}
	
	/**
	 * Método de ativação da ação nos botões presentes
	 * @param e evento de clique
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 *
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == ciclo) { // chama tela lista de comprimidos
			janela.dispose();
			new TelaListaDiario().mostrarDados(dados, 1);
			
		}
		if(src == sintoma) { // chama tela lista de liquidos
			new TelaListaDiario().mostrarDados(dados, 2);
			
		}
		
	}
		
	
}