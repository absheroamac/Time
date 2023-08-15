package Time;

public class CustomTime {
    final int maxHour = 23;
    final int maxMinSec = 59;

    private int hour;
    private int min;
    private int sec;


    public CustomTime(){
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }

    public void setTime(int hour, int min, int sec){
        if(hour>=0 && hour<=maxHour){
            this.hour = hour;
        }
        else{
            System.out.println("Error, not a valid hour");
        }
        if(min>=0 && min<=maxMinSec){
            this.min = min;
        }
        else{
            System.out.println("Error, not a valid min");
        }
        if(sec>=0 && sec<=maxMinSec){
            this.sec = sec;
        }
        else{
            System.out.println("Error, not a valid min");
        }
    }

    public int[] getTime(){
        return new int[]{this.hour,this.min,this.sec};
    }

    public void incrementTime(){
        this.sec++;
    } 
}