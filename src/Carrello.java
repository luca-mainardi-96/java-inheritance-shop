import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Scegli quale prodotto inserire: \n -1 per cuffie \n -2 per smartphone \n -3 per televisore");

        int scelta = scan.nextInt();
        Prodotto p1 = null;

        if(scelta == 1){
            System.out.println("Hai scelto Cuffie.");
            System.out.print("Inserisci il nome: ");
            String nome = scan.next();
            System.out.print("Inserisci la marca: ");
            String marca = scan.next();
            System.out.print("Inserisci il prezzo: ");
            double prezzo = scan.nextDouble();

            p1 = new Cuffie(1);
            
            p1.setNome(nome);
            p1.setMarca(marca);
            p1.setPrezzo(prezzo);
        }else if (scelta == 2){
            System.out.println("Hai scelto Smartphone.");
            System.out.print("Inserisci il nome: ");
            String nome = scan.next();
            System.out.print("Inserisci la marca: ");
            String marca = scan.next();
            System.out.print("Inserisci il prezzo: ");
            double prezzo = scan.nextDouble();

            p1 = new Smartphone(1);

            p1.setNome(nome);
            p1.setMarca(marca);
            p1.setPrezzo(prezzo);
        }else if(scelta == 3){
            System.out.println("Hai scelto Televisore.");
            System.out.print("Inserisci il nome: ");
            String nome = scan.next();
            System.out.print("Inserisci la marca: ");
            String marca = scan.next();
            System.out.print("Inserisci il prezzo: ");
            double prezzo = scan.nextDouble();

            p1 = new Televisori(1);
            p1.setNome(nome);
            p1.setMarca(marca);
            p1.setPrezzo(prezzo);
        }else{
            System.out.println("Scelta non valida.");
        }
        System.out.println(p1.toString());
    }
}