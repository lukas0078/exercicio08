import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 08/04/2023 */

public class App {

  public static void main(String[] args) {
    System.out.println("Digite o valor da sua hora de trabalho: ");
    float valordahora = new Scanner(System.in).nextFloat();
    System.out.println("Digite quantas horas voce trabalha por dia: ");
    int horastrabalhadas = new Scanner(System.in).nextInt();
    int quantidadededias = 22;
    System.out.printf("O seu salario, em um mes, eh de: %.2f", (valordahora * horastrabalhadas) * quantidadededias);
  }

}