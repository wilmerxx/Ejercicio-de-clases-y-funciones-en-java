package ejercicio3;

public class Operaciones {

    public int num1;
    public int num2;
    public int num3;
    public double resultant;

    public Operaciones(){

    }
    public Operaciones(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.resultant = 0.0;
    }

    public void suma(){

        resultant = this.num1 + this.num2 + this.num3;
        System.out.println( "La suma de los tres números es: " + resultant);
    }

    public void multiplicar(){

        resultant = this.num1 * this.num2 * this.num3;
        System.out.println( "La multiplicacion de los tres números es: " + resultant);
    }

    public void resta(){

        resultant = this.num1 - this.num2 - this.num3;
        System.out.println( "La resta de los tres números es: " + resultant);
    }

    public void division(){

        resultant = (this.num1 / this.num2) / this.num3;
        System.out.println( "La division de los tres números es: " + resultant);
    }
}
