
public class linkedlist22 {
	
	Node22 head; 
	int listcount  ; 
	
	public linkedlist22()
	{
		this.head = null;
	    this.listcount=0;	
	}
	
	public void add(int data)
	{
		if(head==null)
		{
		    head = new Node22(data);
		     listcount++;
		     return ; 
		}
		
		else
		{
			Node22 temp = new Node22(data);
			Node22 current = head; 
			while(current.getNext()!=null)
			{
				current=current.getNext();
			}
			current.setNext(temp);
			listcount++;
		}
	}
	public void add(int data, int index)
	{
		if((index < 1)|| (index>listcount))
		{
		    System.out.println("Cannot insert, check index"); 
		     return ; 
		
		}
		Node22 current = head; 
		Node22 temp = new Node22(data);
		
		for(int i = 1 ; i < index-1 ; i ++)
		{
			current = current.getNext();
		}	
		
		temp.setNext(current.getNext());
		current.setNext(temp);
		listcount++;
		return ; 	
	}
	
	public Object get(int index)
	{
		Node22 current = head ; 
		if(index ==1 )
			return current.getData(); 
		
		for(int i = 1 ; i < index ; i ++ )
		{
			current= current.getNext();
		}
		System.out.println(current.getData());
		return current.getData();
		
	}
	
	public boolean remove(int index)
	{
		if((index<1)|| (index> listcount))
		{
			System.out.println("Wrong index");
			return false;
		}
		
		Node22 current = head ; 
		
		for(int i = 1 ; i < index-1 ; i ++)
		{
		   current = current.getNext();  
		}
		current.setNext(current.getNext().getNext());
		listcount--; 
		System.out.println("Removed from linked list");
		return true ; 
	}
	
	public void display ()
	{
	    
		Node22 current = head ; 
		System.out.println("");
		while(current!=null)
		{
		System.out.print("["+current.getData()+"]  ");
		current=current.getNext();
		}
	}
	
	public void Size()
	{
		System.out.println("Number of elements: "+listcount);	
	}
	
	public static void main(String args[])
	{
		linkedlist22 obj1 = new linkedlist22();
		obj1.add(55);
		obj1.display(); 
		obj1.add(65);
		obj1.display(); 
		obj1.add(75);
		obj1.display(); 
		obj1.add(105);
		
	
		obj1.display(); 
		obj1.get(2);
		obj1.display(); 
		obj1.Size();
		obj1.remove(2);
		obj1.display();
		
	}
	
}
