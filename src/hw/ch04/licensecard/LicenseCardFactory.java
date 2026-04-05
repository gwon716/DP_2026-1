package hw.ch04.licensecard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    int licenseCounter = 100;
    String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    protected synchronized LicenseCard createProduct(String holder) {
        String expiryDate = "2031-03-19";
        return new LicenseCard(holder, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
