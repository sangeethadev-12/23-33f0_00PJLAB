import java.util.Arrays;
import java.util.Scanner;
class BinarySearch{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  no of elements:");
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element " +i);
            ar[i]=sc.nextInt();
        }
            System.out.println("enter the key:");
            int key=sc.nextInt();
            int low=0;
            int high=n-1;
            int result=-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(ar[mid]==key)
                {
                    result=mid;
                    break;
                }
                else if(ar[mid]==key)
                {
                    high=mid+1;
                }
                else{
                    low=mid-1;
                }
            }
            if(result==-1)
            {
                System.out.println("element not found");
            }
            else{
                System.out.println("element found at position:"+result);
            }
        }
    }
