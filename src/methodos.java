public class methodos {

    //Exercício de uma calculadora com as 4 operações

    public static void media(double num1, double num2) {
        double resultado = (num1 + num2) / 2;

        System.out.println(resultado);
    }

    public static void soma(double num1, double num2) {

        double resultado = num1 + num2;

        System.out.println(resultado);

    }

    public static void subtracao(double num1, double num2) {

        double resultado = num1 - num2;

        System.out.println(resultado);

    }

    public static void multiplicacao(double num1, double num2) {

        double resultado = num1 * num2;

        System.out.println(resultado);

    }

    public static void divisao(double num1, double num2) {

        double resultado = num1 / num2;

        System.out.println(resultado);

    }

    //Exercício onde mostra o turno do dia pela hora informada

    public static void turno(int hora) {

        if (hora >= 5 && hora <= 11){
            System.out.println("Bom dia!");
        }

        else if(hora >= 12 && hora <= 17){
            System.out.println("Boa tarde");
        }

        else{
            System.out.println("Boa noite!");
        }

        System.out.println(hora);

    }



    /*              SobreCarga de Metodos:

    Calcule a área dos três quadilateros: Cuadrado, Retangulo, Trapezio
        */
    public static void area(double lado) {

        System.out.println("A área do quadrado é: " + lado * lado);
    }

    public static void area(double base, double altura) {

        System.out.println("A área do retângulo é: " + base * altura);
    }

    public static void area(double baseMaior, double baseMenor, double altura2) {

        System.out.println("A área do trapézio é: " + (baseMaior + baseMenor) * altura2/2);
    }

    public static void area(float d1, float d2) {

        System.out.println("A área do losango é: " + (d1 + d2) /2);
    }



}


