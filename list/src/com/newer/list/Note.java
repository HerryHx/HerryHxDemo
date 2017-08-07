package com.newer.list;

public class Note {
	Note previous;//第一个节点
	 Object obj;
	 Note next;//下一个节点

	public Note() {
		super();

	}

	public Note(Note previous, Object obj, Note next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}

	public Note getPrevious() {
		return previous;
	}

	public void setPrevious(Note previous) {
		this.previous = previous;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Note getNext() {
		return next;
	}

	public void setNext(Note next) {
		this.next = next;
	}

	
}
