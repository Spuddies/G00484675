package ie.atu.oop.week1;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Workshop workshop = new Workshop();
        int Regattempts,Accepted=0,Rejected=0;
        boolean running = true;
        HashSet<String> ID = new HashSet<>();
        while (running) {
            Scanner input =  new Scanner(System.in);
            System.out.println("enter workshop name");
            String workshopName  = input.nextLine();
            System.out.println("enter register attempts");
            Regattempts = input.nextInt();
            System.out.println("enter capacity");
            int capacity = input.nextInt();
            System.out.println("enter student IDs");
            for (int i=0;i<=Regattempts;i++) {
                ID.add(input.nextLine());
                if(Regattempts == capacity) {
                    Regattempts ++;
                }

            }
            System.out.printf("Workshop name: %s\n",workshopName);
            System.out.printf("Capacity: %d\n",capacity);
            System.out.println("register attempts:\n");
            System.out.printf("Student IDs: %s\n",ID.toString());








        }






    }
}