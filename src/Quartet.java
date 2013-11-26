import java.util.ArrayList;
import java.util.Collections;

public class Quartet{

  Integer left1;
  Integer left2;
  Integer right1;
  Integer right2;
  String name;
  float weight;

  public Quartet(int a, int b, int c, int d, float wgt){
    left1 = Integer.valueOf(a);
    left2 = Integer.valueOf(b);
    right1 = Integer.valueOf(c);
    right2 = Integer.valueOf(d);
    weight = wgt;
    ArrayList<String> nameMaker = new ArrayList<String>();
    nameMaker.add(left1.toString());
    nameMaker.add(left2.toString());
    nameMaker.add(right1.toString());
    nameMaker.add(right2.toString());
    Collections.sort(nameMaker);
    
  }

  public boolean satisfies(ArrayList<Integer> left, ArrayList<Integer> right){
    return (left.contains(left1) && left.contains(left2)) && (right.contains(right1) && right.contains(right2));
  }

  public Integer[] above(){
    Integer[] output = {left1, left2};
    return output;
  }

  public Integer[] below(){
    Integer[] output = {right1, right2};
    return output;
  }

  public String getName(){
    return name;
  }

}