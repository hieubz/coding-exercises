package core.aquarium.jellies;

import java.awt.event.ActionListener;

public class Water {

    private boolean canSwim;
    public static int LENGTH = 5;

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public static void swing() {
        System.out.print("swing ");
    }

    public void climb() {
        System.out.print("climb ");
    }

    public static void play() {
        swing();
    }

  public static void main(String[] args) {

  }
}
