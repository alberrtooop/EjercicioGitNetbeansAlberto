package ejerciciogitnetbeansalberto;

public class UsarPruebaGit {

    public static void main(String[] args) {
        System.out.println("Hola mundo desde Git");

        PruebaGit prueba = new PruebaGit();
        prueba.numero = 20;

        System.out.println(prueba.numero);
    }
}
