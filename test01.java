//Véronique Blais
//importation des packages(Librairies)
//int num = Integer.parseInt(reponse)

import java.io.*;

public class test01{
  public static void main(String[] args){
    try{
    
    BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Entrer quelque chose");
    String reponse = clavier.readLine();
   // int num = Integer.parseInt(reponse);
    System.out.println("vous avez entre: "+ reponse);
 
  }catch(Exception e){
    System.exit(1);
   }

 
  }


}