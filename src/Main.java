import java.util.Scanner;

class tabuada {
    public static void main(String args[]){
        int num;
        String operacao;
        int resultado = 1;
        Scanner lerTeclado = new Scanner(System.in);{

            System.out.print("Digite um numero: ");
            num = lerTeclado.nextInt();

            System.out.print("Digite a operação desejada (+,-,*,/) : ");
            operacao = lerTeclado.next();

            int contador = 1;

            do {

                if (operacao.charAt(0) == '+') {
                    resultado = num + contador;
                    System.out.println(num + " + " + contador + " = " + resultado);

                } else if (operacao.charAt(0) == '-') {
                   resultado = num - contador;
                    System.out.println((num+contador) + " - " + num + " = " +  (resultado-num));

                } else if (operacao.charAt(0) == '*') {
                    resultado = num * contador;
                    System.out.println(num + " * " + contador + " = " + resultado);

                } else if (operacao.charAt(0) == '/') {

                    resultado = contador  / num;
                    System.out.println((num * contador) + " / " + num + " = " + contador);

                } else {
                    System.out.println("Operação invalida. Tente Novamente: ");
                    break;
                }
                contador++;

            }while(contador <=10);


        }
    }
}
