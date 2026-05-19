package week1;

import java.util.Scanner;

public class CoffeeTest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //종료시키기 전까지 계속되게 하려고 while(true)로 지정
        while(true){
            System.out.println("\n===== 커피샵 키오스크 =====");
            System.out.println("1. 아메리카노 - 3000원");
            System.out.println("2. 라떼 - 4500원");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");

            //위의 메뉴에서 고른 번호
            int menuNum = sc.nextInt();

            //업캐스팅 위해 변수 설정
            //메뉴 선택에 따른 조건문 밖에서도 사용하기 위해 밖에 선언
            Coffee coffee;

            //고른 메뉴에따른 조건문
            if(menuNum == 1){
                //아메리카노를 업캐스팅 이후에 코드 중복을 줄이기 위해
                coffee = new Americano();

                //하단은 아메리카노 고유기능이라 다운캐스팅
                Americano americano = (Americano) coffee;

                System.out.print("추가할 물의 양 입력(ml): ");
                int extraWater = sc.nextInt();

                if (extraWater > 0) {
                    americano.addWater(extraWater);
                }
            }else if(menuNum == 2){
                coffee = new Latte();

                //하단은 라떼 고유기능 구현위해 다운캐스팅
                Latte latte = (Latte) coffee;

                System.out.println("우유 종류 선택");
                System.out.println("1. 일반 우유");
                System.out.println("2. 오트 우유");
                System.out.println("3. 아몬드 우유");
                System.out.print("선택: ");

                int milkMenu = sc.nextInt();

                if (milkMenu == 2) {
                    latte.changeMilk("오트 우유");
                } else if (milkMenu == 3) {
                    latte.changeMilk("아몬드 우유");
                }
            }else if(menuNum== 0){
                System.out.println("주문 종료");
                //while문 탈출
                break;
            }else{
                System.out.println("다시 입력 해주세요");
                //다시 입력받을 수 있도록(break가 아님)
                continue;
            }
            System.out.print("수량 입력 : ");
            int count = sc.nextInt();

            System.out.print("추가 샷 입력 : ");
            int extraShot = sc.nextInt();

            if(extraShot > 0){
                coffee.setAddshot(extraShot);
            }
            //잔 당 가격 계산
            int singlePrice = coffee.getPrice()+(extraShot*500);
            //고른 커피 총 가격 출력
            int totalPrice = singlePrice * count;

            //전체 출력 주문서(보이는 화면)
             System.out.println("\n===== 주문 내역 =====");
            System.out.println("메뉴: " + coffee.getName());
            System.out.println("샷 수: " + coffee.getShot());
            System.out.println("수량: " + count);
            System.out.println("한 잔 가격: "+singlePrice);
            if (coffee instanceof Americano) {
                Americano americano = (Americano) coffee;
                System.out.println("물 양: " + americano.getWaterAmount() + "ml");
            } else if (coffee instanceof Latte) {
                Latte latte = (Latte) coffee;
                System.out.println("우유 종류: " + latte.getMilkType());
            }

            System.out.println("총 가격: " + totalPrice + "원");


        }
    }
}
