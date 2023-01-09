public class main {
    public static void main(String[] args) {
        System.out.println("yo yo java tumi ki bari jaba ?");
        System.out.println("nah jbao na");
        // println == print in new line
        // For same line say print
        System.out.print("ok now => ");
        System.out.print(" same line");
        System.out.println(); // for extra space

        int num = 5;
        float float_num = 5.99f;
        char letter = 'D';
        boolean bool = true;
        String text = "Hello";

        System.out.println(letter);
        System.out.println("50 + 10 is "+ 50 + 10 );  // didnt work
        System.out.println("50 + 10 is "+ (50 + 10));  // worked
        System.out.println("For float number "+ (float_num+float_num));  // worked
    }
}