import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array and the search element respectively: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Enter the elements to array: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Element found in position "+(binSear(a,k)+1));
    }

     static int binSear(int[] a, int k) {
        int l = 0;
        int h = a.length-1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(k<a[m]){
                h = m-1;
            }else if(k>a[m]){
                l = m+1;
            }else {
                return m;
            }
        }
         System.out.println("Element not found");
        return -1;
    }
}
