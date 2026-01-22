package ecommercesystem;

class ProductBST {
    ProductNode root;

    ProductNode insert(ProductNode root, int sku, String name, double price) {
        if (root == null)
            return new ProductNode(sku, name, price);

        if (sku < root.sku)
            root.left = insert(root.left, sku, name, price);
        else if (sku > root.sku)
            root.right = insert(root.right, sku, name, price);

        return root;
    }

    void search(ProductNode root, int sku) {
        if (root == null) {
            System.out.println("Product not found.");
            return;
        }

        if (sku == root.sku) {
            System.out.println("Product Found:");
            System.out.println("SKU: " + root.sku +
                               ", Name: " + root.name +
                               ", Price: ₹" + root.price);
        } else if (sku < root.sku) {
            search(root.left, sku);
        } else {
            search(root.right, sku);
        }
    }

  
    void updatePrice(ProductNode root, int sku, double newPrice) {
        if (root == null) {
            System.out.println("Product not found.");
            return;
        }

        if (sku == root.sku) {
            root.price = newPrice;
            System.out.println("Price updated successfully!");
        } else if (sku < root.sku) {
            updatePrice(root.left, sku, newPrice);
        } else {
            updatePrice(root.right, sku, newPrice);
        }
    }

    void inorder(ProductNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("SKU: " + root.sku +
                               ", Name: " + root.name +
                               ", Price: ₹" + root.price);
            inorder(root.right);
        }
    }
}
