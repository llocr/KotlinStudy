package chap06.section03;

public class OCustomerAccess {
    public static void main(String[] args) {
        String name = OCustomer.INSTANCE.getName();
        System.out.println(name);
    }
}
