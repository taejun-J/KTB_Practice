package week1;

public class Beverage{
    // 이름은 한 번 지정후 변경X
    private final String name;
    //키오스크에서는 가격 변경할 일이 X
    private int price;
    

    public Beverage(String name, int price){
        this.name = name;
        this.price = price;
    }
    //public getter로 이름,가격 받아오는 메서드
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}