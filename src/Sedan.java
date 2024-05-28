public class Sedan extends Auto {
  public int litrosMaletero;

  public Sedan() {
  }

  public Sedan(String marca, int ano, int puertas, int litrosMaletero) {
    super(marca, ano, puertas);
    this.litrosMaletero = litrosMaletero;
  }

  @Override
  public String toString() {
    return "Sedan = {" +
            "litrosMaletero:" + litrosMaletero +
            ", puertas:" + puertas +
            ", marca:'" + marca + '\'' +
            ", ano:" + ano +
            '}';
  }
}
