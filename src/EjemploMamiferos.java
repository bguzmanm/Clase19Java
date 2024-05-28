public class EjemploMamiferos {
  public static void main(String[] args) {

    Mamifero adefesio = new Mamifero("hembra", "lupita");

    adefesio.gestar();
    adefesio.amamantar();

    Canino perrito1 = new Canino("hembra", "jalizco");

    perrito1.gestar();
    perrito1.amamantar();
    perrito1.emitirSonido();


    Felino gato = new Felino("macho", "oregano");

    gato.gestar();
    gato.amamantar();
    gato.emitirSonido();

  }
}