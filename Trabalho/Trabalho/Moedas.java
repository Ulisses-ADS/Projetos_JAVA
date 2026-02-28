package Trabalho;

@SuppressWarnings("ALL")
public class Moedas {
	//moedas BR,EUA,CH
    public double valor;
    public String país;
    
    public Moedas(double valor, String país)
    {
    	this. valor = valor;
    	this. país = país;
   
    }
    public double getvalor() {
    	return valor;
    }
    
    public String getpaís() {
    	return país;
    }
    //método de conversão
    public double converterParaReal() {
    	switch (país) {
    	case "USA":
    		return valor *5.73;
    	case "CH":
    	    return valor *6.49;
    	case "BR":
    		return valor; //não convverte
    		
    		default:
    			System.out.println("não converte" + país);
    			return 0;
    	    
    	    }
    }

    public void getPaís() {

		int i = 0;
    }

	public int getPaÃ­s() {
		return Integer.parseInt(país);
	}
}