package dsaanuj3;

public class Majorityvote {
    // moore's voting algorithm logic:

    public static int findMajority(int[] nums)
    {
        int count = 0, candidate = -1;
        //finding majority candidate

        for (int index=0;index<nums.length;index++)
        {
            if (count==0){
                candidate = nums[index];
                count = 1;
            }
            else {
                if (nums[index] == candidate)
                    count++;
                else
                    count--;
            }
        }
        //checking if majority candidate occurs more than
        // n/2 times
        count = 0;
        for (int index = 0;index<nums.length;index++)
        {
            if (nums[index]==candidate)
                count++;
        }
        if (count>(nums.length/2))
            return candidate;
        return -1;

    }

    public static void main(String[] args) {
        int arr[] ={1,1,1,2,3,4,1};
        int majority = findMajority(arr);
        System.out.println("The majority element is:"+majority);
    }
}
