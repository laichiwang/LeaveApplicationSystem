
public class Lab2 {

    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.print("Not enough arguments, 4 is required.");
            return;
        }

        double base = Double.parseDouble(args[0]);
        char op = args[1].charAt(0);
        double unit = Double.parseDouble(args[2]);
        int n = Integer.parseInt(args[3]);

        if (op == '/' && unit == 0) {
            System.out.print("Divider is 0.");
            return;
        }

        for (int i = 0; i < n; i++) {
            switch (op) {
                case '+':
                    base += unit;
                    break;
                case '-':
                    base -= unit;
                    break;
                case '*':
                    base *= unit;
                    break;
                case '/':
                    base /= unit;
                    break;
                default:
                    System.out.print("Invalid operator");
            }
            System.out.print(formatDouble(base) + " ");
        }
    }

    public static String formatDouble(double d) {
        String s = String.format("%.4f", d);
        while (s.charAt(s.length() - 1) == '0') {
            s = s.substring(0, s.length()-1);
        }
        if (s.charAt(s.length() - 1) == '.') {
            s = s.substring(0, s.length()-1);
        }
        return s;
    }
}