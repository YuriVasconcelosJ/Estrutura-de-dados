package cap3;

public class PilhaCamadas {

    public static void funtion1() {
        System.out.println("Executando função 1");
        function2();
        System.out.println("5. Fim da Função 1 (voltou para a base!)");
    }

    public static void function2() {
        System.out.println("Executando função 2");
        function3();
        System.out.println("4. Fim da Função 2");
    }


    public static void function3() {
        System.out.println("Executando função 3");
        new Exception().printStackTrace();
    }

    public static void main(String[] args) {
        funtion1();
    }

}
