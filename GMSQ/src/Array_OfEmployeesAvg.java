import java.util.*;

/*
Given an array of Employees with name,marks. Find out the maximum average marks from the list.
{"Alia","-678"},
{"Bobby","100"},
{"Alex","223"},
{"Alex","-23"},
{"Bobby","550"}
};
Avg Bobby = 315,Alex= 100,Alia=-678. Result: 315
 */
public class Array_OfEmployeesAvg {

    public static void main(String[] args) {

        String employees[][] = {{"Alia","-678"},{"Bobby","100"},{"Alex","223"},{"Bobby","550"},{"Alex","-23"},{"Bobby","550"},{"Bobby","5150"}};
        Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, Integer> counter = new LinkedHashMap<>();


        for (int i = 0; i < employees.length; i++) {
            if (!map.containsKey(employees[i][0])) {
                map.put(employees[i][0], Integer.parseInt(employees[i][1]));
                counter.put(employees[i][0], 1);
            } else {
                map.put(employees[i][0], map.get(employees[i][0]) + Integer.parseInt(employees[i][1]));
                counter.put(employees[i][0], counter.get(employees[i][0]) + 1);
            }
        }
        System.out.println(map);
        System.out.println(counter);
        System.out.println("highest:" + Collections.max(map.values()));
        int maxValue = Collections.max(map.values());
        String name = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxValue == entry.getValue()) {
                name = entry.getKey();
            }
        }
        System.out.println("name:" + name);
        double avg = 0.0;
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
           if(entry.getKey().equals(name)) {
               avg = maxValue/entry.getValue();
           }
        }
        System.out.println("average:" + avg);

    }
}
