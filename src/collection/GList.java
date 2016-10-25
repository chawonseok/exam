package collection;

import java.util.Iterator;

public class GList<예림> implements Iterable{
   private 예림[] yls;
   //데이터를 추가하기 위한 위치 변수

   
   private int index;
   //공간을 늘리기 위한 멤버변수
   private int capacity;
   private int amount;


   public GList(int capacity, int amount) {
      this.capacity = capacity;
      this.amount = amount;
      
      yls = (예림[])new Object[capacity];
      index=0;
   }
   
   public GList() { //overload
      capacity = 10;
      amount = 10;
      
      
      yls = (예림[])new Object[capacity];
      index=0;
   }
   
   public void add(예림 yl) {
      
      if(index>=capacity){
         // 1. 새로운 temp 배열을 만든다. 크기가 capacity, amount
         예림[] temp = (예림[])new Object[capacity];
         // 2. omoks에 주민을 tmep 방으로 이주
         for(int i=0; i<capacity; i++)
            temp[i] = yls[i];
         // 3. 새로운 크기 capacity 설정
         capacity += amount;
         // 4. omoks 이름을 새로운 배열(temp)의 이름으로 지정
         yls = temp;
         
      }
      yls[index++] = yl;
   }
   
   public Object get(int index) {
      
      return yls[index];
      
   }

   public int size() {

      return index;
   }

   public int getIndex() {

      return index;
   }

   public void setIndex(int index) {
      this.index = index;
   }

   /*public 예림 next(){
      return yls[current];
   }   
   public boolean hasNext() {
      
      if(current+1 >= index)
         return false;
      
      return true;
   }*/
   
   @Override
   public Iterator iterator() {

      return new Giterator ();
   }
   
   class Giterator implements Iterator{
      
      private int current;
      
      public Giterator(){
         current = -1;

      }

      @Override
      public boolean hasNext() {
         if(current+1 >= index)
            return false;
         
         return true;
      }

      @Override
      public 예림/*Object*/ next() {
         // TODO Auto-generated method stub
         return yls[++current];
      }
      
   }

   
   
   
   /*public void setIndex(int index) {
      this.index = index++;

   }*/

   
   
}