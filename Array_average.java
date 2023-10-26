public class Array_average {
    public static void main(String[] args) {
        int[] arr={1,45,89,90,12,45,78,88,45,67};
        int sun=0;
        for(int i:arr){
            sun+=i;
        }
        System.out.println(sun/arr.length);
    }
}
