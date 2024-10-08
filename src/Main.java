import java.util.Scanner;

class ContaIMC{
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);


    System.out.print("Insira peso:");
    double peso = scanner.nextDouble();

    System.out.print("insira altura");
    double altura = scanner.nextDouble();

    double imc = peso/(altura*altura);

    System.out.printf("Seu imc é:", imc);

    if (imc < 18.5){
        System.out.println("Classificação: Abaixo do peso");
    } else if (imc >= 18.5 && imc <= 24.9) {
        System.out.println("Classificação: Peso normal");
    } else if (imc >= 25.0 && imc <= 29.9) {
        System.out.println("Classificação: Sobrepeso");
    } else {
        System.out.println("Classificação: Obesidade");
    }

scanner.close();


}
}