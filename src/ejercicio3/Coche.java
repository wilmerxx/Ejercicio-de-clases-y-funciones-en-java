package ejercicio3;

public class Coche {
 public int numeroPuertas;
 public int resultado;

 public Coche(){
     this.numeroPuertas = 4;
     this.resultado = 0;
 }

    public void agregarPuertas(int numeroPuertas) {
        this.numeroPuertas += numeroPuertas;
    }

    public void contadorPuertas(int numeroPuertas){
     resultado = this.resultado + this.numeroPuertas;
     System.out.println("Por defecto el carro cuenta con 4 puertas");
     System.out.println("Cantidad de puestas que agregaste es " + numeroPuertas + " en total de puertas que tienes es de " + resultado);
 }

}
