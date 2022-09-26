package oo_design.call_center;

public class Call {

    private int rank = 1; // default

    public Call(Caller caller) {}

    public void increaseRank(int i) {
        rank += i;
    }
}
