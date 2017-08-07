package com.newer.list;

public class LinkedListzz {
	// ���� ���� ˫������
	private Note frist;
	private Note last;
	private int size;

	public void add(Object obj) {
		Note n = new Note();
		if (frist == null) {
			n.setPrevious(null);// ��һ���ڵ�
			n.setObj(obj);
			n.setNext(null);// ��һ���ڵ�
			frist = n;
			last = n;
		} else {
			// ֱ����last��ӽڵ�
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);

			last.setNext(n);
			last = n;
		}
		size++;
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
		Note temp = note(index);
		if (temp != null) {
			return temp.obj;
		}
		return null;
	}

	public Note note(int index) {
		Note temp = null;
		if (frist != null) {
			temp = frist;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		}
		return temp;
	}

	public void remove(int index) {
		Note temp = note(index);

		if (temp != null) {
			Note up = temp.previous;
			Note down = temp.next;
			up.next = down;
			down.previous = up;
		}
		size--;
	}

	public int size() {
		return size();
	}

	public static void main(String[] args) {
		LinkedListzz list = new LinkedListzz();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.remove(1);
		// list.remove(1);
		System.out.println(list.size);
		System.out.println(list.get(1));
		
		
	}
}
