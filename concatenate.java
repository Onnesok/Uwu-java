public class concatenate {
    public static void main(String[] args) {
        String vibe = "Yo ";
        String naming = "mamma";
        System.out.println(vibe.concat(naming));

        ///  Java uses + sign for both concat and plus
        // such as + can even do + for string
        // string takes priority
        int v1 = 5;  // with string this will also become string as string takes priority
        System.out.println(vibe + naming + v1);
    }
}
// concatenate