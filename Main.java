package patterns.behavioral.strategy.solution;

import patterns.behavioral.strategy.solution.Logger.Log;
import patterns.behavioral.strategy.solution.Viewer.Viewer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Main start");
        Viewer result = new Viewer();
        result.calculate();
        result.showValue();
    }
}

