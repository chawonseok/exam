package jdbc;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import collection.ExamList;
import collection.GList;
import collection.ObjectList;
import entity.Exam;
import ui.ExamConsole;

public class ObjectProgram {

   public static void main(String[] args) {
      Set<Integer> set = new HashSet<>();
      set.add(3);
      set.add(4);
      set.add(3);
      
      Iterator<Integer> itr1 =  set.iterator();
      
      while(itr1.hasNext())
         System.out.println(itr1.next());
      
      for(Integer n : set)
         System.out.println(n);

      /*Iterator<Integer> itr2 =  set.iterator();

      while(itr2.hasNext())
         System.out.println(itr2.next());*/

      int[] kor ={1,2,3,4};
      for(int i=0; i<3;i++)
    	  System.out.print(kor[i]);
      
      System.out.println("----------------------------------------------------------------");
      
      Map<String, String> map = new HashMap<>();
      map.put("mid", "newlec");
      map.put("name", "뉴렉");
      map.put("age", "20");
      map.put("age", "22");

      for(String m : map.keySet())
         System.out.println(map.get(m));
      
      System.out.println("----------------------------------------------------------------");

      for(Map.Entry<String, String> en : map.entrySet())
         System.out.printf(en.getValue());
            
      String name = map.get("name");
            
      System.out.println("-----------------------------------------------------------------");

      
      List<String> list = new ArrayList<>();
      //GList<String> list = new GList();
      list.add("Hello");
      list.add("Hooooo");
      list.add("Hoo");
      
      Iterator<String> itr = list.iterator();

      for(String s : list)
         System.out.println(s);
      
      System.out.println("-----------------------------------------------------------------");
      
      while(itr.hasNext())
         System.out.println(itr.next());
      

         
      
      
      //Object a = new Integer(3); //Wrapping-Boxing Integer(N); 정수n을 객체화
      //int x = (int)a + 2; //(int) 단순히 꺼내는 자료형을 알려주는 것 
      /*int sum = 0;
      for(int i=0; i<list.size(); i++){
         if(list.get(i) instanceof Integer)
            sum += (int)list.get(i);
      }
         System.out.println(sum);*/
      
      
      
      
      /*ExamConsole console = new ExamConsole();
      
      while(true){
         int menu = ExamConsole.intputMenu();
         switch(menu)
         {
            case 1:
               console.input();
               break;
            case 2:
               console.print();
               break;
            case 3:
               break ;
         }
         
      }*/
      
      /*ExamList list  =new ExamList();
      
      Exam exam = new Exam(30,30,30);
      
      list.add(exam);
      Exam temp = list.get(0);*/
      /*Exam exam = new Exam(); // new Exam + ()
      Exam exam2 = new Exam(30,30,30);
      // Exam.total(exam); 예전 방식
      //초기화
      
      
      int total = exam.total(); //total method, total service
      //exam.avg(); 
      System.out.printf("total is %d\n", total);
      total = exam2.total();
      System.out.printf("total is %d\n", total);*/

   }

}