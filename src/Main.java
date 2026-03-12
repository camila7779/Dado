import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int dado1, dado2;
        int totd1=0, totd2=0;

        do {
            dado1 = aleatorio.nextInt(6) + 1;
            System.out.println("El dado 1 cayo en: " + dado1);
            dado2 = aleatorio.nextInt(6) + 1;
            System.out.println("El dado 2 cayo en: " + dado2);

            totd1+= dado1;
            totd2+=dado2;

        }while(dado1!=dado2);

        System.out.println("la suma del dado 2:" + totd2);
        System.out.println("la suma del dado 1: "+ totd1);

        if (totd1 > totd2){
            System.out.println("el dado 1 es el ganador");

        } else if (totd2<totd1) {
            System.out.println("el dado 2 es el ganador");

        }

    }
}