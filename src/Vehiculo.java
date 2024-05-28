public class Vehiculo {
  public String marca;
  public int ano;

  public Vehiculo() {
  }

  public Vehiculo(String marca, int ano) {
    this.marca = marca;
    this.ano = ano;
  }

  @Override
  public String toString() {
    return "Vehiculo = {" +
            "marca:'" + marca + '\'' +
            ", ano:" + ano +
            '}';
  }
}
