import java.util.stream.Stream;

public class sort {

    public  void mergeSort(int[] nums,int left,int right,int merge[]){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(nums,left,mid,merge);
            mergeSort(nums,mid+1,right,merge);
            merge(nums,left,mid,right,merge);
        }
    }

    public  void merge(int[] a,int left,int mid,int right,int[] merge){
        int p1 = left;
        int p2 = mid + 1;
        int k = left;
        while(p1 <= mid && p2 <= right){
            if(a[p1] <= a[p2]){
                merge[k++] = a[p1++];
            }else{
                merge[k++] = a[p2++];
            }
        }

        while(p1 <= mid) merge[k++] = a[p1++];
        while(p2 <= right) merge[k++] = a[p2++];

        for (int i=left; i <= right; i++) {
            a[i]=merge[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {4,6,2,9,8};
        int[] merge = new int[a.length];
        sort s = new sort();
        s.mergeSort(a,0,a.length -1,merge);
        for (int i=0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
