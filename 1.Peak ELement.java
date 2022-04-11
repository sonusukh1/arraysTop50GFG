
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
    //   if(n==1)
    //   return 0;
        int start=0;
        int end=n-1;
      
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                
                end=mid;
                
            }
            
            else {
                start=1+mid;
            }
            
            
        }
        return start;
        
     // O(n)  
        
       //add code here.
    //   if(n==1)
    //   return 0;
    //   for(int i=0;i<n;i++)
    //   {
    //       if(i==0)
    //       {
    //           if(arr[i]>arr[i+1])
    //           return i;
    //       }
    //       else if(i==n-1)
    //       {
    //           if(arr[i]>arr[i-1])
    //           return i;
    //       }
    //       else if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
    //       return i;
    //   }
    // return -1;   
    }
    
}
