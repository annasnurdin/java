public class Array {
    public static void main(String[] args) {
        String[] arrayStringAtauBebasNamaVariabelnyaApa = new String[3]; // panjangnya 3

        arrayStringAtauBebasNamaVariabelnyaApa[0] = "Annas"; // initialisasi index ke 0

        System.out.println(arrayStringAtauBebasNamaVariabelnyaApa[0]);

        int[] arrayInt = new int[]{
                1,2,3,4
        };

        System.out.println(arrayInt[2]);

        String[] namaNama = {
                "Annas", "Purwo", "Karina"
        };
        System.out.println(namaNama[2]);

        namaNama[1] = "Soleh";
        System.out.println(namaNama[1]); // bisa diubah isinya

        System.out.println(namaNama.length);
    }
}
