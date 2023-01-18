public class Main {
    public static void main(String[] args) {

        Telephone l1 = new Telephone("123");
        Telephone l2 = new Telephone("465");

        l1.CallNumber("465");
        l2.receiveCall("465");
        System.out.println(l2.answerCall());
    }
}