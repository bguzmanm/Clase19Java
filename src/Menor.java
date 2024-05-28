public class Menor extends Persona{

  public Menor(String nombre, int edad, String genero, float peso, float estatura) {
    super(nombre, edad, genero, peso, estatura);
  }

  public void jugarALaPelota(){
    System.out.printf("%s juega a la pelota\n", nombre);
  }

  @Override
  public void interpretarIMC() {
    float imc = calcularIMC();

    /** Esta tabla de interpretación NO ES REAL, ES SOLO PARA EFECTOS DE ENTENDER EL OVERRRIDE */

    if (imc < 20){
      System.out.printf("%s tiene un peso inferior al normal\n", nombre);
    } else if (imc <=30) {
      System.out.printf("%s tiene un peso normal\n", nombre);
    } else if (imc<34.9) {
      System.out.printf("%s tiene sobrepeso\n", nombre);
    } else if (imc>35) {
      System.out.printf("%s tiene obesidad\n", nombre);
    }
  }
}
