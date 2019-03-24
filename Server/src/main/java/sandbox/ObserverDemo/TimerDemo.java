package sandbox.ObserverDemo;

import java.util.Scanner;

public class TimerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }
            System.out.println(input);
        }
    }
}
