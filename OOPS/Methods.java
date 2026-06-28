class Computer
{
    //Method
  public void playMusic(){
      System.out.println("playing music");
  }

  public String Cpu(int cost){
    return "Cpu";
  }
}

public class Methods{
    public static void main(String[] args) {
        //reference variable
        Computer obj=new Computer();
        obj.playMusic();
        String str=obj.Cpu(10);
        System.out.println(str);

        
    }
}