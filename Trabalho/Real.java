package Trabalho;

public class Real extends Moedas {

	public Real(double valor, String país) {
		super(valor, país);	   
	}
    public double getvalor() {
    	return valor; 
    }
    public String getpaís() {
    	return "Brasil";
    }
}
