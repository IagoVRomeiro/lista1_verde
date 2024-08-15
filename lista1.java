
public class lista1 {

    public static void main(String[] args) {

        MyIO.println("QUESTÃO 1");
        String fim = MyIO.readLine();

        while (!fim.equals("FIM")) {
            int dias = Integer.parseInt(fim);
            MyIO.println(calcularAliquota(dias));

            fim = MyIO.readLine();
        }


        MyIO.println("QUESTÃO 2");
        fim = MyIO.readLine();

        while (!fim.equals("FIM")) {
            MyIO.println(calcularInvestimento(fim));
            fim = MyIO.readLine();
        }


        MyIO.println("QUESTÃO 3");
         fim = MyIO.readLine();

        while (!fim.equals("FIM")) {
            MyIO.println(calcularLucro(fim));
            fim = MyIO.readLine();
        }
    }



    static String calcularAliquota(int dias) {
        if (dias <= 180) {
            return "22.5%";
        } else if (dias >= 181 && dias <= 360) {
            return "20.0%";
        } else if (dias >= 361 && dias <= 720) {
            return "17.5%";
        } else {
            return "15.0%";
        }
    }

    static String calcularInvestimento(String valores) {
        String[] valor = valores.split(";");
        int investimento = Integer.parseInt(valor[0]);
        double juros = Double.parseDouble(valor[1]);
        int dias = Integer.parseInt(valor[2]);

        double resultado = (investimento * Math.pow((1 + juros), dias));
        return "R$ " + String.format("%.2f", resultado);
    }

    static String calcularLucro(String valores) {
        String[] valor = valores.split(";");

        int investimento = Integer.parseInt(valor[0]);
        double juros = Double.parseDouble(valor[1]);
        int dias = Integer.parseInt(valor[2]);

        double aliquota;

        if (dias <= 180) {
            aliquota = 0.225;
        } else if (dias >= 181 && dias <= 360) {
            aliquota = 0.20;
        } else if (dias >= 361 && dias <= 720) {
            aliquota = 0.175;
        } else {
            aliquota = 0.15;
        }

        double resultado = ((investimento * Math.pow((1 + juros), dias) - investimento) * (1 - aliquota));
        return "R$ " + String.format("%.2f", resultado);
    }
}
