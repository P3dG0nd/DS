import javax.swing.JOptionPane;

public class somaPOO {
	
	
	//Atributos
    double numero1,numero2;
	double resultado;
	
	
	 //metodo para solicitar numeros
	 public void solicitarNumeros()
	 {
		 
		numero1 = Double.parseDouble(JOptionPane.showInputDialog
				("Digite o 1 numero")) ;
		
		
		numero2 = Double.parseDouble(JOptionPane.showInputDialog
				(null,"Digite o 2 numero",
						JOptionPane.QUESTION_MESSAGE)) ;
		
		 
	 }
	
	 //m�todo n�o pode ser void para calcular soma
	 public double somar()
	 {
		 
		 resultado = numero1+numero2;
		 
		 //obrigat�rio retornar informa��o
		 return resultado;	 
	 }
	 
	 //metodo para exibir
	 public void exibir() {
		 
JOptionPane.showMessageDialog(null,"O resultado da soma �" +
resultado);
	 }
	

}
