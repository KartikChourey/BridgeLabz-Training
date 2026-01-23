package gamingapp;

class PlayerNode {
    int score;
    String name;
    int height;
    PlayerNode left, right;

    PlayerNode(int score, String name) {
        this.score = score;
        this.name = name;
        this.height = 1;
    }
}
