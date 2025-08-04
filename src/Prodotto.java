public class Prodotto {
    
    private int codiceProdotto;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;
    private double prezzoFinale = prezzo + iva;


    public Prodotto(int codiceProdotto){
        this.codiceProdotto = codiceProdotto;
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
        if(prezzo >= 0){
            this.prezzo = prezzo;
        }else{
            System.out.println("Prezzo non valido.");
        }
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        if(iva >= 0){
            this.iva = iva;
        }else{
            System.out.println("Iva non valida.");
        }
    }

    public String toString(){
        return "Codice Prodotto:" + codiceProdotto + "Nome: " + nome + "Marca: " + marca + "Prezzo: " + prezzoFinale;
    }
}