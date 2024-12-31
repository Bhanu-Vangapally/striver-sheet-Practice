class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            int mn=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[mn]) mn=j;
            }
            int t=arr[mn];
            arr[mn]=arr[i];
            arr[i]=t;
        }
    }
}