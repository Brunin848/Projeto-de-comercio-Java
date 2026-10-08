import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		ArrayList<Moveis> estoque = new ArrayList<>();
		Scanner Leitor = new Scanner(System.in);
		while (true) {
		System.out.println("-------- Fábrica de Móveis --------");
		System.out.println("1 - Cadastrar Produto(s)");
		System.out.println("2 - Excluir Produto(s)");
		System.out.println("3 - Listar Produto(s)");
		System.out.println("4 - Sair");
		System.out.println("Opção: ");
		
		int OpcaoMenu = Leitor.nextInt();
		
		if(OpcaoMenu == 1) {
			System.out.println("Que tipo de móvel será cadastrado?");
			System.out.println("1 - Guarda-Roupas");
			System.out.println("2 - Mesa");
			int TipoMovel = Leitor.nextInt();
			if(TipoMovel == 1) {
				
				GuardaRoupa guardaRoupa = new GuardaRoupa();
				
				guardaRoupa.OpcaoCapacidade();
				int CapacidadeEscolhida = Leitor.nextInt();
				guardaRoupa.setCapacidade(CapacidadeEscolhida);
				
				guardaRoupa.OpcaoPortas();
				int PortasEscolhida = Leitor.nextInt();
				guardaRoupa.setPortas(PortasEscolhida);
				
				guardaRoupa.OpcaoLarguraGuardaRoupas();
				int LarguraGEscolhida = Leitor.nextInt();
				guardaRoupa.setLargura(LarguraGEscolhida);
				
			
				guardaRoupa.OpcaoAlturaGuardaRoupas();
				int AlturaGEscolhida = Leitor.nextInt();
				guardaRoupa.setAltura(AlturaGEscolhida);
				
				estoque.add(guardaRoupa);
				
			} else if(TipoMovel == 2){
				Mesa mesa = new Mesa();
				
				mesa.OpcaoPessoas();
				int PessoasEscolhida = Leitor.nextInt();
				mesa.setPessoas(PessoasEscolhida);
				
				mesa.OpcaoFormato();
				int FormatoEscolhida = Leitor.nextInt();
				mesa.setFormato(FormatoEscolhida);
				
				mesa.OpcaoLarguraMesa();
				int LarguraMEscolhida = Leitor.nextInt();
				mesa.setLargura(LarguraMEscolhida);
				
				mesa.OpcaoAlturaMesa();
				int AlturaMEscolhida = Leitor.nextInt();
				mesa.setAltura(AlturaMEscolhida);
				
				estoque.add(mesa);
				
				
			} else {
				System.out.println("Opção inválida, escolha opções de 1 a 2.");
			}
			
				
		
		} else if(OpcaoMenu == 2) {
			
			System.out.println("Produtos cadastrados: " + estoque.size());

		    if(estoque.size() == 0) {
		        System.out.println("Não há produtos cadastrados para excluir!");
		    } else {
		        System.out.println("Produtos disponíveis:");

		        for(int Cont = 0; Cont < estoque.size(); Cont++) {

		            Moveis movel = estoque.get(Cont);

		            if(movel instanceof GuardaRoupa) {
		                System.out.println(Cont + " - Guarda-Roupas");
		            }

		            if(movel instanceof Mesa) {
		                System.out.println(Cont + " - Mesa");
		            }
		        }

			System.out.println("Qual Produto Será Excluido?");	
			
			int Remover = Leitor.nextInt();
			
			if(Remover < 0 || Remover >= estoque.size()) {
				System.out.println("Esse produto não existe! Vá para a opção 3 e verifique quantos móveis há disponíveis (de 0 a n)");
			} else {
			estoque.remove(Remover);
			}
			
		    }
			
		} else if(OpcaoMenu == 3) {
				
			System.out.println("Produtos No Estoque:");
		
			if(estoque.size() == 0) {
				System.out.println("Não há produtos no estoque ainda! Vá para a opção 1 e cadastre pelo menos 1 produto.");
			} 
			else {
				int TotalGuardaRoupas = 0;
				int TotalMesas = 0;
				
				for(int Cont = 0; Cont < estoque.size() ; Cont++) {
					
					Moveis movel = estoque.get(Cont);
					
					if(movel instanceof GuardaRoupa) {
						
						TotalGuardaRoupas++;
						
					}
					
					 if(movel instanceof Mesa) {
						
						TotalMesas++;
						
					}
					
				}
				
				
				System.out.println("====================================");
				
			for(int Cont = 0; Cont < estoque.size(); Cont++) {
				
				Moveis movel = estoque.get(Cont);
				if(movel instanceof GuardaRoupa) {
					GuardaRoupa guardaRoupa = (GuardaRoupa) movel;
					System.out.println("Móvel: Guarda-Roupas" );
					
					switch(guardaRoupa.getCapacidade()) {
					
					case 1: System.out.println("Capacidade: Pequeno");
					break;
					
					case 2: System.out.println("Capacidade: Médio");
					break;
					
					case 3: System.out.println("Capacidade: Grande");
					break;
					}
					
					switch(guardaRoupa.getPortas()) {
					
					case 1: System.out.println("Portas: 2");
					break;
					
					case 2: System.out.println("Portas: 4");
					break;
					
					case 3: System.out.println("Portas: 6");
					break;
					
					}
					
					switch(guardaRoupa.getLargura()) {
					
					case 1: System.out.println("Largura: 0,80m");
					break;
					
					case 2: System.out.println("Largura: 1,60m");
					break;
					
					case 3: System.out.println("Largura: 2,70m");
					break;
					
					}
					
					switch(guardaRoupa.getAltura()) {
					
					case 1: System.out.println("Altura: 1,80m");
					break;
					
					case 2: System.out.println("Altura: 2,20m");
					break;
					
					case 3: System.out.println("Altura: 2,40m");
					break;
					
					}
					
				}
				System.out.println("====================================");
			
				if(movel instanceof Mesa) {
					
					Mesa mesa = (Mesa) movel;
					System.out.println("Móvel: Mesa");
					
					switch(mesa.getPessoas()) {
					
					case 1: System.out.println("Pessoas: 2");
					break;
					
					case 2: System.out.println("Pessoas: 4");
					break;
					
					case 3: System.out.println("Pessoas: 6");
					break;
					}
					
					switch(mesa.getFormato()) {
					
					case 1: System.out.println("Formato: Quadrada");
					break;
					
					case 2: System.out.println("Formato: Redonda");
					break;
					
					case 3: System.out.println("Formato: Retangular");
					break;
					
					}
					
					switch(mesa.getLargura()) {
					
					case 1: System.out.println("Largura: 0,80m");
					break;
					
					case 2: System.out.println("Largura: 0,85m");
					break;
					
					case 3: System.out.println("Largura: 0,90m");
					break;
					
					}
					
					switch(mesa.getAltura()) {
					
					case 1: System.out.println("Altura: 0,70m");
					break;
					
					case 2: System.out.println("Altura: 0,75m");
					break;
					
					case 3: System.out.println("Altura: 0,80m");
					break;
					
					}

				}
				System.out.println("====================================");
			}
			System.out.println("Guarda-Roupas -> " + TotalGuardaRoupas);
			System.out.println("Mesas -> " + TotalMesas);
			}
			
		} else if(OpcaoMenu == 4) {
			System.out.println("Programa terminado.");
			break;
			
		} else {
			System.out.println("Opção inválida! Escolha números de 1 a 4.");
			
		}
		
	} 
		Leitor.close();
	}
	
}
 