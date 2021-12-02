
package dataStructureExamples;
public class ImplementationOfStack
{
Node head;
class Node
{
int value;
Node next;
}
public ImplementationOfStack()
{
head=null;
}
public void push(int value)
{
Node extraHead = head;
head = new Node();
head.value=value;
head.next= extraHead;
}
public int pop()
{
if(head==null)
{
System.out.println("stack is empty :");
}
int value = head.value;
head = head.next;
return value;
}
public static void printRemainingList(Node head)
{
Node temp = head;
while(temp!=null)
{
System.out.println(temp.value +" ");
temp = temp.next;
}
}
public static void main(String[] args)
{
ImplementationOfStack ls = new ImplementationOfStack();
ls.push(1);
ls.push(4);
ls.push(2);
ls.push(400);
ls.push(510);
System.out.println("element removed from the stack are :"+ ls.pop());
System.out.println("element removed from the stack are :"+ ls.pop());
ls.push(60);
System.out.println("element removed from the stack are :"+ ls.pop());
printRemainingList(ls.head);
}
}

