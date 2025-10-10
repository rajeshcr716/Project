package General;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    static void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
// here IO exception is the input/output exception.

/*
🧩 What causes IOException?

        It occurs when something goes wrong during input/output operations, such as:

        Example situation	Explanation
        File not found	The file "test1.txt" doesn’t exist
        No read/write permission	File access denied
        Disk or network error	Device or connection issue
        Stream already closed	Trying to read/write after closing a stream  */
