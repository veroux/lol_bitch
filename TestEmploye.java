import java.io.*;

class employe{
	private String nom;
	private int numero;
	
	public void init(String a, int b){
		nom = a; 
		numero = b;
	}
	public String getNom(){
		return nom;
	}
	public int getNumero(){
		return numero;
	}
}
public class TestEmploye{
	public static void main(String[]args){
		employe louis = new employe();
		louis.init("Louis", 71);
		System.out.println("Le nom est:" + louis.getNom() + "numero : " + louis.getNumero());
	}


}