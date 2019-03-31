public class OrderedList_inArraySlots {

    // fields
    private List_inArraySlots list;
    
    // constructor
    public OrderedList_inArraySlots() {
	list = new List_inArraySlots();
    }
    
    // return the number of elements in this list
    public int size() {
	return list.size();
    }
    
    // return a string representation of this list
    public String toString() {
	return list.toString();
    }
    
    // return element @index from this list
    public int get (int index) {
	return list.get(index);
    }

    // add element into this list @correct index
    public void add (int value) {
	int index;
	for (index = 0;
	     list.get(index) < value && index < list.size();
	     index++)
	    {}
	list.add(index, value);
    }	
    
    // remove element @index and return the element removed
    public int remove (int index) {
	return list.remove(index);
    }
}
    
