package exceptions;



import javax.swing.JOptionPane;

public class UncherkedException {
public static void main(String[] args) {
	
	boolean continueLooping = true;
	
	do {
		String a = JOptionPane.showInputDialog("Numerador: ");
		String b = JOptionPane.showInputDialog("Denominador: ");
		try {
		int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
		System.out.println("Resultado: " + resultado);
		continueLooping = false;
		
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro" + e.getLocalizedMessage());
			
		 } catch (ArithmeticException e) {
			 JOptionPane.showMessageDialog(null, "Número inválido, informe um número inteiro que não seja 0");
		 }
		
		finally {
			System.out.println("Chegou no finally");
		}
		
		
	} while(continueLooping);
	
	
	
	System.out.println("Chegou até aqui por que o exception foi tratado");
	
}

public static int dividir(int a , int b) {return a / b; }
}

//feito de propósito0 para estourar uma exception quando digitar uma string no lugar
// de number, sendo assim, vamos estudar as exceptions e também estamos cercando as possibilidades de exceptions