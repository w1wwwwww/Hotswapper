import cmd.CmdManager;
import log.Logger;

import java.io.IOException;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger.log(Level.ALL, "Hotswapper V1 by w1wwwwww");
        Logger.log(Level.ALL, "Running on " + CmdManager.getOs());
        CmdManager.listFiles();
    }
}
