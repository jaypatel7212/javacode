package Sheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class pair{
    int first;
    int second;
    pair(int first,int second)
    {
        this.first=first;
        this.second=second;

    }
    pair()
    {

    }
}

public class Array19 {
    public static void main(String[] args) {

        int arr[]={3,3,5,2,1,1,2};
        int n= arr.length;
        Sortelementsbyfreq(arr,n);

    }


    static void Sortelementsbyfreq(int arr[],int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<pair> vec = new ArrayList<>();
        for (int x: map.keySet())
        {
            vec.add(new pair(x,map.get(x)));
        }
        Collections.sort(vec,(a,b)->{
            if (a.second==b.second)
                return a.first-b.first;
            else
                return b.second-a.second;
           });


        for (int i = 0; i < vec.size(); i++)
        {
            while (vec.get(i).second > 0)
            {
                System.out.print(vec.get(i).first+" ");
                vec.get(i).second--;
            }
        }

}
}
