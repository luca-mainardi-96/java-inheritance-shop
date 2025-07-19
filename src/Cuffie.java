public class Cuffie extends Prodotto {

    private String colore;
    private boolean wireless;

    public Cuffie(int codiceProdotto){
        super(codiceProdotto);
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public void stampaDettagli(){
        super.stampaDettagli();
        System.out.println("Colore: " + colore);
        if(wireless == true){
            System.out.println("Wireless.");
        }else{
            System.out.println("Cablato.");
        }
    }

}
