package hospitalqueuemanagement;


public class Hospital {

    private PatientNode root;

    int height(PatientNode node) {
        return (node == null) ? 0 : node.height;
    }

    PatientNode rotateRight(PatientNode y) {
        PatientNode x = y.left;
        y.left = x.right;
        x.right = y;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    PatientNode rotateLeft(PatientNode x) {
        PatientNode y = x.right;
        x.right = y.left;
        y.left = x;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    int balance(PatientNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

 // Patient Registration
    PatientNode insert(PatientNode node, int time, String name) {

        if (node == null)
            return new PatientNode(time, name);

        if (time < node.time)
            node.left = insert(node.left, time, name);
        else
            node.right = insert(node.right, time, name);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int bal = balance(node);

        if (bal > 1)
            return rotateRight(node);
        if (bal < -1)
            return rotateLeft(node);

        return node;
    }

    public void register(int time, String name) {
        root = insert(root, time, name);
    }

  // remove patient 
    public PatientNode delete(PatientNode node, int time) {

        if (node == null) return null;

        if (time < node.time)
            node.left = delete(node.left, time);
        else if (time > node.time)
            node.right = delete(node.right, time);
        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
        }
        return node;
    }

    public void discharge(int time) {
        root = delete(root, time);
    }

  // Display by Arrival Time
    public void showQueue(PatientNode node) {
        if (node != null) {
            showQueue(node.left);
            System.out.println("Time: " + node.time + " Patient: " + node.name);
            showQueue(node.right);
        }
    }

    public void displayPatients() {
        showQueue(root);
    }
}

