import java.util.Scanner;
public class exercicio1{
public static void main(String args[] ){
    Scanner leitor = new Scanner (System.in);
float  n1;
float  n2;
float  n3;
float  media;
 


System.out.println("Digite o valor da sua primeira nota ");
n1= leitor.nextFloat();
 System.out.println("Digite o valor da sua segunda nota ");
 n2 = leitor.nextFloat();
 System.out.println("Digite o valor da sua terceira nota ");
n3= leitor.nextFloat();

media = n1 + n2 + n3;

System.out.println("A média do seu aluno é " + media);



}
}