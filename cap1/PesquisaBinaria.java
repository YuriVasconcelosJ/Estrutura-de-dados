package cap1;

public class PesquisaBinaria {

    public static int buscar(int[] array, int alvo) {

        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (meio == alvo) {
                return meio;
            } else if (array[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }

        }

        return -1;
    }

    public static int buscarNome(String[] arrayName, String nomeAlvo) {
        int inicio = 0;
        int fim = arrayName.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            int comparacao = arrayName[meio].compareTo(nomeAlvo);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] numeros = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int alvo = 23;

        String[] catalogo = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Julia"};
        String target = "Fernanda";

        int resultado = buscar(numeros, alvo);

        int resultadoNome = buscarNome(catalogo, target);

        if (resultado != -1) {
            System.out.println("Nome encontrado no índice: " + resultado);
        } else {
            System.out.println("Nome não está na lista.");
        }
    }

}
