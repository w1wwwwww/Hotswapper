package cmd;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdManager {
    private static final String os = System.getProperty("os.name");
    private static final String terminal = "cmd /c ";

    public static String getOs() {
        return os;
    }

    public static void listFiles() throws IOException {
        Process process = Runtime.getRuntime().exec( terminal + "dir", null, new File("C:\\Users\\"));
        getResults(process);
    }

    private static void getResults(Process process) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
