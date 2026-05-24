package week1;

public class Americano extends Coffee {
    //물 양 조절을 위함
    private int waterAmount;
    //생성자 선언에서 부모Coffee의 생성자 내려받음
    //상위 클래스와 같은 고정된 값을 받는 부분이라 따로 매개변수를 안적었는데 어떤 방식이 맞을지가 의문입니다 
    public Americano(){
        super("아메리카노",3000,2);
        waterAmount = 400;
    }
    //물 추가시 기존 물 양에 추가하여 저장
    public void addWater(int extraWater){
        waterAmount += extraWater;
    }
    public int getWaterAmount(){
        return waterAmount;
    }
    
}
