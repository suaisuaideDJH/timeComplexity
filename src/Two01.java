import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Two01 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int count=1;
       int number= input.nextInt();
       Stack<Integer>train=new Stack<>();
       for (int i=0;i<number;i++){
           train.add(input.nextInt());
       }
       Stack<Integer>track=new Stack<>();
        track.add(train.get(0));
        train.remove(0);
        for (int i=0;i<train.size();i++){
            if (track.peek()>train.get(i)){
                track.add(train.get(i));
                train.remove(i);
                i--;
            }
        }
        Stack<Integer>track1=new Stack<>();
       while (!train.isEmpty()){
           track1.add(train.get(0));
           train.remove(0);
           count++;
           for (int i=0;i<train.size();i++){
               if (track1.peek()>train.get(i)){
                   track1.add(train.get(i));
                   train.remove(i);
                   i--;
               }
           }
       }
       for (int i=0;i<track.size();i++) {
           System.out.print(track.get(i));
           if (i<track.size()-1){
               System.out.print(" ");
           }
       }
        System.out.println();
        System.out.println(count);
    }
}
