package digitalrecordsystem;

public class UniversityRecordSystem {
    public static void main(String[] args) {

        StudentBST bst = new StudentBST();

      
        bst.root = bst.insert(bst.root, 50, "Amit");
        bst.root = bst.insert(bst.root, 30, "Neha");
        bst.root = bst.insert(bst.root, 70, "Rahul");
        bst.root = bst.insert(bst.root, 20, "Pooja");
        bst.root = bst.insert(bst.root, 40, "Karan");

       
        System.out.println("Student Records (Sorted by Roll No):");
        bst.inorder(bst.root);

     
        System.out.println("Searching Roll No 30:");
        bst.search(bst.root, 30);

     
        System.out.println("Deleting Roll No 30");
        bst.root = bst.delete(bst.root, 30);

   
        System.out.println(" Records After Deletion:");
        bst.inorder(bst.root);
    }
}
