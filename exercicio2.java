import java.util.Scanner;
public class exercicio2{
public static void main(String args[] ){
    Scanner leitor = new Scanner (System.in);
    float  n1;
    float  n2;
    float  n3;
    int contador;
    float media = 0;

    for(contador = 1; contador <=100; contador++){
    
    System.out.println("Digite o valor da primeira nota do " + contador + "º aluno");
    n1= leitor.nextFloat();
    System.out.println("Digite o valor da segunda nota do " + contador + "º aluno ");
    n2 = leitor.nextFloat();
    System.out.println("Digite o valor da terceira nota do " + contador + "º aluno ");
    n3= leitor.nextFloat();
    media = n1 + n2 + n3;
    
    System.out.println("A média do seu aluno é " + media);
}
}
}
