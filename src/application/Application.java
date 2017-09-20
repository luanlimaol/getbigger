package application;

import java.util.ArrayList;
import java.util.Scanner;
import beans.Exercicio;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();
		
		int option = 0;
		while (option == 0) {
			
			//Falta a opção de editar
			System.out.println("### Getbigger ### \n");
			System.out.println("1 - Cadastrar exercício");
			System.out.println("2 - Editar exercício");
			System.out.println("3 - Remover exercício");
			System.out.println("4 - Exibir exercícios");
			System.out.println("0 - Sair \n");
			
			System.out.println("Informe a opção: ");
			
			switch (scanner.nextInt()) {
			case 0:
				option = -1;
				break;
			case 1:
				System.out.println("");
				System.out.println("> Cadastrar exercício");
				Exercicio exercicioCad = new Exercicio();
				
				//Falta informar o grupo muscular
				
				exercicioCad.setId(exercicios.size() + 1);
				
				System.out.println("Descrição: ");
				exercicioCad.setDescricao(scanner.nextLine());
				exercicioCad.setDescricao(scanner.nextLine());
				
				System.out.println("Série: ");
				exercicioCad.setSerie(scanner.nextInt());
				
				System.out.println("Repetições: ");
				exercicioCad.setRepeticoes(scanner.nextInt());
				
				System.out.println("Carga: ");
				exercicioCad.setCarga(scanner.nextInt());
				
				System.out.println("Observação: ");
				exercicioCad.setObservacao(scanner.nextLine());
				exercicioCad.setObservacao(scanner.nextLine());
				
				exercicios.add(exercicioCad);
				System.out.println("\nSalvo\n");
				
				break;
			case 3:
				System.out.println("");
				System.out.println("> Remover exercício");
				
				for (Exercicio exercicio1 : exercicios){
					System.out.println("Exercício N° "+ exercicio1.getId() + " - " + exercicio1.getDescricao());
				}
				
				System.out.println("");
				System.out.println("Informe o código do exercício que deseja remover: ");
				exercicios.remove(scanner.nextInt() - 1);
				
				System.out.println("\nRemovido\n");
				
				break;
			case 4:
				System.out.print("\n> Exibir exercícios \n");
				
				for (Exercicio exercicio2 : exercicios){
					System.out.println(exercicio2);
				}
				
				System.out.print("\n");
				
				break;
			default:
				System.out.print("Comando inválido");
				
				break;
			}
		}
		
		scanner.close();
		
	}

}
