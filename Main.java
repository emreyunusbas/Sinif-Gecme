import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik;

        // Matematik notunun girişi
        System.out.print("Matematik notunuzu girin: ");
        mat = scanner.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Hatalı not girişi! Lütfen tekrar deneyin.");
            System.out.print("Matematik notunuzu girin: ");
            mat = scanner.nextInt();
        }

        // Fizik notunun girişi
        System.out.print("Fizik notunuzu girin: ");
        fizik = scanner.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Hatalı not girişi! Lütfen tekrar deneyin.");
            System.out.print("Fizik notunuzu girin: ");
            fizik = scanner.nextInt();
        }

        // Türkçe notunun girişi
        System.out.print("Türkçe notunuzu girin: ");
        turkce = scanner.nextInt();
        if (turkce < 0 || turkce > 100) {6060
            System.out.println("Hatalı not girişi! Lütfen tekrar deneyin.");
            System.out.print("Türkçe notunuzu girin: ");
            turkce = scanner.nextInt();
        }

        // Kimya notunun girişi
        System.out.print("Kimya notunuzu girin: ");
        kimya = scanner.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Hatalı not girişi! Lütfen tekrar deneyin.");
            System.out.print("Kimya notunuzu girin: ");
            kimya = scanner.nextInt();
        }

        // Müzik notunun girişi
        System.out.print("Müzik notunuzu girin: ");
        muzik = scanner.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Hatalı not girişi! Lütfen tekrar deneyin.");
            System.out.print("Müzik notunuzu girin: ");
            muzik = scanner.nextInt();
        }

        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5.0;
        System.out.println("Not Ortalaması: " + ortalama);

        if (ortalama >= 55) {
            System.out.println("Sınıfı geçtin!");
        } else {
            System.out.println("Sınıfta kaldınız! Daha Çok Çalışman Lazım");
        }
    }
}