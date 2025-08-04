public class Smartphone extends Prodotto {

    private long codiceImei;
    private int memoria;

    public Smartphone(int codiceProdotto){
        super(codiceProdotto);
    }

    public long getCodiceImei() {
        return codiceImei;
    }

    public void setCodiceImei(long codiceImei) {
        this.codiceImei = codiceImei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
       if (memoria <= 0){
        System.out.println("La memoria non può essere un numero negativo.");
       }else{
        this.memoria = memoria;
       }
    }

    @Override
    public String toString(){
        super.toString();
        return "Codice IMEI: " + codiceImei + "Memoria: " + memoria + " GB.";
    }
    
}
