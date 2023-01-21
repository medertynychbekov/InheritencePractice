public class Main {
    public static void main(String[] args) {

        Flower gvosdika = new Gvosdika("Usa", "2022", 500);

        Flower rose = new Rose("Usa", "2022", 500);

        System.out.println(Flower.counter);
        Flower.getPrice(new Flower[]{gvosdika, rose});
    }
}