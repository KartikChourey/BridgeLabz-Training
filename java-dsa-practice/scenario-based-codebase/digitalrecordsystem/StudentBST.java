package digitalrecordsystem;
public class StudentBST {
    StudentNode root;

    //  Insert Student
    StudentNode insert(StudentNode root, int rollNo, String name) {
        if (root == null) {
            return new StudentNode(rollNo, name);
        }

        if (rollNo < root.rollNo)
            root.left = insert(root.left, rollNo, name);
        else if (rollNo > root.rollNo)
            root.right = insert(root.right, rollNo, name);

        return root;
    }

  // Search Student
    void search(StudentNode root, int rollNo) {
        if (root == null) {
            System.out.println("Student not found.");
            return;
        }

        if (rollNo == root.rollNo) {
            System.out.println("Found: Roll No = " + root.rollNo +
                               ", Name = " + root.name);
        } else if (rollNo < root.rollNo) {
            search(root.left, rollNo);
        } else {
            search(root.right, rollNo);
        }
    }

    void inorder(StudentNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Roll No: " + root.rollNo +
                               ", Name: " + root.name);
            inorder(root.right);
        }
    }

// Delete Student
    StudentNode delete(StudentNode root, int rollNo) {
        if (root == null)
            return null;

        if (rollNo < root.rollNo)
            root.left = delete(root.left, rollNo);
        else if (rollNo > root.rollNo)
            root.right = delete(root.right, rollNo);
        else {
         
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            StudentNode successor = minValue(root.right);
            root.rollNo = successor.rollNo;
            root.name = successor.name;
            root.right = delete(root.right, successor.rollNo);
        }
        return root;
    }

    StudentNode minValue(StudentNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }
}
