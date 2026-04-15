package CoreJava;

import java.util.Scanner;
import java.util.TimerTask;

public class Timer {
        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of seconds to start countdown from: ");
            int response = scanner.nextInt();
            scanner.nextLine();
            java.util.Timer timer = new java.util.Timer();
            TimerTask task = new TimerTask(){

                int count = response;
                @Override
                public void run() {
                    System.out.println("hello");
                    count--;
                    if(count <= 0){
                        System.out.println("TASK COMPLETED!");
                        timer.cancel();
                    }
                }
            };
            timer.schedule(task,1000, 1000);
        }
    }


