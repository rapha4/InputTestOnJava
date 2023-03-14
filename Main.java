import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		char genero1, genero2;
		double salario1, salario2;
		
		// ------ Coletando dados da primeira pessoa
		System.out.print("Digite o nome da primeira pessoa: ");
		nome1 = sc.nextLine();
		System.out.print("Digite a idade da primera pessoa: ");
		idade1 = sc.nextInt();
		System.out.print("Digite o genero da primeira pessoa: ");
		genero1 = sc.next().charAt(0);
		System.out.print("Digite o salario da primeira pessoa: ");
		salario1 = sc.nextDouble();
		
		// ------- Coletando dados da segunda pessoa
		System.out.println();
		System.out.print("Digite o nome da segunda pessoa: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.print("Digite a idade da segunda pessoa: ");
		idade2 = sc.nextInt();
		System.out.print("Digite o genero da segunda pessoa: ");
		genero2 = sc.next().charAt(0);
		System.out.print("Digite o salario da segunda pessoa: ");
		salario2 = sc.nextDouble();
		
		sc.close();
		
		// -------- Realizando output
		System.out.println();
		System.out.println("Dados da primeira pessoa: ");
		System.out.println(nome1);
		System.out.println(idade1 + " anos");
		System.out.println("Genero: " + genero1);
		System.out.println("Salario: " + String.format("%.2f", salario1));
		System.out.println();
		System.out.println("Dados da segunda pessoa: ");
		System.out.println(nome2);
		System.out.println(idade2 + " anos");
		System.out.println("Genero: " + genero2);
        System.out.println("Salario: " + String.format("%.2f", salario2));
	}

}
