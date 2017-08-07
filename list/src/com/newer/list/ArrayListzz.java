package com.newer.list;

//import java.util.ArrayList;
//import java.util.List;

public class ArrayListzz {
	private Object[] elementData;
	private int size;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;

	}

	public ArrayListzz() {
		this(10);
	}

	private void rangeCheck(int index) {
		if (index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
			}
		}
	}

	public Object get(int index) {
		rangeCheck(index);
		return elementData[index];

	}

	public void remove(int index) {
		// 删除数组指定位置的对象
		/*
		 * if (index < 0 || index >= size) { try { throw new Exception(); }
		 * catch (Exception e) { } }
		 */
		rangeCheck(index);
		int numMoved = size - index - 1;
		if (numMoved > 0) {
			System.arraycopy(elementData, index + 1, elementData, index, numMoved);
		}
		elementData[--size] = null;
	}

	public void remove(Object object) {
		for (int i = 0; i < size; i++) {
			if (get(i).equals(object)) {
				remove(i);
			}
		}
	}
    public Object set(int index,Object object){
    	  rangeCheck(index);
    	  Object oldValue=elementData[index];
    	  elementData[index]=object;
    	  return oldValue;
    }
	public ArrayListzz(int initialCapaCity) {
		if (initialCapaCity < 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
			}
		}
		elementData = new Object[initialCapaCity];
	}

	public void add(Object object) {
		// 数组扩容和数据的拷贝
		if (size == elementData.length) {
			Object[] newArray = new Object[size * 2 + 1];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}

		elementData[size] = object;
		size++;
	}

	public static void main(String[] args) {
	    ArrayListzz list=new ArrayListzz();
		list.add("sss");
		list.add("vvv");
		list.add("sss");
		list.add("qqq");
		list.add("www");
		list.add("eee");
		// list.remove(0);
		//list.remove("sss");
		System.out.println(list.size());
		System.out.println(list.get(1));
	}
}
