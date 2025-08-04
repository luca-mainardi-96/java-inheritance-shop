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

    @Override
    public String toString(){
        super.toString();
        return super.toString() + "\n" + "Colore: " + getColore() + "\n" + "Wireless: " + isWireless();
    }

}
