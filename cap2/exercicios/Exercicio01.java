// https://www.arquivodecodigos.com.br/dicas_truques_categoria2.php?linguagem=2&categoria1=41&categoria2=130
package cap2.exercicios;

public class Exercicio01 {
    public static void contarRecursivamente(int n){
        if (n == 0)
            return;
        contarRecursivamente(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        contarRecursivamente(10);
    }
}
