package cenarios;

public class Possibilidade {
	
	public double otimista(double bom,double regular,double fraco){
		
		System.out.println("Soma do cenário otimista" );
		double cenarioOtimista= bom + regular + fraco;
		System.out.println(( float)cenarioOtimista);
		
		return cenarioOtimista;
	}
	
	public double neutro(double bom,double regular,double fraco){
	
		System.out.println("Soma do cenário neutro" );
		double cenarioNeutro = bom + regular + fraco;
		
		System.out.println((float)cenarioNeutro);
		
		return cenarioNeutro;
		
	}
	
	  public double pessimista(double bom, double regular, double fraco ){
		  System.out.println("Soma do cenário fraco" );
		  
		  double cenarioPessimista = bom + regular + fraco;
		  System.out.println((float)cenarioPessimista);
		  
		  return cenarioPessimista;
		  
	  }
	  
	  
	  public double desempenhoBom(double bomOtimo, double bomRegular,double bomFraco){
		  System.out.println("Soma de todos os  desempenhos Bons de todos os cenários " );
		  double desempenhoBom = bomOtimo + bomRegular + bomFraco;
		  System.out.println((float)desempenhoBom);
		  
		  return desempenhoBom;
	  } 
	
	  
	  public double desempenhoRegular(double regularOtimo,double regularNeutro, double regularFraco) {
		  System.out.println("Soma de todos os  desempenhos Regularares de todos os cenários " );
		  double desempenhoRegular = regularOtimo + regularNeutro + regularFraco ;
		  
		  System.out.println((float)desempenhoRegular);
		  
		  return desempenhoRegular;
	  }
	  
	  
	  
	  public double desempenhoFraco(double fracoBom,double fracoNeutro, double fracoPessimista) {
		  System.out.println("Soma de todos os  desempenhos Fracos de todos os cenários " );
		  double desempenhoFraco = fracoBom + fracoNeutro + fracoPessimista;
		  System.out.println((float)desempenhoFraco);
		  
		  return desempenhoFraco;
	  }
	  
	  
	  
}
