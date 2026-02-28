package Trabalho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		 System.out.println("Digite o valor da moeda: ");
	        double valor = scanner.nextDouble();
	        
	        //países escolhidos
	        System.out.print("Digite o país da moeda (USA, CH, BR): ");
	        String país = scanner.next().toUpperCase();
	        
	        //metodo de conversao
	        Moedas moeda = new Moedas(valor, país);
	        double valorconvertido = moeda.converterParaReal();
	        
	        System.out.println("valor convertido: R$" + valorconvertido);
	
	        Cofre cofre = new Cofre();
	        int opcao;
	        do {
	        	System.out.println("/M... Menu do Cofre");
	        	System.out.println("1 Acrescentar Moedas");
	        	System.out.println("2 Subtrair Moedas");
	        	System.out.println("3 Calcular total");
	        	System.out.println("Sair");
	        	System.out.println("Escolha uma opção");
	        	
	        	opcao = scanner.nextInt();
	        	scanner.nextLine();
	        	
	        	switch (opcao) {
	        	case 1:
	        		System.out.println("Digite o valor da moeda");
	        		double Valor = scanner.nextDouble();
	        		scanner.nextLine();
	        		System.out.println("Digite o país da moeda (USA CH BR):");
	        		String País = scanner.nextLine().toUpperCase();
	        		
	        		Moedas novaMoeda = new Moedas(valor,país);
	        		cofre.acrescentarMoedas(novaMoeda);
	        		System.out.printf("valor convertido: R$.2f/M", novaMoeda.converterParaReal());
	        		break;
	        		
	        	case 2:
	        		System.out.println("Digite o valor da moeda a ser removida:");
	        		double valorRemover = scanner.nextDouble();
	        		scanner.nextLine();
	        		System.out.println("Digite o país da moeda (USA CH BR):");
	        		String paísRemover = scanner.nextLine().toUpperCase();
	        		
	        		if (cofre.removerMoedas(valorRemover, paísRemover)) {
	        			System.out.println("Moeda removida com sucesso!");
	        		}else {
	        			System.out.println("Moeda não encontrada!");
	        		}
	        		break;
	        		
	        	case 3: double total = cofre.calcularTotal();
	        			System.out.printf("Total no cofre: R$.2f/M", total);
	        			break;
	        	case 4:
	        		System.out.println("Saindo do sistema....");
	        		break;
	        		
	        		default:
	        			System.out.println("Opçaõ invalida");        
	        	}
	        }while(opcao != 4);
	        scanner.close();
	}
}
	        	
	        		