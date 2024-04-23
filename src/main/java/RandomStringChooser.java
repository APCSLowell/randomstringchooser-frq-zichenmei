import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList[] words;
 
  public RandomStringChooser(String[] list){
   for(int i=0;i<list.length;i++){
     words.add(list[i]);
   }
  }
  public String getNext(){
    if(words.size()==0){
      return "NONE";
    }
    int i=(int)(Math.random()*words.size());
    return words.remove(i);
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
