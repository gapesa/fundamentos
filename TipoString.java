package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("Boa"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		 
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSal�rio: " + salario + "\n\n" );
		
		
		System.out.printf("O senhor %s %s tem %d anos e ganha %f.",nome,sobrenome,idade,salario);
		
		
		
		
		
		
		
	}

}
