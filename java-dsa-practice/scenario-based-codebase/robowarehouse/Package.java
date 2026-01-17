package robowarehouse;

class Package {
    int id;
    int weight;

    public Package(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Package ID: " + id + ", Weight: " + weight + "kg";
    }
}