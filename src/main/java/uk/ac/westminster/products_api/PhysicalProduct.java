
package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it inherits the common
// product details (id, name and price).
// A ShoppingCart is not a Product because it manages products.

public class PhysicalProduct extends Product implements Discountable {
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    // No-argument constructor
    public PhysicalProduct() {
        super(0L, null, 0.0);
    }

    // Full constructor
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }


    // Getter for weightKg
    public double getWeightKg() {
        return weightKg;
    }
    // Setter for weightKg
    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }


    // Getter for dimensions
    public String getDimensions() {
        return dimensions;
    }
    // Setter for dimensions
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg + " kg";
    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

}
