public class contributionTechique {
    public static void main(String[] args) { // TC:O(N) SC:O(1)
        int[] arr= {2,8,-1,4};
        int N = arr.length;
        long total = 0;
        for(int i=0; i<N; i++){
            long occurances = (i+1) * (N-i);
            long contribution = occurances * arr[i];
            total = total + contribution;
        }
        System.out.println(total);
    }
}
