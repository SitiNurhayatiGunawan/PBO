package kai;

public class Main {
    public static void main(String[] args) {
        KeretaEkonomi keretaEkonomi = new KeretaEkonomi("Ekonomi A", 200, 500);
        KeretaBisnis keretaBisnis = new KeretaBisnis("Bisnis X", 100, 200);

        keretaEkonomi.info();
        System.out.println();

        keretaBisnis.info();
    }
}