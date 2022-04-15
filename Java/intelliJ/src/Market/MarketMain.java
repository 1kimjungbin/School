package Market;

public class MarketMain {
    public static void main(String[] args) {

        MarketGood g1 = new MarketGood("MacBook Air", 1250000);
        MarketGood g2 = new MarketGood("MacBook Pro", 2990000, 15);
        MarketGood g3 = new MarketGood("iPhone", 920000, 15);

        System.out.println(g1.getName() + "의 할인율 : " + g1.getDisCountRate());
        System.out.println(g2.getName() + "의 할인율 : " + g2.getDisCountRate());
        System.out.println(g3.getName() + "의 정상가격 : " + g3.getRetailPrice()+"원");
        System.out.println(g3.getName() + "의 할인가격 : " + g3.getDisCountRate()+"원");
        System.out.println("경쟁 업체가 많아져서 " + g3.getName() + "의 할인율이 " + g3.getDisCountRate() + "로 올랐습니다.");

    }
}
