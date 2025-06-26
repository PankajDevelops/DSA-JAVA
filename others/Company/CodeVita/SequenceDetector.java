import java.util.*;

public class SequenceDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> transitions = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.trim().isEmpty()) break;
            transitions.add(line.split(" "));
        }
        
        Map<String, Map<String, String>> stateMap = new HashMap<>();
        Set<String> states = new HashSet<>();

        for (String[] transition : transitions) {
            String presentState = transition[0];
            String nextState = transition[1];
            String input = transition[2];
            String output = transition[3];

            states.add(presentState);
            states.add(nextState);

            stateMap.putIfAbsent(presentState, new HashMap<>());
            stateMap.get(presentState).put(input, nextState + ":" + output);
        }

        StringBuilder sequence = new StringBuilder();
        String initialState = "a";
        String currentState = initialState;
        boolean isNonOverlapping = false;
        
        for (int i = 0; i < states.size(); i++) {
            Map<String, String> transitionsFromCurrent = stateMap.get(currentState);

            if (transitionsFromCurrent != null) {
                for (Map.Entry<String, String> entry : transitionsFromCurrent.entrySet()) {
                    String input = entry.getKey();
                    String[] transitionDetail = entry.getValue().split(":");
                    String nextState = transitionDetail[0];
                    String output = transitionDetail[1];

                    sequence.append(input);

                    if (output.equals("1") && nextState.equals(initialState)) {
                        isNonOverlapping = true;
                        break;
                    }
                    
                    currentState = nextState;
                }
            }
        }
        
        System.out.println(sequence);
        
        if (isNonOverlapping) {
            System.out.println("Non Overlapping Sequence Detector");
        } else {
            System.out.println("Overlapping Sequence Detector");
        }
        
        sc.close();
    }
}
