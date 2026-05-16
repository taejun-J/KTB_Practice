package week1;

public class Latte extends Coffee{
    
    @Override
    void extract(){
        System.out.println("원두 1샷을 추출합니다.");
        // 기본 2샷대신 라떼는 1샷만 추출하도록 기존 extract메서드를 오버라이드
    }

    void addMilk(){
        System.out.println("우유를 추가합니다.");
    }
}
