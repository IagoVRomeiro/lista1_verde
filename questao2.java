import java.util.Scanner;

public class questao2 {

    static String calcularinvestimento(String valores) {

        String[] valor = valores.split(";");

        int investimento = Integer.parseInt(valor[0]);
        double juros = Double.parseDouble(valor[1]);
        int dias = Integer.parseInt(valor[2]);

        double resultado = (investimento * Math.pow((1 + juros), dias));
        
        return (String)"R$ " + String.format("%.2f", resultado);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String valores = entrada.nextLine();

        while (!valores.equals("FIM")) {

            System.out.println(calcularinvestimento(valores));
            valores = entrada.nextLine(); 
        }

        entrada.close();
    }
}
