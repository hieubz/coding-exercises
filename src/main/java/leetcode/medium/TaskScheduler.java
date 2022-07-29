package leetcode.medium;


public class TaskScheduler {

      public int leastInterval(char[] tasks, int n) {
          int[] counter = new int[26];
          int maxTimeUnit = 0;
          int numTaskWithMaxTimeUnit = 0;
          for (char task : tasks) {
              counter[task - 'A']++;
              if (maxTimeUnit == counter[task - 'A']) {
                  numTaskWithMaxTimeUnit++;
              } else if (maxTimeUnit < counter[task - 'A']) {
                  numTaskWithMaxTimeUnit = 1;
                  maxTimeUnit = counter[task - 'A'];
              }
          }

          int partCount = maxTimeUnit - 1;
          int partLength = n - (numTaskWithMaxTimeUnit - 1);
          int emptySlots = partCount * partLength;
          int availableTasks = tasks.length - maxTimeUnit * numTaskWithMaxTimeUnit;
          int idles = Math.max(0, emptySlots - availableTasks);
          return tasks.length + idles;
      }
}
