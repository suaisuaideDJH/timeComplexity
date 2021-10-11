import java.util.Arrays;
import java.util.Scanner;
public class sixOne {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print(containsDuplicate(array));
    }
    public static boolean containsDuplicate(int num[]){
        for(int i=0;i<num.length;i++){
            for (int j=i+1;j<num.length;j++) {
                if (num[i]==num[j])
                    return true;
            }
        }
        return false;
    }
}
