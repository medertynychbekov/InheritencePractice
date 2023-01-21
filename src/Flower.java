import java.time.LocalDate;

public class Flower {

    public static int counter;
    private static int COUNTER;

    private String madeIn;

    private String expired;

    private int price;
    private boolean sold;

    public Flower() {
        counter++;
    }

    public static void getPrice(Flower[] array ){
        int summa = 0;
        for (Flower f: array){
            summa+= f.getPrice();
        }
        System.out.println(summa);
    }

    public void getCountOfSoldFlower(){
        if (sold){
            counter++;
        }
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Flower(String madeIn, String expired, int price) {
        this.madeIn = madeIn;
        this.expired = expired;
        this.price = price;
        counter++;
    }
}
