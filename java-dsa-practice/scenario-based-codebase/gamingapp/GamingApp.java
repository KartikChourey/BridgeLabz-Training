package gamingapp;



public class GamingApp {

    private PlayerNode root;


    int height(PlayerNode node) {
        return (node == null) ? 0 : node.height;
    }


    int getBalance(PlayerNode node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    PlayerNode rotateRight(PlayerNode y) {
        PlayerNode x = y.left;
        PlayerNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

 
    PlayerNode rotateLeft(PlayerNode x) {
        PlayerNode y = x.right;
        PlayerNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

 
    PlayerNode insert(PlayerNode node, int score, String name) {

        if (node == null)
            return new PlayerNode(score, name);

        if (score < node.score)
            node.left = insert(node.left, score, name);
        else if (score > node.score)
            node.right = insert(node.right, score, name);
        else {
         
            node.name = name;
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

   
        if (balance > 1 && score < node.left.score)
            return rotateRight(node);

        if (balance < -1 && score > node.right.score)
            return rotateLeft(node);

    
        if (balance > 1 && score > node.left.score) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && score < node.right.score) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void addPlayer(int score, String name) {
        root = insert(root, score, name);
    }


    PlayerNode maxValue(PlayerNode node) {
        PlayerNode current = node;
        while (current.right != null)
            current = current.right;
        return current;
    }

    
    PlayerNode delete(PlayerNode node, int score) {

        if (node == null) return node;

        if (score < node.score)
            node.left = delete(node.left, score);
        else if (score > node.score)
            node.right = delete(node.right, score);
        else {
            if (node.left == null || node.right == null) {
                node = (node.left != null) ? node.left : node.right;
            } else {
                PlayerNode temp = maxValue(node.left);
                node.score = temp.score;
                node.name = temp.name;
                node.left = delete(node.left, temp.score);
            }
        }

        if (node == null) return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        
        if (balance > 1 && getBalance(node.left) >= 0)
            return rotateRight(node);

        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && getBalance(node.right) <= 0)
            return rotateLeft(node);

        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void removePlayer(int score) {
        root = delete(root, score);
    }

 
    void showTopPlayers(PlayerNode node, int[] count) {
        if (node == null || count[0] >= 10) return;

        showTopPlayers(node.right, count);

        if (count[0] < 10) {
            System.out.println("Rank " + (count[0] + 1) +
                    " → " + node.name + " | Score: " + node.score);
            count[0]++;
        }

        showTopPlayers(node.left, count);
    }

    public void displayTop10() {
        int[] count = {0};
        showTopPlayers(root, count);
    }
}
