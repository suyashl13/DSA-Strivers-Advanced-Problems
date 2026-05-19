import java.util.Arrays;

public class SolveSuperMarketQueue {
  
  static int getMinimumTerminal(int[] terminals) {


    for (int terminal = 0; terminal < terminals.length; terminal++) {
        int terminalVal = terminals[terminal];
        if (terminalVal == 0) return terminal;
    }

    int minimumTerminalVal = Integer.MAX_VALUE;
    int minimumTerminalIndex = 0;
    
    for (int terminal = 0; terminal < terminals.length; terminal++) {
        if (terminals[terminal] < minimumTerminalVal) {
            minimumTerminalVal = terminals[terminal];
            minimumTerminalIndex = terminal;
        }
    }

    return minimumTerminalIndex;
  }


  public static int solveSuperMarketQueue(int[] customers, int n) {
    int [] terminals = new int[n];
    Arrays.fill(terminals, 0);

    for (int customer = 0; customer < customers.length; customer++) {
        int minimumTerminal = getMinimumTerminal(terminals);
        terminals[minimumTerminal] += customers[customer];
    }


    return Arrays.stream(terminals).max().getAsInt(); 
  }
}