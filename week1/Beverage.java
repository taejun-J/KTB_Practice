package week1;

public class Beverage{
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    void drink(){
        System.out.println(getName()+"를 마십니다.");
    }

}