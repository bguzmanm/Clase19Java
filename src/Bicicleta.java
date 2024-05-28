public class Bicicleta extends Vehiculo {
  public String tipo;

  public Bicicleta() {
  }

  public Bicicleta(String marca, int ano, String tipo) {
    super(marca, ano);
    this.tipo = tipo;
  }


  @Override
  public String toString() {
    return "Bicicleta = {" +
            "tipo:'" + tipo + '\'' +
            ", marca:'" + marca + '\'' +
            ", ano:" + ano +
            '}';
  }
}
