class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l<r){
            int md=(l+r)/2;
            mergeSort(arr,l,md);                        
            mergeSort(arr,md+1,r);                        
            merge(arr,l,md,r);                        
        }
    }
        void merge(int arr[],int l,int md,int r){
            // int md=(l+r)/2;
            int n1=md-l+1;
            int n2=r-md;
            int l1[]=new int[n1];
            int r1[]=new int[n2];
            for(int i=0;i<n1;i++){
                l1[i]=arr[l+i];
            }
            for(int j=0;j<n2;j++){
                r1[j]=arr[md+j+1];
            }
            int i=0,j=0,k=l;
            while(i<n1 && j<n2){
                if(l1[i]<=r1[j]){
                    arr[k++]=l1[i++];
                }else{
                    arr[k++]=r1[j++];
                }
            }
            while(i<n1){
                arr[k++]=l1[i++];
            }
            while(j<n2){
                arr[k++]=r1[j++];
            }
        }
        
    
}