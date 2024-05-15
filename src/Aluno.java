import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {

	    ArrayList<Integer> notas = new ArrayList<Integer>();
	    
	    System.out.println("********** Sistema do Professor **********");
	    
		for(int i = 1; i <5; i++) {
			Scanner teclado =  new Scanner(System.in);
			System.out.print("Dígite a " + i + "º nota: ");
			int nota = teclado.nextInt();
			notas.add(nota);
		}
		
		int nota1 = notas.get(0);
		int nota2 = notas.get(1);
		int nota3 = notas.get(2);
		int nota4 = notas.get(3);
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("*********************************");
		
		System.out.println("A média do aluno é: " + media);

		
		if(media >= 7) {
			System.out.println("Aluno Aprovado");
		} else if (media >=5) {
			System.out.println("Aluno em Recuperação");
		} else if (media >= 0 && media <=5) {
			System.out.println("Aluno Reprovado");
		} else {
			System.out.println("Média inválida");
		}

		System.out.println("*********************************");
		
		
		
	}

}
