package collection;

import java.util.Iterator;

public class GList<����> implements Iterable{
   private ����[] yls;
   //�����͸� �߰��ϱ� ���� ��ġ ����

   
   private int index;
   //������ �ø��� ���� �������
   private int capacity;
   private int amount;


   public GList(int capacity, int amount) {
      this.capacity = capacity;
      this.amount = amount;
      
      yls = (����[])new Object[capacity];
      index=0;
   }
   
   public GList() { //overload
      capacity = 10;
      amount = 10;
      
      
      yls = (����[])new Object[capacity];
      index=0;
   }
   
   public void add(���� yl) {
      
      if(index>=capacity){
         // 1. ���ο� temp �迭�� �����. ũ�Ⱑ capacity, amount
         ����[] temp = (����[])new Object[capacity];
         // 2. omoks�� �ֹ��� tmep ������ ����
         for(int i=0; i<capacity; i++)
            temp[i] = yls[i];
         // 3. ���ο� ũ�� capacity ����
         capacity += amount;
         // 4. omoks �̸��� ���ο� �迭(temp)�� �̸����� ����
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

   /*public ���� next(){
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
      public ����/*Object*/ next() {
         // TODO Auto-generated method stub
         return yls[++current];
      }
      
   }

   
   
   
   /*public void setIndex(int index) {
      this.index = index++;

   }*/

   
   
}