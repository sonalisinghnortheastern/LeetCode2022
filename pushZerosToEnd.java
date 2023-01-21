public static void pushZerosToEnd(int arr[], int n){
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                //   Swap - A[j] , A[i]
                swap(arr, j, i); // Partitioning the array
                j++;
            }
        }
    }
    public static void swap(int[] A, int a, int b)
    {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
