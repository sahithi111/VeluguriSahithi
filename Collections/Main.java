package epam.task5;

public class Main {
	public static void main(String[] args) 
    {
        Customlist<Integer> list = new Customlist<Integer>();
 
        System.out.println("Adding elements");
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
         
        System.out.println("Remove elements from index");
        list.remove(2);
        System.out.println(list);
         
        System.out.println("Get element with index");
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        System.out.println("List Size");
        System.out.println(list.size());
    }

}
