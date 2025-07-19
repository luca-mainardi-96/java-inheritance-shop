public class Prodotto {
    
    protected int codiceProdotto;
    protected String nome;
    protected String marca;
    protected double prezzo;
    protected double iva;

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

    public void stampaDettagli(){
        System.out.println("Codice Prodotto: " + codiceProdotto);
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Prezzo: " + prezzo + " euro.");
        System.out.println("Di cui IVA: " + iva + " euro.");
        System.out.println("Prezzo totale: " + (prezzo+iva) + " euro.");
    }
}