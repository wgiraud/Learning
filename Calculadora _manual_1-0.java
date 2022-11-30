import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        while (true) {

            Scanner keyboard = new Scanner(in);
            out.println("adcione a operação escolhida:");
                String calculo = keyboard.next();
            out.println("adcione seu primeiro número:");
                int numero1 = keyboard.nextInt();
            out.println("adcione seu segundo número:");
                int numero2 = keyboard.nextInt();


            switch (calculo) {
                case "soma":
                    out.println("o resultado da soma é :");
                    out.println(numero1 + numero2);
                    break;
                case "divisao":
                    out.println(numero1 / numero2);
                    break;
                case "subtracao":
                    out.println(numero1 - numero2);
                    break;
                case "multiplicacao":
                    out.println(numero1 * numero2);
                    break;
                default:
                    out.println("tente uma das 4 operacoes novamente");
                    break;
            }
            out.println("Vamos calcular novamente");
        }
    }
}