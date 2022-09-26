package oo_design.call_center;

public abstract class Employee {
    private Call currentCall = null;
    protected int rank;
    private CallHandler callHandler;

    public Employee(CallHandler callHandler) {this.callHandler = callHandler;}

    public void receiveCall(Call call) {}

    public void endCall() {}

    public boolean isFree() {return currentCall == null;}

    public void escalateAndReassign() {
        currentCall.increaseRank(1);
//        callHandler.dispatchCall(currentCall);
    }
}
