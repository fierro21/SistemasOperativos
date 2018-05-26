package hilos;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        int n=num("ingrese numero");
		
		Pares.par par= new Pares.par(n, Pares.par.OPERACION_IMPAR);
		Pares.Suma suma = new Pares.Suma(n,Pares.Suma.OPERACION_SUMA);
		Pares.Primo Primo = new Pares.Primo(n,Pares.Primo.OPERACION_PRIMO);
		Pares.Factorial Factorial = new Pares.Factorial(n,Pares.Factorial.OPERACION_FACTORIAL);
		Pares.Fibonnaci Fibonnaci = new Pares.Fibonnaci(n,Pares.Fibonnaci.OPERACION_FIBONNACI);
        
        par.start();
        Primo.start();
        suma.start();
        Factorial.start();
        Fibonnaci.start();
    }
    
    private static int num(String mensaje) {
		System.out.println(mensaje);
		Scanner entradaEscanner= new Scanner(System.in);
		String entradaTeclado= entradaEscanner.nextLine();
		entradaEscanner.close();
		return Integer.parseInt(entradaTeclado);
		
	}
}
