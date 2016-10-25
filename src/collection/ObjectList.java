package collection;



public class ObjectList {
	private Object[] objects;
	private int index;
	private int capacity;
	private int amount;

	public ObjectList() {
		capacity = 10;
		amount = 10;
		objects = new Object[capacity];
		

	}

	public ObjectList(int capacity, int amount) {
		this.capacity = capacity;
		this.amount = amount;

		objects = new Object[capacity];
		

	}

	public void add(Object Object) {
		if (getIndex() >= capacity) {
			Object[] temp = new Object[capacity + amount];
			for (int i = 0; i < getIndex(); i++)
				temp[i] = objects[i];
			capacity += amount;
			objects = temp;
		}
		objects[index++] = Object;
	}

	public Object get(int index) {
		return objects[index];
	}

	public int getIndex(){
		return index;
	}
	public int size(){
		return index;
	}
	public void setIndex(int index){
		this.index=index;
	}
	
}
