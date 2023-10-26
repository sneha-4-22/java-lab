public class lengthcmd {
    public static void main(String[] args) {
        int numArgs = args.length;
        System.out.println("Number of command-line arguments: " + numArgs);
        System.out.println("Command-line arguments:");
        for (int i = 0; i < numArgs; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
