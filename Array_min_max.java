public class Array_min_max {
    public static void main(String[] args) {
        int arr[]={67,90,12,5,6,7,34,35};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max) max=arr[i];
        }System.out.println(max);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=min) min=arr[i];
        }System.out.println(min);
    }
}
