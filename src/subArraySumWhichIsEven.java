public class subArraySumWhichIsEven {
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,8,9,2,5,10,13};
        int N = arr.length;
        int count = 0;
        for(int start =0; start<N; start++){
            int sum =0;
            for(int end =start; end<N; end++){
                sum =  sum + arr[end];
                if(sum % 2 == 0){
                    count  =count +1;
                }
            }
        }
        System.out.println(count);
    }
}
