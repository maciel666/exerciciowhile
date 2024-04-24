

public class Exercicio2 {
    // 2Utilizando (DoWhile), elaborar um programa que apresente o somatório dos
    // valores pares existentes na faixa de 1 até 500.
    public static void main(String[] args) {


        int contador = 1;
        int resultado = 0;

        do { 
            if(contador % 2==0){
                resultado = resultado + contador;
                System.out.println(resultado);

            }
            contador = contador  +1;
            

        } while (contador <= 500);

    }

}
