
public class QuickSort {
    public static  void main(String args[])
    {
        int arr[]={7,3,4,6,9,10,2,5,1};
        printarr(arr);
        quickSort(arr,0,arr.length-1);
        printarr(arr);

    }
    public static void quickSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        //last element
        int pIdx = partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);//left
        quickSort(arr, pIdx+1, ei);//right        
   }
   public static int partition(int arr[],int si,int ei)
   {
        int pivot = arr[ei];
        int i = si-1; //to make place for elements smaller than pivot

        for(int j=si;j<ei;j++)
        {
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        i++;
        //swap
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
            
   }
    
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
