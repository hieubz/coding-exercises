package leetcode.hard;

class LFUCache {

  private int capacity;

  public LFUCache(int capacity) {
    this.capacity = capacity;
  }

  public int get(int key) {}

  public void put(int key, int value) {}

  /**
   * doubly linked list => when put: + existed => remove it in cache and list + full => remove the
   * last one in list and cache + insert new one
   *
   * <p>- when get: remove old node it from linked list, add to the front (after the head)
   *
   * <p>----- LFU: LRU + frenquency => linked list + hashmap (key, value) + hashmap (key, freq)
   *
   * <p>=> when put: + existed => increase hashmap freq, insert hashmap value, remove from linked
   * list and add again + full => check key with min freq, remove from hashmap freq, remove from
   * hashmap value, remove from linked list + insert new node to hashmap value and linked list,
   * update hashmap freq
   */
}
