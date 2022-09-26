package leetcode.medium;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateFileInSystem {

  public List<List<String>> findDuplicate(String[] paths) {
    // map : content : list path files
    Map<String, List<String>> map = new HashMap<>();
    StringBuilder dir = new StringBuilder();
    for (String path : paths) {
      String[] files = path.trim().split(" ");
      if (files.length <= 1) continue;
      dir.setLength(0);
      dir.append(files[0]);
      int dirLength = files[0].length();
      for (int i = 1; i < files.length; i++) {
        String[] splitFile = files[i].split("\\(");
        String content = splitFile[1].substring(0, splitFile[1].length() - 1);
        String filePath = dir.append("/").append(splitFile[0]).toString();
        List<String> list = map.getOrDefault(content, new ArrayList<>());
        list.add(filePath);
        map.put(content, list);
        dir.setLength(dirLength);
      }
    }
    return map.values().stream()
        .filter(strings -> strings.size() > 1)
        .collect(Collectors.toList());
  }
}
