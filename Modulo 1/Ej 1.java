import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      int x; int y; int z;
      System.out.println("ingrese el largo y ancho del terreno");
      x=entrada.nextInt();
      y=entrada.nextInt();
      z=x*2+y*2;
      System.out.println("Se necesitará "+z+" mts de alambre");
    }
}
      
