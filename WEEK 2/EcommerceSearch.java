import java.util.*;
class Product {
    private int id;
    private String name;
    private String category;
    private String brand;
    private double price;
    private double rating;
    public Product(int id, String name, String category, String brand, double price, double rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.rating = rating;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    public double getRating() {
        return rating;
    }
    public void display() {
        System.out.println("-------------------------");
        System.out.println("Product ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Category   : " + category);
        System.out.println("Brand      : " + brand);
        System.out.println("Price      : " + price);
        System.out.println("Rating     : " + rating);
    }
}
public class EcommerceSearch {
    static ArrayList<Product> products = new ArrayList<>();
    public static void addProducts() {
        products.add(new Product(1,
                "iPhone 15",
                "Mobile",
                "Apple",
                70000,
                4.8));
        products.add(new Product(2,
                "Galaxy S24",
                "Mobile",
                "Samsung",
                60000,
                4.6));
        products.add(new Product(3,
                "Nike Running Shoes",
                "Footwear",
                "Nike",
                5000,
                4.5));
        products.add(new Product(4,
                "Dell Laptop",
                "Laptop",
                "Dell",
                65000,
                4.7));
        products.add(new Product(5,
                "Sony Headphones",
                "Accessories",
                "Sony",
                8000,
                4.4));
    }
    public static void searchProduct(String keyword) {
        boolean found = false;
        for(Product p : products) {
            if(p.getName().toLowerCase().contains(keyword.toLowerCase())
                    ||
               p.getCategory().toLowerCase().contains(keyword.toLowerCase())
                    ||
               p.getBrand().toLowerCase().contains(keyword.toLowerCase())) {


                p.display();
                found = true;
            }
        }
        if(!found) {

            System.out.println("No products found");
        }
    }
    public static void filterByPrice(double maxPrice) {
        System.out.println("Products under price " + maxPrice);
        for(Product p : products) {

            if(p.getPrice() <= maxPrice) {

                p.display();
            }
        }
    }

    public static void sortByPrice() {
        Collections.sort(products,
                Comparator.comparingDouble(Product::getPrice));
        System.out.println("Products sorted by price:");
        for(Product p : products) {
            p.display();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        addProducts();
        while(true) {
            System.out.println("\nE-Commerce Search System");
            System.out.println("1. Search Product");
            System.out.println("2. Filter By Price");
            System.out.println("3. Sort By Price");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.print("Enter search keyword: ");
                    String key = sc.nextLine();
                    searchProduct(key);
                    break;
                case 2:
                    System.out.print("Enter maximum price: ");
                    double price = sc.nextDouble();
                    filterByPrice(price);
                    break;
                case 3:
                    sortByPrice();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }

        }

    }
}


/*
OUTPUT
---------

E-Commerce Search System

1. Search Product
2. Filter By Price
3. Sort By Price
4. Exit

Enter choice: 1

Enter search keyword: nike


-------------------------
Product ID : 3
Name       : Nike Running Shoes
Category   : Footwear
Brand      : Nike
Price      : 5000.0
Rating     : 4.5

*/
