package myarraylist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;

import java.util.Arrays;
import java.lang.reflect.Array;

public class MyArrayList<T> implements Iterable<T>
{
   private T[] list;
   private int count;
   private int modCount;
	
   public MyArrayList() {
      this(10);
   }
	
   @SuppressWarnings("unchecked")
   public MyArrayList(int initSize) 
   {
      count = initSize;
      list = (T[]) new Object[initSize];
   }
	
   public void add(T value)
   {
      if(count == list.length)
         resizeArray();
         
      list[count++] = value;
	}
   
   public void add(int index, T value)
   {
      //if(index<0 || index > count)
        // throws IndexOutOfBoundsException
      
      T[] temp = list;
      list = (T[]) new Object[list.length + 1];
      
      /*
      [1, 2, 3, 5]
      [1, 2, 3, #, 5]
      add(spot 3, val 4)
      new array +1 size
      copy nums until index into new array
      copy in value
      copy in rest of vals
      for(int i=0; i<index; i++)
      {
         list[i] = temp[i];
      }
      list[temp.length-1] = value;
      for(int i=temp.length; 
      */
   }
	
   public void clear()
   {
   
   }
	
   public T get(int index) {
      return null;
   }
	
   public int indexOf(T value)
   {
      return 0;
   }
	
   public boolean remove(T value)
   {
      return false;
   }
	
   public boolean isEmpty() {
      return false;
   }
	
   public T removeAt(int index)
   {
      return null;
   }
	
   public T set(int index, T element) {
      return null;
   }
	
   public int size() {
      return 0;
   }
	
   public int capacity() {
      return 0;
   }
	
   public Object[] toArray() {
      return null;
   }
	
   @Override
   public String toString()
   {
      return null;
   }
	
   public Iterator<T> iterator() {
      return new LinkedListIterator();
   }
	
   private class LinkedListIterator implements Iterator<T>
   {
      private int expectedCount;
      private int last;
      private int next;
   	
      public LinkedListIterator() {
      
      }
   	
      public boolean hasNext() {
         return false;
      }
   	
      public T next() {
         checkForComodification();
         return null;
      }
   	
      public void remove() {
      
      }
   	
      private void checkForComodification() {
      
      }
   }
	
	// ****************** Private Helper Methods ********************
	
   @SuppressWarnings("unchecked")
   private void resizeArray()
   {
      T[] temp = (T[]) new Object[list.length + 10];
      for (int index = 0; index < list.length; index++)
         temp[index] = list[index];
      list = temp;
   }
	
}

