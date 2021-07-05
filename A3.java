public class A3 {
    public static void main(String[] args) {
        System.out.println("endOther(\"Hiabc\",\"abc\"): "+endOther("Hiabc", "abc"));
        System.out.println("endOther(\"AbC\",\"HiaBc\"): "+endOther("AbC", "HiaBc"));
        System.out.println("endOther(\"abc\",\"abXabc\"): "+endOther("abc", "abXabc"));

        int[] a1=new int[] {1,2,2,1};
        int[] a2=new int[] {1,1};
        int[] a3=new int[] {1,2,2,1,13};

        System.out.println("\nsum13([1,2,2,1]): "+sum13(a1));
        System.out.println("sum13([1,1]): "+sum13(a2));
        System.out.println("sum13([1,2,2,1,13]): "+sum13(a3));

    }

    public static boolean endOther(String a,String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.equals(b))
            return true;
        else if(b.length()>a.length()) {
            return b.endsWith(a);
        }
        else if(a.length()>b.length()) {
            return a.endsWith(b);
        }
        return false;
    }
    public static int sum13(int[] nums) {
        int sum=0;
        if (nums.length==0)
            return 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]!=13 && nums[i-1]!=13)
                sum+=nums[i];
        }
        if(nums[0]!=13)
            sum+=nums[0];
        return sum;
    }


}