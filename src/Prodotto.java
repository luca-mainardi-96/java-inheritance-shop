public class Prodotto {
    
    protected int codiceProdotto;
    protected String nome;
    protected String marca;
    protected double prezzo;
    protected double iva;
    protected double prezzoFinale;


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
    if (prezzo >= 0) {
        this.prezzo = prezzo;
        this.iva = prezzo * 22 / 100;
        this.prezzoFinale = prezzo + this.iva;
        } else {
        System.out.println("Prezzo non valido.");
        }
    }

    public double getIva() {
        return iva;
    }

    public double getPrezzoFinale(){
        return prezzoFinale;
    }

    public String toString(){
        return "Codice Prodotto:" + getCodiceProdotto() + "\n" + "Nome: " + getNome() + "\n" + "Marca: " + getMarca()+ "\n" + "Prezzo: " + getPrezzoFinale() + "euro" + "\n" + "di cui IVA" + getIva() + "euro.";
    }
}