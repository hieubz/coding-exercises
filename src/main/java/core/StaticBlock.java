package core;

public class StaticBlock {

    static int i;

    static {
        i = 10;
        System.out.println("static block code");
    }

    public StaticBlock() {
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.i);
    }

}
