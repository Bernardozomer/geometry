package utils;

import java.util.Map;

public class Out {
    public static String formatShapeVars(Map<String, Double> vars) {
        StringBuilder output = new StringBuilder();

        for (Map.Entry<String, Double> entry : vars.entrySet()) {
            output.append(String.format(entry.getKey() + ": %.2f\n", entry.getValue()));
        }

        return output.toString();
    }
}
