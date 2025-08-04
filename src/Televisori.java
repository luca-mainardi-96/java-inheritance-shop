public class Televisori extends Prodotto {

    private int dimensioni;
    private boolean smart;

    public Televisori(int codiceProdotto){
        super(codiceProdotto);
    }

    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        if(dimensioni<24){
            System.out.println("Dato non compatibile.");
        }else{
            this.dimensioni = dimensioni;
        }
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString(){
        super.toString();
        return super.toString() + "\n" + "Dimensioni: " + getDimensioni() + "\n" + "Smart: " + isSmart();
    }

}
