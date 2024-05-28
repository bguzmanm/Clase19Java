public class Canino extends Mamifero implements SonidoAnimal {

  public Canino(String sexo, String nombre) {
    super(sexo, nombre);
  }

  public void ladrar() {
    System.out.println("woff woff!!");
  }

  @Override
  public void emitirSonido() {
    System.out.println("woff woff!!");
  }
}
