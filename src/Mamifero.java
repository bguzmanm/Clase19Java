public class Mamifero {

  public String sexo;
  public int patas;
  public String color;
  public String nombre;
  public String especie;
  public Mamifero() {

  }

  public Mamifero(String sexo, String nombre) {
    this.sexo = sexo;
    this.nombre = nombre;
  }

  public Mamifero(String sexo, int patas, String color, String nombre) {
    this.sexo = sexo;
    this.patas = patas;
    this.color = color;
    this.nombre = nombre;
  }

  public void amamantar(){
    System.out.printf("%s está amamantando\n", nombre);
  }

  public void gestar(){
    System.out.printf("%s está gestando\n", nombre);
  }

}
