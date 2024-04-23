import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private String[] wordList;
  private int ind;

  public RandomStringChooser(String[] list){
    wordList=list;
    ind=0;
  }
  public String getNext(){
    if(ind<wordList.length){
      String word=wordList[ind];
      ind++;
      return word;
    }else{
      return "NONE";
    }
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
