package ticketbooking;



public class Event {

    private EventNode root;

    int height(EventNode node) {
        return (node == null) ? 0 : node.height;
    }

    int balance(EventNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    EventNode rightRotate(EventNode y) {
        EventNode x = y.left;
        EventNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    EventNode leftRotate(EventNode x) {
        EventNode y = x.right;
        EventNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    EventNode insert(EventNode node, int time, String name) {

        if (node == null)
            return new EventNode(time, name);

        if (time < node.time)
            node.left = insert(node.left, time, name);
        else if (time > node.time)
            node.right = insert(node.right, time, name);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int bal = balance(node);

        if (bal > 1 && time < node.left.time)
            return rightRotate(node);

        if (bal < -1 && time > node.right.time)
            return leftRotate(node);

        if (bal > 1 && time > node.left.time) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (bal < -1 && time < node.right.time) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void addEvent(int time, String name) {
        root = insert(root, time, name);
    }

    EventNode delete(EventNode node, int time) {

        if (node == null) return null;

        if (time < node.time)
            node.left = delete(node.left, time);
        else if (time > node.time)
            node.right = delete(node.right, time);
        else {
            if (node.left == null || node.right == null)
                node = (node.left != null) ? node.left : node.right;
            else {
                EventNode temp = node.right;
                while (temp.left != null)
                    temp = temp.left;

                node.time = temp.time;
                node.eventName = temp.eventName;
                node.right = delete(node.right, temp.time);
            }
        }

        if (node == null) return null;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int bal = balance(node);

        if (bal > 1 && balance(node.left) >= 0)
            return rightRotate(node);

        if (bal < -1 && balance(node.right) <= 0)
            return leftRotate(node);

        return node;
    }

    public void cancelEvent(int time) {
        root = delete(root, time);
    }


    public void showEvents(EventNode node) {
        if (node != null) {
            showEvents(node.left);
            System.out.println("Time: " + node.time + " Event: " + node.eventName);
            showEvents(node.right);
        }
    }

    public void displaySchedule() {
        showEvents(root);
    }
}


