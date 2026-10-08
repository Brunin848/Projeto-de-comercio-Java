

public class GuardaRoupa extends Moveis {
private int Capacidade = 0;  //Tamanho do guarda-roupas dentro
private int Portas = 0;     

public int getCapacidade() {
	return Capacidade;
}

public void setCapacidade(int capacidade) {
	Capacidade = capacidade;
}

public int getPortas() {
	return Portas;
}

public void setPortas(int portas) {
	Portas = portas;
}


	
	void OpcaoCapacidade(){
		System.out.println("Qual é a capacidade?");
		System.out.println("1 - Pequeno");
		System.out.println("2 - Médio");
		System.out.println("3 - Grande");
	}
	
	
	
	void OpcaoPortas() {
	System.out.println("Quantas portas tem?");
	System.out.println("1 - Duas");
	System.out.println("2 - Quatro");
	System.out.println("3 - Seis");
	}
	
	
	
}



