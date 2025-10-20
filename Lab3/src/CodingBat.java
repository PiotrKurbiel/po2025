public class CodingBat {
    public static boolean mixStart(String str) {
        if(str.length()<= 2){
            return false;
        }
        if((str.charAt(1) == 'i') && (str.charAt(2) == 'x')){
            return true;
        }
        else{
            return false;
        }
    }

    public static int diff21(int n) {
        if(n <= 21){
            return Math.abs(n-21);
        }
        else{
            return Math.abs(2*(n-21));
        }
    }
    public static int countEvens(int[] nums)
    {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                count ++;
            }
        }
        return count;
    }
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static void main() {
        String str = "elozelo";
        int n = 32;
        int[] nums = {1,2,3,4,5,6};
        boolean t1 = mixStart(str);
        System.out.println(t1);
        int t2 = diff21(n);
        System.out.println(t2);
        int t3 = countEvens(nums);
        System.out.println(t3);
        String t4 = helloName(str);
        System.out.println(t4);
    }

}
