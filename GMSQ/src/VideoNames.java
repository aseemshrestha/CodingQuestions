import java.util.*;
import java.util.stream.Collectors;

public class VideoNames {

    String[][] videos = new String[][]{{"abc", "10"}, {"def", "15"}, {"ghi", "10"}, {"abc", "12"}, {"xyz", "100"}};
    Map<String, Integer> videoMap = new HashMap<>();

    public void videoNames() {

        for (int i = 0; i < videos.length; i++) {
            videoMap.put(videos[i][0], Integer.parseInt(videos[i][1]));
        }

        List<String> collect = videoMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

      //  System.out.println(map);
        Collections.reverse(collect);
        List<String> filteredList = collect.subList(0, 2);
        System.out.println(filteredList);
    }

    public static void main(String[] args) {
        VideoNames vn = new VideoNames();
        vn.videoNames();
    }
}
