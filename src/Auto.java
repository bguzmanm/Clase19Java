public class Auto extends Vehiculo {

  public int puertas;

  public Auto() {
  }

  public Auto(String marca, int ano, int puertas) {
    super(marca, ano);
    this.puertas = puertas;
  }

  @Override
  public String toString() {
    return "Auto = {" +
            "puertas:" + puertas +
            ", marca:'" + marca + '\'' +
            ", ano:" + ano +
            '}';
  }
}
