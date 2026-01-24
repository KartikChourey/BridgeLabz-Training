package chatlogparser;

interface MessageFilter<T> {
    boolean allow(T message);
}