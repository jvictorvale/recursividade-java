public class main {
    public static void main(String[] args) {
//        contadorDe1AteNumero(1,4);

        int numeroFatorado = fatorial(5);
        System.out.println(numeroFatorado);
    }

    static void contadorDescResurivo(int numero) {
        if(numero > 0){
            contadorDescResurivo(numero - 1);
        }
        System.out.println(numero);
    }

    static void contadorCresRecursivo(int numero){
        if (numero == 0) {
            System.out.println(0);
        } else {
            contadorCresRecursivo(numero - 1);
            System.out.println(numero);
        }
    }

    static void contadorDe1AteNumero(int n, int numero){
        if (n <= numero) {
            System.out.println(n);
            contadorDe1AteNumero(n + 1, numero);
        }
        if (n < numero){
            System.out.println(n);
        }
    }

    static int fatorial(int numero){
        if (numero == 0){
            return 1;
        }
        return numero * fatorial(numero - 1 );
    }
}
