package sort;

public class MergeSort {
    public void sort(int[] arr){
        mergeSort(arr,0,arr.length-1);

    }

    private void mergeSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }

        int mid = (start+end)/2;

        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);

        merge(arr,start,mid,end);

    }
    private void merge(int[] arr,int start,int mid,int end){
        int start1 = start;
        int start2 = mid+1;

        int k=0;

        int[] arrNew = new int[end-start+1];
        while (start1<=mid && start2<=end){
            if(arr[start1]<arr[start2]){
                arrNew[k] = arr[start1];
                start1++;
            }else {
                arrNew[k] = arr[start2];
                start2++;
            }
            k++;
        }

        while (start1<=mid){
            arrNew[k] = arr[start1];
            k++;
            start1++;
        }
        while (start2<=end){
            arrNew[k] = arr[start2];
            k++;
            start2++;
        }

        //copy
        for(int i=start,j=0;i<=end;i++,j++){
            arr[i] = arrNew[j];
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,3,5,8,3,5,6,7,9,3,557,5,32,23,6,1};
        MergeSort sort = new MergeSort();
        sort.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }


    }
}
