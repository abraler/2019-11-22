import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String a = in.nextLine();
            int b = in.nextInt();
            double num=0;//保存最大的字符串中的CG个数
            StringBuffer pro=null;

            for (int i = 0; i <=a.length()-b ; i++) {
                for (int j = i+b; j <=a.length() ; j++) {
                    StringBuffer O=new StringBuffer(a.substring(i,j));
                    System.out.println(O);
                    double znum=count(O);
                    if(znum>num){
                        num=znum;
                        pro=O;
                    }
                }
            }
            System.out.println(pro);

        }
    }
    private static double count(StringBuffer a){
        double num=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='C'||a.charAt(i)=='G'){
                num++;
            }
        }
        return num/a.length();
    }
}