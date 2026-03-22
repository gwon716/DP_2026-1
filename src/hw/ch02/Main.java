package hw.ch02;

public class Main {
    public static void main(String[] args) {
    System.out.println("20221310 이지원");

    Charger charger = new KoreanOutletAdapter();
    SmartPhone smartPhone = new SmartPhone(charger);
    smartPhone.charge();
    }
}
