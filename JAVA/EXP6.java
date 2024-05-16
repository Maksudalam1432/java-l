
public class EXP6 {
    public static void main(String[] args){
        Product[] obj = new Product[4];
        obj[0] = new Product(23, "Asus Rog 8");
        obj[1] = new Product(25, "Samsung S24 Ultra");
        obj[2] = new Product(56, "PS6");
        obj[3] = new Product(23, "Fire Boult 5G");

        for(int i=0;i<obj.length;i++){
            System.out.println("Product " + i +":");
            obj[i].display();
        }
    }
}
class Product{
    String productName;
    int productId;
    Product(int productId, String productName){
        this.productId = productId;
        this.productName = productName;
    }
    public void display(){
        System.out.println("Product Id = " + productId + "  " + " Product Name = " + productName);
        System.out.println();
    }
}