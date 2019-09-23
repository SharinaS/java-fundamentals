/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

// resource: class-03 Alice example - github.com/codefellows/seattle-java-401d6/tree/master/class-03/alice
// resource: https://stackoverflow.com/questions/27522563/why-stringjoiner-when-we-already-have-stringbuilder
// resource: docs.oracle.com/javase/8/docs/api/java/util/StringJoiner.html

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringJoiner;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        try{
            System.out.println(readFile("src/main/resources/gates.js"));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("could not find file");
        }
    }

    public static String readFile(String fileName) throws FileNotFoundException {

        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);

        // stringMaker constructs sequence of characters separated by delimiter /n.
        StringJoiner stringMaker = new StringJoiner("\n");
        int numLine = 0;

        while(fileReader.hasNextLine()){
            numLine += 1;
            String line = fileReader.nextLine();
            //System.out.println(line);

            // logic kindly helped by code from: Michelle Ferreirae
            if (line.length() > 0) {
                // check for curly braces
                char finalCharInLine = line.charAt(line.length() -1);
                if (finalCharInLine != ';' && finalCharInLine != '{' && finalCharInLine != '}') {
                    if (!line.contains("if") && !line.contains("else")) {
                        String reportError = "LINE " + numLine + ": missing semicolon " + line;
                        stringMaker.add(reportError);
                    }
                }
            }
        } fileReader.close();
        return stringMaker.toString();
    }

}
