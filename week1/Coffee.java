package week1;

public class Coffee extends Beverage{
    private int shot;

    //생성자를 통해 이름,가격,샷의 수를 입력
    public Coffee(String name,int price,int shot){
        super(name,price);
        this.shot = shot;
    }
    // 전체샷의 수를 리턴
    public int getShot(){
        return shot;
    }
    //extrashot이 있을경우 기존 샷에 추가하는코드
    public void setAddshot(int extraShot){
        this.shot += extraShot;
    }
    
}
