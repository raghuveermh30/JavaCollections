package builderpattern;

public class Product {

    //Required Fields
    private String name;
    private double price;

    //Optional Fields
    private String description;
    private double discount;
    private String category;
    private boolean freeShipping;
    private int stock;

    /*
     * Builder Pattern will be helpful to maintain the Mandatory seperatley and Optional Field in the application
     * It will create the workflow based and user journey to handle the method to chaining kind of concept in the method
     *
     * Builder Pattern will return the current class object
     * We need to call the build method once we are done with the method chaining
     *
     * Here Constructor will be Private
     */

    private Product(ProductBuilder productBuilder) {
        this.name = productBuilder.name;
        this.price = productBuilder.price;
        this.description = productBuilder.description;
        this.discount = productBuilder.discount;
        this.freeShipping = productBuilder.freeShipping;
        this.category = productBuilder.category;
        this.stock = productBuilder.stock;
    }

    //Create the getter and Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", discount=" + discount +
                ", category='" + category + '\'' +
                ", freeShipping=" + freeShipping +
                ", stock=" + stock +
                '}';
    }

    public static class ProductBuilder {
        //Required Fields
        private String name;
        private double price;

        //Optional Fields
        private String description;
        private double discount;
        private String category;
        private boolean freeShipping;
        private int stock;

        //public Constructor of the builder for required fields

        public ProductBuilder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        //Generate the setters for the optional fields
        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public ProductBuilder setFreeShipping(boolean freeShipping) {
            this.freeShipping = freeShipping;
            return this;
        }

        public ProductBuilder setStock(int stock) {
            this.stock = stock;
            return this;
        }

        //build() - to create the object of the Product Class
        public Product build() {
            return new Product(this);
        }
    }
}
