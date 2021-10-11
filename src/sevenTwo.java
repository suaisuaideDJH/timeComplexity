import java.util.Scanner;

public class sevenTwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        int y= input.nextInt();
        int sum=1;
        int temp=1;
        if(y>=10000){
            temp=10000;
            while(y%temp!=0)
                temp++;
        }
        for(int i=0;i<=y/temp-1;i++){
            sum=sum*x;
            if(sum>=1000)
                sum=sum%1000;
        }
        if(temp!=1){
            for(int i=0;i<=temp-1;i++){
                sum=sum*x;
                if(sum>=1000){
                    sum=sum%1000;
                }
            }
        }
        System.out.println(sum);
    }
}