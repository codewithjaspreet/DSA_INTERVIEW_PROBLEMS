
// bubble sort word problem - gfg

class Solution
{
    public static int shouldPunish (int roll[], int marks[], int n, double avg)
    {
        // your code here
        int swaps = BubbleSort(marks,n);
        
        int oldMarks = 0;
        
        for(int a : marks){
            oldMarks+=a;
        }
        int newMarks = oldMarks - swaps;
        
        double navg = (newMarks * 1.0)/ n;
        
        if(navg < avg) return 0;
        
        else{
              return 1;
        }
    }
    
    public static int  BubbleSort(int[] marks , int n ){
        int swaps = 0;
        
        for(int i = 0 ; i <  n - 1  ; i++){
            
            for(int  j = 0  ; j < n - i - 1  ; j++ ){
                
                if(marks[j]  >  marks[j + 1] ){
                    swaps+=2;
                    swap(marks , i , j);
                }
            }
        }
        
        return swaps;
    }
    
    private static void swap(int[] arr  , int i , int j ){
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;
        
        
    }
}