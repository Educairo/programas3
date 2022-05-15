import java.util.Scanner;
public class exercicio3{
public static void main(String args[] ){
    Scanner leitor = new Scanner (System.in);
    float  n1, n2, n3;
    int qtAlunos;
    int qtDesejada;
    float media = 0;
    float mediafinal = 0;
  
    System.out.println("Quantos alunos serão avaliados?" );
    qtDesejada = leitor.nextInt();

    for(qtAlunos = 1; qtAlunos <=qtDesejada; qtAlunos++){
    
    System.out.println("Digite o valor da primeira nota do " + qtAlunos + "º aluno");
    n1= leitor.nextFloat();
    
    System.out.println("Digite o valor da segunda nota do " + qtAlunos + "º aluno ");
    n2 = leitor.nextFloat();
    
    System.out.println("Digite o valor da terceira nota do " + qtAlunos + "º aluno ");
    n3= leitor.nextFloat();
    
    media = n1 + n2 + n3;
    
    mediafinal = mediafinal + media;
    
    System.out.println("A média do seu aluno é: " + media);}
    
    System.out.println("A media da sua sala é de " + mediafinal/qtDesejada);
    
}
}