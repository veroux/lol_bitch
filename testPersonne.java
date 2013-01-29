import java.io.*;

class personne{
  private String nom;
  private int age;
  
  public void Init(String n, int a){
    this.nom = n;
    this.age = a;
  

  }

  public void Affiche(){
    System.out.println("Le nom est : " + nom + " et l'age est : "+ age);
   }
}
public class testPersonne{
  public static void main(String[] args){
   personne guy = new personne();
   guy.Init("Guy",54);
   guy.Affiche();
  
  }


}