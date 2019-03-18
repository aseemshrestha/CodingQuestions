import java.util.*;

/*
Given an array of Employees with name,marks. Find out the maximum average marks from the list.
{"Alia","-678"},
{"Bobby","100"},
{"Alex","223"},
{"Alex","-23"},
{"Bobby","723"}
};
Avg Bobby = 315,Alex= 100,Alia=-678. Result: 315
 */
public class Array_OfEmployeesAvg {

    public static void main(String[] args) {

        String employees[][] = {{"Alia", "-678"}, {"Bobby", "100"}, {"Alex", "223"},
                {"Alex", "-23"}, {"Bobby", "723"}};

        Map<String, Integer> map = new LinkedHashMap<>();
        int counter = 1;
        for (int i = 0; i < employees.length; i++) {
            if (!map.containsKey(employees[i][0])) {
                map.put(employees[i][0], Integer.parseInt(employees[i][1]));
            } else {
                counter++;
                int marks = map.get(employees[i][0]);
                marks = marks + Integer.parseInt(employees[i][1]);
                map.put(employees[i][0], (marks / counter));
                counter = 1;
            }
        }

        System.out.println(map);
        System.out.println(Collections.max(map.values()));
    }
}
