import java.io.*;
import java.util.Scanner;

public class fileHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for the file name
        System.out.print("Enter the file name (with .txt extension): ");
        String fileName = scanner.nextLine();

        // Step 2: Ask for the content
        System.out.println("Enter the content to write into the file:");
        String content = scanner.nextLine();

        // Step 3: Write content to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Content successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        // Step 4: Read and print the content from the file
        System.out.println("Reading content from " + fileName + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        scanner.close();
    }
}
