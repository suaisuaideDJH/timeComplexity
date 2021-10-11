import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sevenThree {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] numbers= input.nextLine().split(" ");
        int l=numbers.length;
        int[]nums=new int[l];
        for (int i=0;i<l;i++){
            nums[i]=Integer.parseInt(numbers[i]);
        }
        ArrayList<Integer>list=new ArrayList<>();
        int count=1;
        for (int i=1;i!=nums.length;i++){
            if (nums[i]-nums[i-1]==0){
                count++;
            }else {
                list.add(count);
                count=1;
            }
        }
        for (int k:list){
            count=Math.max(count,k);
        }
        System.out.println(count);
    }
}
