package Object;

public class HeadPhones {


    String charge = "microUsb";
    String color = "black/red";
    String[] controls = {"power", "volume", "skip", "play", "pause"};

    static boolean power = false;
  static  int volume =0;

  public static void powerOn(){
      power = true;
  }
  public static void powerOff(){
      power = false;
  }
  public static void volumeOn(){
      volume++;
  }
      public static void volumeOff(){
      volume--;
      }
    }


