package rabbit;

import java.util.ArrayList;
import java.util.Scanner;

public class TheBestCount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list;        
        int M=scan.nextInt();
        int N=scan.nextInt();
        list = new ArrayList<>();
        if(M<N)
            for(int i=M; i<=N; i++)         
                isDelit(i,list);
        else
            for(int i=N; i<=M; i++)         
                isDelit(i,list);
        System.out.println(list);
    }
    
    static ArrayList isDelit(int m, ArrayList list){
        int sum=0;
        for(int i=(m-1);i>0;i--)
            if((m%i)==0)
                sum+=i; 
        if(sum==m) 
            list.add(m);                   
        return list;
    }
    
}
