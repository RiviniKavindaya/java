import java.util.Scanner;
class queue{
	
	final int size=5;
	String array[]=new String[size];
	int front=0;
	int rear=-1;
	
	public boolean isFull()
	{
		if(rear==size-1)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public boolean isEmpty()
	{
		if(rear<front)
		{
			return true;
			
		}
		else{
			return false;
		}
	}
	public void enQueue(String data)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		else{
			array[++rear]=data;
		}
	}
	/*public void deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else{
			array[front]="";
			front++;
			if(front>rear)
			{
				front=0;
				rear=-1;
			}
			
		}
	}*/
	public void deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else{
			for(int i=0;i<rear;i++)
			{
				array[i]=array[i+1];
				
			}
			array[rear]="";
			rear--;
		}
	}
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else{
			System.out.println("front element is "+array[front]);
		}
	}
	
	public void display()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		queue q1=new queue();
		//Scanner input=new Scanner(System.in);
		
		q1.enQueue("e1");
		q1.enQueue("e2");
		q1.enQueue("e3");
		q1.enQueue("e4");
		q1.enQueue("e5");
		q1.display();
		q1.enQueue("e6");
		
		
		q1.deQueue();
		q1.deQueue();
		q1.display();
		q1.deQueue();
		q1.display();
		q1.peek();
		
		
		
		
		
		
	}
}

