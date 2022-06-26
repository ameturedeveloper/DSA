import java.util.Scanner;

public class Quicksort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array and enter the elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        QuickSort(a,0,a.length-1);
        for(int e:a) {
            System.out.print(e);
        }

    }
    private static void QuickSort(int []a,int l, int h) {
        if(l<h){
            int p = Partition(a,l,h);
            QuickSort(a,l,p-1);
            QuickSort(a,p+1,h);
        }
    }
    private static int Partition(int a[],int l, int h) {
        int p = a[l];
        int i =l;
        int j = h;
        while(i<j){

            while(p >= a[i]) i++;
            while(p < a[j]) j--;

            if(i<j){
                swap(a,i,j);
            }
            swap(a,l,j);
        }
        return j;
    }
    static void swap(int a[], int p, int q){
        int t = a[p];
        a[p] = a[q];
        a[q] = t;
    }
}
