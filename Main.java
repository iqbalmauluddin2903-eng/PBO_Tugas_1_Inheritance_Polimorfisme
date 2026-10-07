public class Main {
    public static void main(String[] args) {
        Bentuk bentuk1 = new Bentuk("Merah");
        bentuk1.printInfo();

        BujurSangkar bs1 = new BujurSangkar(5.0, "Biru");
        bs1.printInfo();

        Lingkaran lingkaran1 = new Lingkaran(7.0, "Merah");
        lingkaran1.printInfo();

        Silinder silinder1 = new Silinder(10.0, 7.0, "Merah");
        silinder1.printInfo();
    }
}