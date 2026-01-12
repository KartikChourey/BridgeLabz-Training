package callcenter;

class Call {

    String customerId;
    String name;
    boolean isVIP;

    public Call(String customerId, String name, boolean isVIP) {
        this.customerId = customerId;
        this.name = name;
        this.isVIP = isVIP;
    }
}

