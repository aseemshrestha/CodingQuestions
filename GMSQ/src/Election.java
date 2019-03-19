import java.util.*;
import static java.util.stream.IntStream.*;

public class Election {
    /*
     Find winner of an election where votes are represented as candidate names. Given an array of names of
     candidates in an election.A candidate name in array represents a vote casted to the candidate.
     Print the name of candidates received Max vote. If there is tie, print lexicographically smaller name.
     */
    public void printCandiates(String[] arr) {

        Map<String, Integer> electionMap = new TreeMap<>();

        range(0, arr.length).forEach(i -> {
            if (electionMap.containsKey(arr[i])) {
                electionMap.put(arr[i], electionMap.get(arr[i]) + 1);
            } else {
                electionMap.put(arr[i], 1);
            }
        });

        int max = Collections.max(electionMap.values());

        electionMap.forEach((k, v) -> {
            if (v == max) {
                System.out.println(k);
            }
        });

    }

    public static void main(String[] args) {
        String[] votes = {"john", "johnny", "ateet","jackie", "johnny", "john", "ateet","jackie","ateet", "jamie",
                "jamie", "john", "johnny", "jamie", "johnny", "john", "ayan", "ayan", "ayan", "ayan","ateet"};
        Election election = new Election();
        election.printCandiates(votes);


    }
}
