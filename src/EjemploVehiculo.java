public class EjemploVehiculo {
  public static void main(String[] args) {

    Vehiculo v = new Vehiculo("Mercedes Benz", 2001);
    Auto a = new Auto("Ford", 2014, 5);
    Bicicleta b = new Bicicleta("Trek", 2003, "montaña");
    Sedan s = new Sedan("Chevrolet", 2022, 5, 400);

    System.out.println(v.toString());
    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(s.toString());

  }
}
