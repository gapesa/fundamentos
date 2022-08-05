package fundamentos;

import java.util.Scanner;

public class Desafiocalculadora {
   public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe um número: ");
	double num = entrada.nextDouble(); 
	
	System.out.println("Informe um número: ");
	double num1 = entrada.nextDouble();
	
	System.out.println("Informe a operação; ");
	String op = entrada.next();
	
	double resultado = "+".equals(op) ? num + num1: 0;
	resultado = "-".equals(op) ? num - num1: resultado;
	resultado = "*".equals(op) ? num * num1 : resultado;
	resultado = "/".equals(op) ? num / num1 : resultado;
	resultado =	"%".equals(op) ? num % num1 : resultado;
	
	System.out.printf("%.2f %s %.2f = %.2f", num , op, num1 , resultado);
	
	entrada.close();
	
	
	
}
}
