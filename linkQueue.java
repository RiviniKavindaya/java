class linkQueue{
	
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
		
	}
	Node front=null;
	Node rear=null;
	
	public boolean isEmpty()
	{
		if(front==null)
		{
			return true;
		}
		else{
			return false;
		}
	}
	
	public void enQueue(int data)
	{
		Node newNode=new Node(data);
		if(isEmpty())
		{
			front=rear=newNode;
		}
		else{
			rear.next=newNode;
			rear=newNode;
		}
	}
	public void deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty!!!Deletion is not possible");
			
		}
		else{
			System.out.println(front.data);
			front=front.next;
			if(front==null)
			{
				rear=null;
			}
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else{
			Node temp=front;
			while(temp!=null)
			{
				System.out.print(temp.data+",");
				temp=temp.next;
			}
			System.out.println();
			
		}
		
	}
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty!");
			
		}
		else{
			System.out.println("front value is "+front.data);
		}
	}
	
	
	public static void main(String args[])
	{
		linkQueue q1=new linkQueue();
		q1.enQueue(10);
		q1.enQueue(2);
		q1.enQueue(300);
		q1.enQueue(40);
		q1.enQueue(5000);
		q1.display();
		q1.deQueue();
		q1.display();
		q1.deQueue();
		q1.display();
		q1.peek();
		
		
		
		
	}
}