package com.company;

public class InsertionSort {
    public static void insertionSort(int[] arr)
    {
        //loop through the entire array, use an index i
        for(int i = 0; i < arr.length; i++)
        {
            //loop from index i back to the beginning of the array, use index j
            for(int j = i; j > 0; j--)
            {
                //if element at j-1 is greater than element at j, swap them
                if(arr[j-1] > arr[j])
                {
                    SortingUtil.swap(arr,j-1,j);
                }
                //else set j  to 0
                else
                {
                    j = 0;
                }
            }

        }
    }

}
