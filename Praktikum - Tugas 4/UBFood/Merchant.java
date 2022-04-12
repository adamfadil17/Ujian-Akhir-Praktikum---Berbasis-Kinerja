package UBFood;

public class Merchant {
    private String merchantName;
    private String productName;
    private double foodPrice;

    public Merchant(String merchantName, String productName, double foodPrice) {
        this.merchantName = merchantName;
        this.productName = productName;
        this.foodPrice = foodPrice;
    }

    public double getFoodPrice() {

        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {

        this.foodPrice = foodPrice;
    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {

        this.productName = productName;
    }

    public String getMerchantName() {

        return merchantName;
    }

    public void setMerchantName(String merchantName) {

        this.merchantName = merchantName;
    }
}
