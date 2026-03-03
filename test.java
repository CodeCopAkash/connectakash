import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you binary number: ");
        String nums = sc.nextLine();
        int count = 0;
        int len = nums.length();
        int result = 0;
        for(int i=len-1;i>=0;i--){
            if (nums.charAt(i)=='1') {
                result += Math.pow(2,count);
            }
            count++;
        }
        System.out.println(nums + " in decimal is : "+result);
    }
}