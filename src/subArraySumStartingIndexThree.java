public class subArraySumStartingIndexThree {
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,13,9,8,5,6,7};
        int N =arr.length;
        int sum = 0;
        int start =3;
        for(int end = start; end <N; end++){
            sum = sum+ arr[end];
        }
        System.out.println(sum);
    }
}
