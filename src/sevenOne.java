import java.util.Scanner;

public class sevenOne {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int times=0;
        for(int i=2;i<=n;i++){
            boolean result=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    result=false;
                    break;
                }
            }
            if (result){
                times++;
            }
        }
        System.out.println(times);
    }
}
