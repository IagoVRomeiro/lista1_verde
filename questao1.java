
import java.util.Scanner;

public class questao1 {

    static String calcularAliquota(int dias) {
        if (dias <= 180) {
            return "22.5%";
        } else if (dias >= 181 && dias <= 360) {
            return "20%";
        } else if (dias >= 361 && dias <= 720) {
            return "17.5%";
        } else {
            return "15%";
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = entrada.nextLine();

        while (!valor.equals("FIM")) {
            int numero = Integer.parseInt(valor);
            System.out.println(calcularAliquota(numero));
            valor = entrada.nextLine(); 
        }
        entrada.close();
    }
}
