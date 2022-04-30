import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Descsort20220428 {
    class Solution {
        public long solution(long n) {
            long answer = 0;
            String s = Long.toString(n);

            String arr [] = s.split("");
            Arrays.sort(arr);
            Collections.reverse(Arrays.asList(arr));
            System.out.println(Arrays.toString(arr));

            answer = Long.parseLong(Arrays.stream(arr).collect(Collectors.joining()));

            return answer;
        }
    }
}

