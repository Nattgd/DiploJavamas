import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      int fibo;
      System.out.println("Ingrese la cantidad de secuencias de Fibonacci a calcular");
      fibo=entrada.nextInt();
      System.out.println("Secuencia Fibonacci");
      
      int contador=0;
      int a=0;
      int b=1;
      int c=0;
      while(contador !=fibo){
          c=a+b;
          a=b;
          b=c;
          contador=contador+1;
          System.out.println(c);      
      }
              
    }
    
}
