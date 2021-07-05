class A4{
    public static void main(String[] args){
        System.out.println("Factorial of 5 : "+factorial(5));
        System.out.println("Factorial of 0 : "+factorial(0));
        System.out.println("countTriple(abcXXXabc) : "+countTriple("abcXXXabc"));
        System.out.println("countTriple(xxxabyyyycd): "+countTriple("xxxabyyyycd"));
        System.out.println("countTriple(a) : "+countTriple("a"));
        int[] arr = {3,1,3,1,3};
        System.out.println("haveThree([3,1,3,1,3]) : "+haveThree(arr));
        int[] arr2 = {3,1,3,3};
        System.out.println("haveThree([3,1,3,3]) : "+haveThree(arr2));
        int[] arr3 = {3,4,3,3,4};
        System.out.println("haveThree([3,4,3,3,4) : "+haveThree(arr3));
    }
    public static int factorial(int num){
        if(num<0){
            return -1;
        }
        else if(num==0){
            return 1;
        }
        else{
            int result=1;
            for(int i=num;i>=1;i--){
                result = result * i;
            }
            return result;
        }
    }

    public static int countTriple(String str){
        int len = str.length();
        int count = 0;
        char temp;
        for(int i=0;i<len-2;i++){
            temp = str.charAt(i);
            if(temp == str.charAt(i+1) && temp==str.charAt(i+2)){
                count++;
            }
        }
        return count;
    }

    public static boolean haveThree(int[] nums){
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == 3 && nums[i+1] == 3){
                return false;
            }
            if(nums[i] == 3){
                count++;
            }
        }
        if(nums[nums.length-1]==3){count++;}
        return count == 3;
    }

}