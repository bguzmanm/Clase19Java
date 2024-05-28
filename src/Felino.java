public class Felino extends Mamifero implements SonidoAnimal {
  public Felino() {
  }

  public Felino(String sexo, String nombre) {
    super(sexo, nombre);
  }

  public void maullar(){
    System.out.println("miau!! miaaaau!!");
  }

  @Override
  public void emitirSonido() {
    System.out.println("miau!! miaaaau!!");
  }
}
