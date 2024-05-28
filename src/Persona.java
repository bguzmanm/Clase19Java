public class Persona {

  public String nombre;
  public int edad;
  public String genero;
  public float peso;
  public float estatura;

  public Persona() {
  }

  public Persona(String nombre, int edad, String genero, float peso, float estatura) {
    this.nombre = nombre;
    this.edad = edad;
    this.genero = genero;
    this.peso = peso;
    this.estatura = estatura;
  }

  public float calcularIMC(){
    return (peso / (estatura*estatura));
  }

  public void interpretarIMC(){
    float imc = calcularIMC();

    if (imc < 18.5){
      System.out.printf("%s tiene un peso inferior al normal\n", nombre);
    } else if (imc <=24.9 && imc >= 18.5) {
      System.out.printf("%s tiene un peso normal\n", nombre);
    } else if (imc<29.9 && imc > 25) {
      System.out.printf("%s tiene sobrepeso\n", nombre);
    } else if (imc>30) {
      System.out.printf("%s tiene obesidad\n", nombre);
    }

  }
}
