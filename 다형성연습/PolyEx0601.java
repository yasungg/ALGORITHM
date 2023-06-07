package 다형성연습;

public class PolyEx0601 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();
        buyer.Buy(tv);
        buyer.Buy(computer);
        buyer.Buy(audio);
        buyer.viewInfo();
    }
}
