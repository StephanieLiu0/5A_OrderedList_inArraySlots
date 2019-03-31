public class UserOfOrderedList{

    public static void main( String[] args ) {
	
	OrderedList_inArraySlots orderedList = new OrderedList_inArraySlots();
	System.out.println(orderedList);

	// add values to list
	orderedList.add(22);
	System.out.println(orderedList);
	orderedList.add(13);
	System.out.println(orderedList);
	orderedList.add(4);
	System.out.println(orderedList);
	orderedList.add(16);
	System.out.println(orderedList);
	orderedList.add(20);
	System.out.println(orderedList);
	orderedList.add(10);
	System.out.println(orderedList);

	// test size method
	System.out.println("There are "
			   + orderedList.size()
			   + " elements in this list.");

	// test get method
    	System.out.println(orderedList.get(0)); // expecting 4
	System.out.println(orderedList.get(3)); // expecting 16
	System.out.println(orderedList.get(5)); // expecting 22
			   

	// remove(value)
   	System.out.println("removed "
			   + orderedList.remove(0)
			   + ": "
			   + orderedList);
   	System.out.println("removed "
			   + orderedList.remove(3)
			   + ": "
			   + orderedList);
	System.out.println("removed "
			   + orderedList.remove(2)
			   + ": "
			   + orderedList);
    }
}
    
