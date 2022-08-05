package fundamentos;

import java.util.Scanner;

public class Wrappers {
     //comida 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner entrada = new Scanner(System.in);
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt(entrada.nextLine()); //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(i * 3);
		System.out.println(i / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
		
		entrada.close();
		
	}

}
