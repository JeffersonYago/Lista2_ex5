package main;

import javax.swing.JOptionPane;

import controller.MDCController;

public class Principal {

	public static void main(String[] args) {
		MDCController mdcc = new MDCController();
		int a = Integer.parseInt(JOptionPane.showInputDialog("insira um numero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("insira um numero"));
		int res = mdcc.MDC(a,b);
		System.out.println(res);
	}

}
