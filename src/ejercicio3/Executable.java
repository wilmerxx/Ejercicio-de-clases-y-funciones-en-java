package ejercicio3;

public class Executable {
    public static void main(String[] args) {
        int num = 15;
        int num2 = 25;
        int num3 = 6;
        Operaciones operation;
        operation = new Operaciones(num,num2,num3);
        operation.suma();
        operation.resta();
        operation.multiplicar();
        operation.division();
        System.out.println("");
        System.out.println("Agregar puertas a mi coche");
        int nPuertas = 5;
        Coche miChoche = new Coche();
        miChoche.agregarPuertas(nPuertas);
        miChoche.contadorPuertas(nPuertas);

    }
}
