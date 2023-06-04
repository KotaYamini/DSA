/**
 * Count pairs [a,g]
 * Given a char  ch[N], calculate no.of pairs index[i,j] such that i&j && ch[i] == 'a' && ch[j] == 'g'. All characters are lowercase
 *
 * constraints:
 *  1 <= N <= 10^5
 *  'a' <= ch[i] <= 'z'
 * */


public class carryForward {
    public static void main(String[] args) {

        // Brute Force Approach
        String  str = "aegaeggaaga";
        char ch[] = str.toCharArray();
        int N = ch.length;
        int count = 0;
        for(int i=0; i< N; i++){
            for(int j= i+1; j<N; j++){
                if(ch[i] == 'a' && ch[j] == 'g'){
                    count = count +1;
                }
            }
        }
        System.out.println(count);
    }
}
