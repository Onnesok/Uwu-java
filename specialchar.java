public class specialchar {
    public static void main(String[] args) {
        String txt = "Yo mama ki obostha ? \"Ratul\" kemon ase?\\";
    System.out.println(txt);  // it's adding double quote on Ratul  and \\ adds \ in string
    txt = "\nYo mama\nki obostha? Ratul \t kemon ap\bse? \fyo";
    System.out.println(txt);

    /*  Here
    \n means new line
    \t means tab
    \b means backspace  ==>> look at ase banan
    \f means form feed 
    */

    ////////////   java basic math  /////////////////////////// 

    System.out.println(Math.max(50, 10));
    System.out.println(Math.min(50, 10));
    System.out.println(Math.random());  // random() returns a random value from 0(inclusive) to 1.0 (exclusive)
    int random_num = (int)(Math.random() * 101); // this will randomize numbers from 0 to 100
    System.out.println(random_num);

    }
}
//Special char and math syntax