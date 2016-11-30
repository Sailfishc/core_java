package objectAnalyzer;

import java.util.ArrayList;

/**
 * This program uses reflection to spy on objects.
 * @version 1.12 2012-01-26
 * @author Cay Horstmann
 */
public class ObjectAnalyzerTest
{
   public static void main(String[] args)
   {
      ArrayList<Integer> squares = new ArrayList<Integer>();
      for (int i = 1; i <= 5; i++)
         squares.add(i * i);
      System.out.println(new ObjectAnalyzer().toString(squares));
   }
}

/*
java.util.ArrayList[
elementData=class java.lang.Object[]{
java.lang.Integer[value=1][][],
java.lang.Integer[value=4][][],
java.lang.Integer[value=9][][],
java.lang.Integer[value=16][][],
java.lang.Integer[value=25][][],
null,null,null,null,null
},
size=5][modCount=5][][]
 */