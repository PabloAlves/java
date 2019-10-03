import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class IMC {

	public double calculaIMC(double peso, double altura) {

		double imc = peso / (altura * altura);
	
		BigDecimal bd = new BigDecimal(imc).setScale(2, RoundingMode.HALF_EVEN);
		return bd.doubleValue();	
	}
	
	public String faixaIMC(double imc) {
		String resposta = "";
		
		if (imc < 18.5) resposta = "Abaixo do peso";
		else if (imc >= 18.5 && imc <= 24.9) resposta = "Peso Normal";
		else if (imc >= 25 && imc <= 29.9) resposta = "Sobrepeso";
		else if (imc >= 30 && imc <= 34.9) resposta = "Obesidade grau 1";
		else if (imc >= 35 && imc <= 39.9) resposta = "Obesidade grau 2";
		else if (imc >= 40) resposta = "Obesidade grau 3";
		
		return resposta;
	}
	
	public static void main(String[] args) {
		//opcao ok, x e cancelar das caixas
		IMC calculadoraIMC = new IMC();
		JFrame frame = new JFrame();
		int reply;
		
		do{
			String resp1 = JOptionPane.showInputDialog(frame, "Digite seu peso (kg)", "Peso", JOptionPane.PLAIN_MESSAGE);
			String resp2 = JOptionPane.showInputDialog(frame, "Digite sua altura (m)", "Altura", JOptionPane.PLAIN_MESSAGE);
		
			double peso = Double.parseDouble(resp1);
			double altura = Double.parseDouble(resp2);
			
			double imc = calculadoraIMC.calculaIMC(peso, altura);
			String faixa = calculadoraIMC.faixaIMC(imc);
			
			JOptionPane.showMessageDialog(frame, "IMC : " + imc + "\n" + faixa, "IMC", JOptionPane.INFORMATION_MESSAGE);
		
			reply = JOptionPane.showConfirmDialog(null, "Calcular novamente?", "Continuar", JOptionPane.YES_NO_OPTION);
					
		}while(reply == JOptionPane.YES_OPTION);
	}
}
