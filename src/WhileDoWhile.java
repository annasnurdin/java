public class WhileDoWhile {
    public static void main(String[] args) {
        var counter = 0;

        while (counter < 10){
            System.out.println("Perulangan" + counter);
            counter++;
        }

        var counter2 = 0;

        do {
            System.out.println("Perulangan 2 " + counter2);
        } while (counter2 == 100); // meskipun salah, do while tetap akan di eksekusi minimal sekali
    }
}
