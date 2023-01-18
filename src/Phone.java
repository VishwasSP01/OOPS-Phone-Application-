public interface Phone {
    boolean PowerOn();
    void CallNumber(String PhineNum);
    void receiveCall(String phoneno);
    boolean answerCall();
    boolean isRinging();

}
