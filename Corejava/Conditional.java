

class Conditional{
    public static void main(String[] args) {
        int x=8;
        int y=10;
        int z=13;
        if(x>8&&y>5)
            System.out.println("Hey");
        else if(x<9&&z>15)
            System.out.println("Bye");
        else
            System.out.println("Hello");

        int n=6;
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
                

        }
        
    }
}