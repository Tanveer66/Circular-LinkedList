
package circularLinkedList;


public class CircularLinkedListTest
{
    
    public static void main(String[] args)
    {
        CircularLinkedList<Integer> list = new CircularLinkedList();
        
        //passes values to Node 
        list.add(1);
         
        list.add(2);
        
        list.add(3);
        
        list.add(4);
        
        list.add(5);
         
        list.display();
    }
    
}
