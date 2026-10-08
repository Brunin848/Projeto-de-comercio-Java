
public class Mesa extends Moveis {
private int Pessoas = 0;  //Quantas pessoas podem usar a mesa
private int Formato;  // Se é quadrada ou redonda


public int getPessoas() {
	return Pessoas;
}

public void setPessoas(int pessoas) {
	Pessoas = pessoas;
}

public int getFormato() {
	return Formato;
}

public void setFormato(int formato) {
	Formato = formato;
}

void OpcaoPessoas() {
	
	System.out.println("Quantas pessoas podem usa-la?");
	System.out.println("1 - 2");
	System.out.println("2 - 4");
	System.out.println("3 - 6");
	}
	
void OpcaoFormato() {
		
	System.out.println("Qual é o formato dela?");
	System.out.println("1 - Quadrada");
	System.out.println("2 - Redonda");
	System.out.println("3 - Retangular");
	
	
	
	}
}
