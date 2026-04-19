package hw.ch10;

public class Main {
    public static void main(String[] args) {
        System.out.println("20221310 이지원");

        // System.out.println("===== RandomStrategy =====");
        Player player1 = new Player("Taro", new RandomStrategy(0));

        // System.out.println("===== CyclicStrategy =====");
        Player player2 = new Player("Bob", new CyclicStrategy());

        // CyclicStrategy 테스트 : 순환 확인
        System.out.println("===== CyclicStrategy의 손가락 순환 =====");
        Strategy cyclic = new CyclicStrategy();
        for (int i = 0; i < 9; i++) {
            Hand hand = cyclic.nextHand();
            System.out.println((i + 1) + "번째: "+ hand);

            cyclic.study(false);
        }

        System.out.println("\n===== 게임 시작 =====");
        for (int i = 0; i < 10; i++) {
            // 1. 각 플레이어가 다음 손을 낸다
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            // 2. 승패를 판단한다
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        // 최종 결과 출력
        System.out.println("\n===== 최종 결과 =====");
        System.out.println(player1);
        System.out.println(player2);

    }
}
