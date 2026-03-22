package hw.ch02;

public class SmartPhone {
    private Charger charger;

    public SmartPhone(Charger charger){
        this.charger = charger;
    }

    public void charge(){
        int voltage = charger.charge();
        System.out.println("스마트폰이 " + voltage + "V에서 충전됩니다.");
    }
}
