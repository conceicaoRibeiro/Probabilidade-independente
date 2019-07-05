package cenarios;

public class Executando {

	public static void main(String[] args) {
	
		
		Possibilidade cenarios = new Possibilidade();
		
		cenarios.otimista(0.24, 0.12, 0.04); 
		
		cenarios.neutro(0.06, 0.08, 0.06);
		
		cenarios.pessimista(0.08, 0.12, 0.20);
		System.out.println(" ");
		
		cenarios.desempenhoBom(0.24, 0.06, 0.08);
		cenarios.desempenhoRegular(0.12, 0.08, 0.12);
		cenarios.desempenhoFraco(0.04, 0.06, 0.20);
		
		
	}

}
