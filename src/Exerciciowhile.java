import java.util.Scanner; class Exerciciowhile {
    
    //1. Utilizando (While), construir um programa que apresente a soma dos cem 
//primeiros números naturais (1 + 2 + 3 +...+ 98 + 99 + 100).
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("informe um numero ");
    int numero = scanner.nextInt();
    int contador = 1;
   
    while (contador <= 99) {
       System.out.printf("%d + %d = %d\n", numero, contador,(numero + contador ));
       contador = contador + 1;
    

    
    scanner.close();
    }
   
}
}
    

