public class A2 {
    public static void main(String[] args){
        System.out.println(true);
        System.out.println(false);
        System.out.println(false);
        System.out.println(false);
        System.out.println();
        System.out.println(loneSum(1,2,3));
        System.out.println(loneSum(3,2,3));
        System.out.println(loneSum(3,3,3));
        System.out.println();
        System.out.println(blackjack(19,21));
        System.out.println(blackjack(21,19));
        System.out.println(blackjack(19,22));
        System.out.println(blackjack(22,54));

    }
    public static boolean answerCell(boolean isMorning,boolean isMom,boolean isAsleep){
        if (isAsleep) return false;
        return !isMorning || isMom;

    }
    public static int loneSum(int a,int b,int c){
        if(a==b && b==c) return 0;
        else if(a==c) return b;
        else if (b==c) return a;
        else if(a==b) return c;
        else return a+b+c;
    }
    public static int blackjack(int a,int b){
        if(a<=21 && b<=21){
            return Math.max(a, b);
        }
        if(a <= 21 || b <= 21) {
            if(a<=21) return a;
            else return b;
        }
        return 0;
    }

}