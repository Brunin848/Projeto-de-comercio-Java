
public class Moveis {
private int Largura = 0;
private int Altura = 0;
public int getLargura() {
	return Largura;
}
public void setLargura(int largura) {
	Largura = largura;
}
public int getAltura() {
	return Altura;
}
public void setAltura(int altura) {
	Altura = altura;
}
void OpcaoLarguraGuardaRoupas() {
System.out.println("Qual é a largura?");
System.out.println("1 - 0,80m");
System.out.println("2 - 1,60m");
System.out.println("3 - 2,70m");
}

void OpcaoAlturaGuardaRoupas() {
System.out.println("Qual é a altura?");
System.out.println("1 - 1,80m");
System.out.println("2 - 2,20m");
System.out.println("3 - 2,40m");

	}

void OpcaoLarguraMesa() {
	System.out.println("Qual é a largura?");
	System.out.println("1 - 0,80m");
	System.out.println("2 - 0,85m");
	System.out.println("3 - 0,90m");

}

void OpcaoAlturaMesa() {
	System.out.println("Qual é a altura?");
	System.out.println("1 - 0,70m");
	System.out.println("2 - 0,75m");
	System.out.println("3 - 0,80m");
}

}
