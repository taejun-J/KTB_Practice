package week1;

public class Latte extends Coffee{
    
    //라떼에 들어가는 우유 종류 입력받기(ex.일반,오트,아몬드)
    private String milkType;

    public Latte(){
        super("라떼",4500,1);
        //디폴트값
        milkType = "일반";
    }

    public void changeMilk(String milkType){
        this.milkType = milkType;
    }
    public String getMilkType(){
        return milkType;
    }
}
