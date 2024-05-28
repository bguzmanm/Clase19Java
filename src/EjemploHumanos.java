public class EjemploHumanos {
  public static void main(String[] args) {
    Persona p = new Persona("Juanito", 45, "Masculino", 76.8f, 1.75f);

    System.out.printf("%s tiene un IMC de %f\n", p.nombre, p.calcularIMC());

    p.interpretarIMC();

    //Menor cabroChico = new Menor("Tatayaya", 12, "Masculino", 40, 1.05f);
    Menor cabroChico = new Menor("Tatayaya", 12, "Masculino", 76.8f, 1.75f);

    System.out.printf("%s tiene un IMC de %f\n", cabroChico.nombre, cabroChico.calcularIMC());

    cabroChico.interpretarIMC();


  }
}
