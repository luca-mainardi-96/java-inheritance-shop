public class Main {

    public static void main(String[] args) {
        Smartphone p1 = new Smartphone(12345);
        p1.setNome("ROG Phone 6");
        p1.setMarca("ASUS");
        p1.setCodiceImei(123456789);
        p1.setPrezzo(1250);
        p1.setIva(275);
        p1.setMemoria(256);
        p1.stampaDettagli();

        System.out.println("   ");

        Cuffie p2 = new Cuffie(12346);
        p2.setNome("WH-1000XM4");
        p2.setMarca("Sony");
        p2.setColore("Nero");
        p2.setWireless(false);
        p2.setPrezzo(150);
        p2.setIva(33);
        p2.stampaDettagli();

        System.out.println("   ");

        Televisori p3 = new Televisori(123457);
        p3.setNome("Bravia");
        p3.setMarca("Sony");
        p3.setDimensioni(52);
        p3.setSmart(true);
        p3.setPrezzo(500);
        p3.setIva(110);
        p3.stampaDettagli();

    }
}
