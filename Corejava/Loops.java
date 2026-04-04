public class Loops{
    public static void main(String[] args) {
        int i=1;
        while(i<5){
            System.out.println(i);
            i++;
        }
        System.out.println("Bye");

        do { 
            System.out.println("do");
            i++;
        } while (i<5);

        for(i=6;i<10;i++){
            System.out.println("for");
        }
        // We have a concept of loops inside loops -nested loops
    }
}