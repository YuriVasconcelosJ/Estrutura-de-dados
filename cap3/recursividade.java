package cap3;

public class recursividade {

    public static void regresiva(int i) {
        System.out.println(i);
        if (i <= 1)
            return;
        regresiva(i - 1); 

    }

    public static void main(String[] args) {
        regresiva(10);
    }
    
}
