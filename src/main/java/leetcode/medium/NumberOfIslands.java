package leetcode.medium;

public class NumberOfIslands {

  public static void main(String[] args) {
    char[][] grid =
        new char[][] {
          {'1', '1', '1', '0'},
          {'1', '1', '0', '1'},
          {'1', '1', '0', '1'}
        };

    NumberOfIslands counter = new NumberOfIslands();
    System.out.println(counter.numIslands(grid));
  }

  // Time: O(M*N)
  // Space: O(M + N)
  public int numIslands(char[][] grid) {
    int count = 0;
    // traverse through all locations
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        // find a starting point
        if (grid[i][j] == '1') {
          dfs(grid, i, j);
          count++;
        }
      }
    }

    return count;
  }

  void dfs(char[][] grid, int x, int y) {
    grid[x][y] = '0';
    if (x > 0 && grid[x - 1][y] == '1') {
      dfs(grid, x - 1, y);
    }

    if (x < grid.length - 1 && grid[x + 1][y] == '1') {
      dfs(grid, x + 1, y);
    }

    if (y > 0 && grid[x][y - 1] == '1') {
      dfs(grid, x, y - 1);
    }

    if (y < grid[0].length - 1 && grid[x][y + 1] == '1') {
      dfs(grid, x, y + 1);
    }
  }
}
