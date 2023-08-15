package Time;

public class Main{
  
    public static void main(String[] args){


        CustomTime time = new CustomTime();
        time.setTime(22,22,45);
        int[] timeResult = time.getTime();

        getOutput(timeResult);

        time.setTime(16,810,49);
        int[] timeResult2 = time.getTime();

        getOutput(timeResult2);



        
        
        

    }

    public static void getOutput(int[] input){
            int hour = input[0];
            int min = input[1];
            int sec = input[2];

            System.out.println("Current Time is "+ hour +":"+ min +":"+ sec );

        }
}