package ecommercesystem;

public class Ecommerce{
    public static void main(String[] args) {

        ProductBST inventory = new ProductBST();

    
        inventory.root = inventory.insert(inventory.root, 105, "Laptop", 55000);
        inventory.root = inventory.insert(inventory.root, 102, "Mouse", 700);
        inventory.root = inventory.insert(inventory.root, 108, "Keyboard", 1500);
        inventory.root = inventory.insert(inventory.root, 101, "Monitor", 12000);

   
        System.out.println("Searching");
        inventory.search(inventory.root, 102);

        System.out.println("Updating ");
        inventory.updatePrice(inventory.root, 105, 52000);

        System.out.println("Product List ");
        inventory.inorder(inventory.root);
    }
}
