package waiting;

import java.util.ArrayList;

public class Queues {

	Human front = null;
	Human rear = null;
	static ArrayList <Human> fList;
	int maxSize;
	
	public Queues(){
		
		fList = new ArrayList();
		maxSize = fList.size();
		
	}
	
	public Human getItem(int a){
		return fList.get(a);
	}
	
	public Human getRear(){
		
		return rear;
	}
	 
	public Human getFront(){
		
		front = fList.get(fList.size()-1);
		return front;
	}
	
	public void enqueue(Human value){
		
		fList.add(value);
		rear = value;
		
	}
	
	public Human dequeue(){
		Human tHuman = fList.get(fList.size() - 1);
		fList.remove(0);
		
		return tHuman;
	}
	
	public int size(){
		
		return fList.size();
	}
	
	public void makeEmpty(){
		
		for(int i = fList.size()-1; i > 0; i--){
			fList.remove(i);
		}
		
	}
	
	public boolean isEmpty(){
		
		boolean empty = false;
		
		for(int i = fList.size()-1; i > 0; i--){
			
			if(fList.remove(i) == null){
				empty = true;
			}
		}
		
		return empty;
	}
	
}
