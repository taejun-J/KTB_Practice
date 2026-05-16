package week1;

public class CoffeeTest {
    public static void main(String[]args){
        //new로 각각의 객체를 생성
        Americano americano = new Americano();
        Latte latte = new Latte();

        //각각의 이름을 setter를 통해 설정
        americano.setName("아메리카노");
        latte.setName("라떼");

        System.out.println("커피1");
        americano.extract();
        americano.addWater();
        americano.drink();

        System.out.println();

        System.out.println("커피2");
        latte.extract();
        latte.addMilk();
        latte.drink();

    }
}
