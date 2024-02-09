import java.util.Scanner;

public class questao3 {

    static String calcularLucro(String valores) {

        String[] valor = valores.split(";");

        int investimento = Integer.parseInt(valor[0]);
        double juros = Double.parseDouble(valor[1]);
        int dias = Integer.parseInt(valor[2]);


        double aliquita;

          if (dias <= 180) {
            aliquita= 0.225;

            } else if (dias >= 181 && dias <= 360) {
            aliquita =0.20;

            } else if (dias >= 361 && dias <= 720) {
            aliquita= 0.175;

            } else {
            aliquita= 0.15;
            } 

         double resultado = ((investimento * Math.pow((1 + juros), dias) - investimento) * (1-aliquita));
        
        return (String)"R$ " + String.format("%.2f", resultado);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String valores = entrada.nextLine();

        while (!valores.equals("FIM")) {

            System.out.println(calcularLucro(valores));
            valores = entrada.nextLine(); 
        }

        entrada.close();
    }
}
