package builderpattern;


public class ProductTest {

    public static void main(String[] args) {

        // Use Case1 : Only Mandatory Filed
        Product product1 = new Product.ProductBuilder("Apple Mac Book", 1000).build();
        System.out.println(product1);

        // Use Case2 : Mandatory + Optional Filed
        Product product2 = new Product.ProductBuilder("Samsung", 500).setFreeShipping(false).setCategory("Electorics")
                .setDescription("Samsumg Monitior 17 inches").setDiscount(10).setStock(50).build();
        System.out.println(product2);

        product2.setDiscount(5);
        System.out.println(product2);
//        System.out.println(product2.getName());
        System.out.println(product2.getCategory());

        // Use Case3 :
        Product product3 = new Product.ProductBuilder("Nike T Shirt", 250).setCategory("Fashion").setDiscount(10).setFreeShipping(true)
                .build();
        System.out.println(product3);

        product3.setDescription("Black Color Sports T shirt");
        System.out.println(product3);

    }
}
