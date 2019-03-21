import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LowestSumForFivePrimes
{
    public static Map<Integer, Boolean> primeMap = new HashMap<>();
    public static Map<Integer, List<Integer>> commonsMap = new HashMap<>();
    static final Integer MAX = 100;

    public static long computeRemarkablePrimes(int n)
    {
        long sum = -1;
        for (int i = 2; i <= MAX; i++) {
            // check if number is prime
            if (isPrime(i)) {
                ArrayList<Integer> primesMappedToAOuterLoopNumber = new ArrayList<>();
                commonsMap.put(new Integer(i), primesMappedToAOuterLoopNumber);
                // find the prime for each number
                for (int j = i+1; j <= MAX;j++) {
                    if (isPrime(j)) {
                        // if prime, concat and convert string to int and add to map
                        int p1 = Integer.parseInt(""+j+i);
                        int p2 = Integer.parseInt(""+i+j);
                        // for e.g. 3 will be mapped to [7, 11, 17, 31..]
                        // only concatenated prime numbers will be added
                        if (isPrime(p1) && isPrime(p2)) {
                            primesMappedToAOuterLoopNumber.add(new Integer(j));
                        }
                    }
                }
            }
        }
        for (int i = 2; i <= MAX; i++)
        {
            List<Integer> primeListForAParentNumer = commonsMap.get(new Integer(i));
          //  System.out.println(primeListForAParentNumer);
            List<Integer> answers = getMinimumMatch(primeListForAParentNumer, n-1);
            answers.add(new Integer(i));
            if (answers.size() == n) {
                sum = sum + answers.stream().mapToLong(Integer::intValue).sum();
                break;
            }
        }
        return sum;
    }

    private static List<Integer> getMinimumMatch(List<Integer> primesListOfAParent, int size)
    {
        //System.out.println(primesListOfAParent); //3 - > [7, 11, 17, 31, 37, 59, 67, 73..]
        if (primesListOfAParent!=null && primesListOfAParent.size() >= size)
        {
            for(Integer parent: primesListOfAParent)
            {
              //  System.out.println("parent:" + parent); //7
                List<Integer> listOfPrimesFromParent = commonsMap.get(parent); // 7 - > 19,61, 97...
               // System.out.println("child:" + listOfPrimesFromParent);
                List<Integer> test = new ArrayList<>();
                for (Integer integer : listOfPrimesFromParent) {
                    if (primesListOfAParent.contains(integer)) {
                        test.add(integer);
                    }
                }
                if (test.size() >= (size)-1) // we got a match
                {
                    if (size == 2)
                    {
                        List<Integer> answer = new ArrayList<>();
                        answer.add(test.get(0));
                        answer.add(parent);
                        return answer;
                    }
                    List<Integer> answer = getMinimumMatch(test, size-1);
                    answer.add(parent);
                    if (answer.size() == size)
                    {
                        return answer;
                    }
                }
            }
        }
        return new ArrayList<>();
    }

    private static boolean isPrimeBrute(int num)
    {
        boolean is_prime = true;
        double sqrt = Math.sqrt(num);
        for(int i=2; i <= sqrt; ++i)
        {
            int mod = num % i;
            if (mod==0)
            {
                is_prime = false;
                break;
            }
        }
        return is_prime;
    }

    private static boolean isPrime(int num)
    {
        return primeMap.computeIfAbsent(new Integer(num), n -> isPrimeBrute(n));
    }

    public static void main(String[] args)
    {
        long sum = computeRemarkablePrimes(5);
        System.out.println(sum);
    }
}
