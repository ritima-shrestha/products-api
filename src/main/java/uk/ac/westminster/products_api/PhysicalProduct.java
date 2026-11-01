
package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it inherits the common
// product details (id, name and price).
// A ShoppingCart is not a Product because it manages products.

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

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

    // Getter for dimensions
    public String getDimensions() {
        return dimensions;
    }
}
