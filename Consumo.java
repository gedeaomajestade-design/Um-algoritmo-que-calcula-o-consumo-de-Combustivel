import java.util.Scanner;
public class Consumo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Velocidade km/h: ");
        double velocidade = sc.nextDouble();
        System.out.println("Digite o tempo em h");
        double tempo = sc.nextDouble();
        double distancia = tempo * velocidade;
        System.out.println("Distancia percorrida é de " + distancia + "km/h");
        double litros = distancia / 12;
        System.out.println(" Combustivel consumido: " + litros + " Litros");


    }
}