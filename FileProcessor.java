import java.io.File;
import java.io.FileNotFoundException;
//import java.util.LinkedList;
import java.util.Scanner;

public class FileProcessor {

    /**
     * Processes arithmetic expressions line-by-line in the given file.
     *
     * @param filePath Path to a file containing arithmetic expressions.
     */
    public static void processFile(String filePath) {
        File infile = new File(filePath);
        try (Scanner scan = new Scanner(infile)) {
            while (scan.hasNext()) {
                // TODO: Process each line of the input file here.
                String line = scan.nextLine();
                if (!line.isEmpty()) {
                    line = line.trim().replaceAll(" +", " ");
                    String[] n_array = line.split(" ", 5);

                    LinkedList l1 = new LinkedList();
                    LinkedList l2 = new LinkedList();

                    // creates bignum linked lists from string
                    initialize(n_array, l1, l2);

                    if (line.contains("+"))
                        line = l1.reverse().replaceFirst("^0+(?!$)", "") + " + " +
                                l2.reverse().replaceFirst("^0+(?!$)", "") + " = " +
                                Calculations.Addition(l1, l2).reverse().replaceFirst("^0+(?!$)", "");

                    if (line.contains("*"))
                        line = l1.reverse().replaceFirst("^0+(?!$)", "") + " * " +
                                l2.reverse().replaceFirst("^0+(?!$)", "") + " = " +
                                Calculations.Multiplication(l1, l2).reverse().replaceFirst("^0+(?!$)", "");

                    if (line.contains("^"))
                        line = l1.reverse().replaceFirst("^0+(?!$)", "") + " ^ " +
                                l2.reverse().replaceFirst("^0+(?!$)", "") + " = " +
                                Calculations.Exponentiation(l1, l2).reverse().replaceFirst("^0+(?!$)", "");


                    if (scan.hasNext())
                        System.out.print(line + "\n");
                    else
                        System.out.print(line);

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + infile.getPath());
        }
    }

    public static void initialize(String[] array, LinkedList l1, LinkedList l2){
        for (int i = array[0].length()-1; i >= 0; i--){
            l1.add(Integer.parseInt(String.valueOf(array[0].charAt(i))));
        }
        for (int i = array[2].length()-1; i >= 0; i--){
            l2.add(Integer.parseInt(String.valueOf(array[2].charAt(i))));
        }
    }
}
