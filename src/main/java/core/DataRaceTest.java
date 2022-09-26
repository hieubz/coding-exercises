package core;

import java.util.concurrent.atomic.AtomicInteger;

public class DataRaceTest {

  private AtomicInteger counter = new AtomicInteger(0);

  public void increment() {
    while (true) {
      int existingValue = counter.get();
      int newValue = existingValue + 1;
      if (counter.compareAndSet(existingValue, newValue)) {
        return;
      }
    }
  }
}
