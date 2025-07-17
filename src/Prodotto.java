public class Prodotto {
    
    private int codiceProdotto;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva = prezzo*22/100;

    public Prodotto(int codiceProdotto, String nome, String marca, double prezzo){
        this.codiceProdotto = codiceProdotto;
        this.nome = nome;
        this.marca = marca;
        if (prezzo >= 0){
            this.prezzo = prezzo;
        }else{
            System.out.println("Prezzo non valido.");
        }
    }

    public int getCodiceProdotto() {
        return codiceProdotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


}