import java.io.*;

class moteur{
	private String marque;		
	private int nbCylindre;		
	private double volume;
	
	public String getMarque(){	
		return marque;		 
	} 
	public int getnbCylindre(){
		return nbCylindre;
	}  
	public double getVolume(){
		return volume;
	}
	public void setMarque(String a){
		marque=a;
	}
	public void setnbCylindre(int b){
		nbCylindre=b;
	}
	public void setVolume(double c){
		volume=c;
	}
}

public class TestMoteur{
	public static void main(String[] args){
		moteur v8 = new moteur();
		v8.nbCylindre = 8;
		v8.setMarque("BMW");
		v8.setnbCylindre(6);
		v8.setVolume(3.2);
		System.out.println(v8.getMarque()+" " + v8.getnbCylindre()+ " " + v8.getVolume());
	}
}
