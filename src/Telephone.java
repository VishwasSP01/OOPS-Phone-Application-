import java.security.PrivateKey;

public class Telephone implements Phone{

//    making the attributes
    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;


    public Telephone(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging = false;
       this.isPowerOn = true;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    @Override
    public boolean PowerOn() {
        this.isPowerOn = true;
        return true;
    }

    @Override
    public void CallNumber(String PhoneNum) {
        if(isPowerOn == true)
        {
            System.out.println("you are dialing the number : "+PhoneNum);
        }else {
            System.out.println("Your Telephone is Off");
        }
            return;
    }

    @Override
    public void receiveCall(String phoneno) {
        if(isPowerOn == true && myPhoneNo.equals(phoneno))
        {
            this.isRinging = true;
            System.out.println("Hey "+myPhoneNo+" you are receiving a call");
        }
        else {
            System.out.println("Call not received");
        }
    }

    @Override
    public boolean answerCall() {

        if(isRinging == true)
        {
            System.out.println("You have answered a call");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
