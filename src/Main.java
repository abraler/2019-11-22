
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){

            int a=in.nextInt();
            int []b=new int[a];
            int p=0;
            for (int i = 0; i <a ; i++) {
                b[i]=in.nextInt();
            }
            queue(b,p);
        }
    }

    private static void queue(int[] a,int p) {
        if(p==a.length){
            for (int i = 0; i <a.length-1 ; i++) {
                System.out.print(a[i]);
                System.out.print(" ");
            }
            System.out.print(a[a.length-1]);
            System.out.println();
            return;
        }
        for (int i = p; i <a.length ; i++) {
            int t=a[p];
            a[p]=a[i];
            a[i]=t;

            queue(a,p+1);

            t=a[p];
            a[p]=a[i];
            a[i]=t;
        }
    }
}
