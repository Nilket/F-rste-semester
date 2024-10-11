package Inheritance;

//Constructors
public class Menneske {
    private String name;
    private String ægtefælle;

  public Menneske(String name, String ægtefælle){
      this.name = name;
      this.ægtefælle = ægtefælle;
  }

  //Getters
  public String getName(){
      return this.name;
  }
  public String getÆgtefælle(){
      return this.ægtefælle;
  }

  //Setters
  public void setName(String name){
      this.name = name;
  }
  public void setÆgtefælle(String ægtefælle){
      this.ægtefælle = ægtefælle;
  }

  public String gifterSigMed(){
      return this.name + " gifter sig med " + this.ægtefælle;
  }

  public String bliverSkilt(){
      return this.name + " Bliver skilt med " + this.ægtefælle;
  }

}
