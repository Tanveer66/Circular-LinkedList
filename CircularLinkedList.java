
package circularLinkedList;


public class CircularLinkedList<Type>
{
  private   Node head  , prev = null ;
    
   private int count = 0;
    
    
    public void add(Type data)
    {
        Node newNode = new Node(data);
       
        if(head == null)
        {
            head = newNode ;
                    
            head.ref = head ;
            
            prev = head ;
            
            count++;
      
        }else{
            
            newNode.ref = head ;      //assign head ref to newNode refrence part
            
            prev.ref = newNode ;
            
            prev = prev.ref ;       //update the prev value
             
            count++;
              
        }//end of Else
        
        
    }//end of method
    
    public void display()
    {
        Node curr = head ;
        
        System.out.print(curr.Data +"->");
        
        while(curr.ref != head)
        {
            System.out.print(curr.ref.Data + "->");
            
            curr = curr.ref ;
        }
        
        System.out.println("Totle Node in Circular List "+count);
    }
    
}//end of circular Class
class Node<Type>{
    
    Type Data ;
    Node ref ;
    
    
    public Node(Type data)
    {
        this.Data = data ;
        
        this.ref = null;
        
    }
    
}