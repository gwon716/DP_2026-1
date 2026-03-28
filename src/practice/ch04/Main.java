package practice.ch04;

import practice.ch04.idcard.IDCard;
import practice.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // (1) IDCard를 직접 생성
        // IDCard card1 = new IDCard("이지원");
        // card1.use();

        // (2) 공장을 통해서 IDCard 생성
        IDCardFactory factory = new IDCardFactory();
        IDCard card2 = (IDCard) factory.create("이지원");
        card2.use();
    }
}