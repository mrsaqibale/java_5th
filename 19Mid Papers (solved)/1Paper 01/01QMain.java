
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

 class Main {

    public static void main(String[] args) {
        String fileName = "example.txt";

        try {
            createNonOverwritableFile(fileName);
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void createNonOverwritableFile(String fileName) throws IOException {
        File file = new File(fileName);

        // Check if the file already exists
        // if (file.exists()) {
        //     System.out.println("File already exists. Cannot override.");
        //     return;
        // }

        // Create the file

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                // Write content to the file
                writer.write("This is the first line\n");
                writer.write("This is the second line\n");
                writer.write("This is the second line\n");
            }


        // if (file.createNewFile()) {
        //     try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
        //         // Write content to the file
        //         writer.write("This is the first line\n");
        //         writer.write("This is the second line\n");
        //         writer.write("This is the second line\n");
        //     }
        // } else {
        //     System.out.println("File creation failed.");
        // }
    }
}
