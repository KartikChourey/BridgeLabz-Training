package medistore;

public interface ISellable {
    boolean sell(int units);
    boolean checkExpiry();
}
