package JavaAssignment8;

import java.util.Scanner;

public class RollerCosterRide {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your height ");
        String height = scanner.nextLine();
        String healthIssues=scanner.next();

        scanner.close();

        try {
            if (Integer.parseInt(height)==0)
                throw new InvalidHeightException("Enter valid height");
            else if (Integer.parseInt(height)<100)
                throw new BelowExpectedHeightException("Less than expected height");
            else if (healthIssues.equalsIgnoreCase("heart problems"))
                throw new HealthIssueException("has heart problem");
            else if (height.isEmpty())
                throw new NullPointerException();
            else
                System.out.println(height);
        }

        catch ( BelowExpectedHeightException | HealthIssueException | InvalidHeightException e) {
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }

        finally {
            System.out.println("finally block is executed");
        }
    }
}

