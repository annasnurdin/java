public class Statement {
    public static void main(String[] args) {
        int kkm = 75;
        int nilai = 80;

        var pujian = "B";

        if (nilai > kkm){
            System.out.println("Lulus");
        } else {
            System.out.println("TIdak Lulus");
        }

        switch (pujian){
            case "A":
                System.out.println("Anda Lulus Banget");
                break;
            case "B":
                System.out.println("Anda baik-baik saja");
        }

        switch (pujian){ // switch lamda, java 14
            case "A" -> System.out.println("jos sekali");
            case "B", "C" -> System.out.println("Biasa Ajah");
            default -> System.out.println("yah");
        }

        String ucapan;

        ucapan = switch (pujian){ // pake yield
            case "A": yield "jos banget";
            case "B", "C": yield "b ajah";
            default: yield "lah lah lah";
        };

        System.out.println(ucapan);
    }
}
