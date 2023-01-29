package view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;
import controle.*;
import modelo.*;

/**
 * Classe referente a criação da tela de escolha de Diário
 * @author Estevão e Rhumenigue
 * @since 2023
 * @version 1.0
 *
 */
public class TelaEscolhaDiario implements ActionListener {
	
	private JFrame janela = new JFrame("Controle do Diario");
	private JLabel titulo = new JLabel("Menu");
	private JButton ciclo = new JButton("Ciclo");
	private JButton voltar = new JButton("Voltar");
	private static JButton sintoma = new JButton("Sintoma");
	public static ControleDados dados = new ControleDados();
	private int opcao;
	
	/**
	 * Método que adiciona todos elementos visuais referentes a TelaEscolhaDiario
	 * 
	 */
	public TelaEscolhaDiario() {
		 
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBounds(280, 80, 600, 30);

		ciclo.setBounds(360, 200, 100, 80);
		sintoma.setBounds(190, 200, 100, 80);
		voltar.setBounds(20, 20, 70, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(ciclo);
		janela.add(sintoma);
		janela.add(voltar);
		
		
		janela.setSize(670, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

		ciclo.addActionListener(this);
		voltar.addActionListener(this);
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
		
		if(src == ciclo) { // chama tela lista de ciclos
			janela.dispose();
			new TelaListaDiario().mostrarDados(dados, 1);
			
		}
		if(src == sintoma) { // chama tela lista de sintomas
			new TelaListaDiario().mostrarDados(dados, 2);
			
		}
		 if(src == voltar){
				janela.dispose();
				new TelaMenu().mostrarDados(dados, 1);
				// volta para a tela anterior
			}
		
	}

	public void mostrarDados(ControleDados dados2, int i) {
		// TODO Stub de método gerado automaticamente
		
	}
		
	
}