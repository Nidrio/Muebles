class Main{
  public static void main(String[] args){
    Mueble mesa = new Mueble();
    System.out.println(mesa);
    mesa.setMaterial("Acero");
    mesa.setDimensiones(12, 32, 21);
    System.out.println(mesa);
    mesa.Superficie(50,20);
    }
}
