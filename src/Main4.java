public class Main4 {
    public static void main(String[] args) {
        int num=10*30;
        int Qnum=0;
        for (int i = 0; i <30 ; i++) {
            Qnum+=Math.pow(2,i);
        }

        System.out.println(Qnum);
        System.out.println(num);
    }
}
