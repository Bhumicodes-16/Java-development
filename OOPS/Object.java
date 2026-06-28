class Calculator{
    
    public int add(int n1,int n2){
        System.out.println("in add");
        int r=n1+n2;
        return r;
    }
}


public class Object{
     //Every object have behaviour and properties
     //knows something and does something 
     public static void main(String[] args) {
         int num1=7;
         int num2=66;
         
         Calculator calc=new Calculator(); //create object Constructor
         int result=calc.add(num1,num2);
         System.out.println(result);


     }
}