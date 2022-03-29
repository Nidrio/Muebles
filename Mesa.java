public class Mueble extends Mesa{
    private int nPatas;


  public Mesa(){
  this.nPatas = "4"
  }

  public int getnPatas(int nPatas){
    return this.nPatas;
  }

  public void setnPatas(int nPatas){
    this.dimensiones = new ArrayList<Integer> (Arrays.asList(ancho,profundo,alto));
    }

}
