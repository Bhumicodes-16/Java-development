class Cal{
    //Method overloading 
    public int add(int n1,int n2)
    {
        int result=n1+n2;
        return result;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;

        //we can use different datatype too
    }
}


public class Demo{
    public static void main(String[] args) {
        Cal obj=new Cal();
        int r1=obj.add(34, 55);
        System.out.println(r1);

        int r2=obj.add(66, 75, 55);
        System.out.println(r2);


    }
}