package cap3;

public class PilhaComRecursao {

    public static int fatorial(int x) {
        if (x == 1)
            return 1;
        return x * fatorial(x - 1);
    }

    public static void main(String[] args) {

        System.out.println(fatorial(3));

    }
}
