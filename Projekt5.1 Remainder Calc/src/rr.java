import java.util.Scanner;

public class rr {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("\nWas möchten Sie berechnen?\n");
        System.out.println("A: Rest berechnen\nB: Zahl umwandeln\n");
        String option = scan.nextLine();

        // A
        if("A".equals(option) || "a".equals(option)){
        // Input
        System.out.println();
        System.out.println("Geben Sie bitte die Zahlen ein!");
        System.out.println("1. Die Zahl | Bsp. 160");
        System.out.print("-> ");
        String inputNumber = scan.nextLine();
        System.out.println("\n2. Der Wert der Zahl | Bsp. 10 (Dezimal Wert)");
        System.out.print("-> ");
        String inputNumberValue = scan.nextLine();
        System.out.println("\n3. Der Wert des Zieles | Bsp. 2 (Binär Wert)");
        System.out.print("-> ");
        String inputTargetValue = scan.nextLine();
        System.out.println();

        // Calculator
        int processedNumber = Integer.valueOf(inputNumber);
        int processedNumberValue = Integer.valueOf(inputNumberValue);
        int processedTargetValue = Integer.valueOf(inputTargetValue);

        int target = processedNumber / processedTargetValue;
        int remainder = processedNumber % processedTargetValue;

        // Target
        System.out.println("Das Ergebniss: " + target);
        System.out.println("Rest: " + remainder);
        System.out.println();
        System.out.println("-----");
        }

        // -----
        
        // B
        if("B".equals(option) || "b".equals(option)){
            // Input
            System.out.println();
            System.out.println("Geben Sie bitte die Zahlen ein!");
            System.out.println("1. Die Zahl | Bsp. 160");
            System.out.print("-> ");
            String inputNumber = scan.nextLine();
            System.out.println("\n2. Der Wert der Zahl | Bsp. 10 (Dezimal Wert)");
            System.out.print("-> ");
            String inputNumberValue = scan.nextLine();
            System.out.println("\n3. Der Wert des Zieles | Bsp. 2 (Binär Wert)");
            System.out.print("-> ");
            String inputTargetValue = scan.nextLine();
            System.out.println();

            // Calculation

            int[] output = new int[0];

            int processedNumber = Integer.valueOf(inputNumber);
            int processedNumberValue = Integer.valueOf(inputNumberValue);
            int processedTargetValue = Integer.valueOf(inputTargetValue);

            do{
                int target = processedNumber / processedTargetValue;
                int remainder = processedNumber % processedTargetValue;
                
                // ARRAY!?!??!?!
                System.out.println(output);
            }while(processedNumber >= 0);
 
        }
        
    }

}