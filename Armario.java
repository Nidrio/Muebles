import java.util.ArrayList;

public class Mueble extends Armario{
  private String tipoPuertas;
  private int nBaldas;

//CONSTRUCTORES

public Armario(){
  super();
  this.tipoPuerta = "puerta corredera";
  this.nBaldas = 4;
}

public Armario(String material, Arraylist<Integer> dimensiones, String tipoPuerta, int nBaldas){
  super(material, dimensiones);
  this.tipoPuerta = tipoPuerta;
  this.nBaldas = nBaldas;
}



//Get

public String getTipoPuerta(){
  return this.tipoPuerta;
}

public int nBaldas(){
  return this.nBaldas;
}


//Set

public void setTipoPuerta(String tipoPuerta){
  this.tipoPuerta = tipoPuerta;
}

public void setNBaldas(int nBaldas){
  this.nBaldas = nBaldas;
}


//TO STRING

public String toString(){
  return super.toString() + ". El armario tiene " + this.tipoPuerta + " y tiene " + this.nBaldas + " baldas.";
}
}
