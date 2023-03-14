package Methods;

public class WaterTracker {
 int waterIntake;
 int totalWaterIntake;

 public int addWater(int add){
     if(add < 0 ){
         System.out.println("enter only positive numbers");
     }
    return  totalWaterIntake = add + waterIntake;

 }

 public double getWater(){
     return totalWaterIntake;
 }

public  String getStatus(){
     if(totalWaterIntake< 2000){
         return "drink more";
     }else{
         return "you are hydrated";
     }
}

public void setDailyWaterIntake(int waterIntake){

}
    public void resetDailyWaterIntake(int  reset){
     setDailyWaterIntake(waterIntake);
    }

   }








