class Solution
{
    ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        
        Arrays.sort(arr);
        ArrayList<Long> arr1 = new ArrayList<>();
        int i=0;
        int j = N-1;
        while(i<=j){
            arr1.add(arr[j]);
            arr1.add(arr[i]);
            i++;
            j--;
        }
        
        return arr1;
    }
}
