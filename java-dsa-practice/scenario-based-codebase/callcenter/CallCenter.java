package callcenter;

public class CallCenter {

    public static void main(String[] args) {

        Manager callManager = new Manager();

        Call c1 = new Call("C101", "Amit", false);
        Call c2 = new Call("C102", "Riya", true);
        Call c3 = new Call("C103", "Rahul", false);
        Call c4 = new Call("C104", "Sneha", true);

        callManager.receiveCall(c1);
        callManager.receiveCall(c2);
        callManager.receiveCall(c3);
        callManager.receiveCall(c4);

        System.out.println();

        callManager.serveCall();
        callManager.serveCall();
        callManager.serveCall();

        callManager.displayCallCount();
    }
}
