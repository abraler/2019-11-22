
//经过这个了解了map存储的有序性
import java.util.*;

public class Main1{

    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            Map<String,Integer>map=new TreeMap<>();

            String a=in.nextLine();
            int b=in.nextInt();

            int c=0;
            int d=c+b;
            while(d<a.length()){
                map.put(a.substring(c,d),count(a.substring(c,d)));

                c++;
                d++;
            }
            Collection<Integer>e=map.values();
            int  num=Collections.max(e);
            Set set=map.entrySet();
            Iterator iterator=set.iterator();
            while(iterator.hasNext()){
                Map.Entry<String,Integer>entry=(Map.Entry<String,Integer>)iterator.next();
                int B=entry.getValue();
                if(B==num){
                    System.out.println(entry.getKey());
                    break;
                }

            }
        }
    }
    private static int count(String a){
        int num=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='C'||a.charAt(i)=='G'){
                num++;
            }
        }
        return num;
    }
}