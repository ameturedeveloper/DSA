import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i =0;i <n;i++) {
            a[i] = sc.nextInt();
        }
        mergeSort(a,n);
        for(int i =0;i <n;i++){
            System.out.print(a[i]+ " ");
        }

    }

    private static void mergeSort(int[] a, int n) {
        int[] b = new int[n/2];
        int[] c = new int[n-n/2];
        if(n>1) {
        for(int i=0;i<n/2;i++){
            b[i] = a[i];
        }
        for(int i =n/2,j=0;i<n;i++,j++){
            c[j] = a[i];
        }

            mergeSort(b, n / 2);
            mergeSort(c, n - n / 2);
            merge(a, b, c, n / 2, n - n / 2, n);
        }
    }

    private static void merge(int[] a, int[] b, int[] c, int p, int q, int n) {
        int i=0,j=0,k=0;
        while(i<p && j<q){
            if(b[i] < c[j]){
                a[k++] = b[i++];
            }else{
                a[k++] = c[j++];
            }
        }
        if(i==p){
            while(j<q){
                a[k++] = c[j++];
            }
        }else {
            while(i<p){
                a[k++] = b[i++];
            }
        }
    }
}
