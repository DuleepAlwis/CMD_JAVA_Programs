import java.util.Random;

public class AssessmentCoding1{
      
      public static void main(String [] args){
        sortColors(getColors());
      }
      
      public static Color [] getColors(){
        Random r = new Random();
        int choice = r.nextInt(3);
        String [] arr = {"RED","WHITE","BLUE"};
        Color [] colors = new Color[10];
        
        for(int i=0;i<colors.length;i++){

          Color c = new Color(arr[choice]);
          choice = r.nextInt(3);
          colors[i] = c;
        }
        
        return colors;
        
      }
      
      public static void sortColors(Color [] colors){ 
          //Red,White,Blue
          int [] indexes = {0,0,0};
          
          for(int i=0;i<colors.length;i++){

              if(colors[i].color.equalsIgnoreCase("RED")){
                Color tmp = colors[i];
                colors[i] = colors[indexes[0]];
                colors[indexes[0]] = tmp;
                indexes[0] = indexes[0]+1;
              }
          }
          
          indexes[1] = indexes[0]+1;
          
          for(int i=indexes[1];i<colors.length;i++){

              if(colors[i].color.equalsIgnoreCase("WHITE")){
                Color tmp = colors[i];
                colors[i] = colors[indexes[1]];
                colors[indexes[1]] = tmp;
                indexes[1] = indexes[1]+1;
              }
          }
          
          indexes[2] = indexes[1]+1;
          
          for(int i=indexes[2];i<colors.length;i++){

              if(colors[i].color.equalsIgnoreCase("BLUE")){
                Color tmp = colors[i];
                colors[i] = colors[indexes[2]];
                colors[indexes[2]] = tmp;
                indexes[2] = indexes[2]+1;
              }
          }
          
          indexes[2] = indexes[1]+1;
          
          for(int i=0;i<colors.length;i++){
            System.out.println(colors[i]);
          }
          
      }
      
      
}

class Color{

  public String color="";

  public Color(String color){
    this.color = color;
  }
  
  public String toString(){
    return "{color="+color+"}";
  }

}
