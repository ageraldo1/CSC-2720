package com.gsu.help;

import java.util.Arrays;
public class GenericStack<E> {

 private  int top; 
 private E MyStack[];
 
 public GenericStack(){
	 this.top = -1;
	this.MyStack = (E[]) new Object[3];
	
 }
 
public boolean isEmpty(){
	return (top == -1);
	
}
public boolean isFull(){
	System.out.println("****************");
	System.out.println(top);
	System.out.println(MyStack.length);
	System.out.println("****************");
return ( top == MyStack.length-1);	
}
public void push(E number){
	if ( isFull()){
		System.out.println("Stack is full");
		
	}else {
		MyStack[++this.top] = number;
		
		//if ( (top + 1) < MyStack.length) top = top+1;
		//if( isFull <= MyStack.length){
			
		//}
		
	}
}
	public void print(){
		System.out.println(Arrays.toString(MyStack));
	}
		
	public E peek(){
		if( isEmpty()){
		return null;
	}else {
		return MyStack[top];
	}
	}
public E pop(){
	if ( isEmpty()){
		System.out.println("Stack is empty");
				
		return null;
	}
	else{
		E temp = MyStack[this.top];
		top = top-1;
		return temp;
	}
		
}}


