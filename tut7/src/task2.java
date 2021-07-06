import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] players = new String[7];
        String user ;

        System.out.println("Press A to add a player\n" +
                "press B to display two best Batsmans\n " +
                "Press C to display two best Bowlers \n" +
                "Press D to display the best Keeper\n ");
        user = input.nextLine() ;

        if (user == "A"){
            System.out.println("sheran");

        }
            if (user == "B"){


            }
            if (user == "C"){


            }
            if (user == "D"){


            }
            if (user == "V"){

            }
        else
            System.out.println("Press a valid key ");

    }

}
