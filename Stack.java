import java.util.EmptyStackException;



public class Stack < S > extends Vector < S >{

	public synchronized S peek(){
		int length = size();
		
		if(length == 0){
			throw new EmptyStackException();
		}
		return elementAt(len - 1);		
	}
			
	public S pop(){
		S obj;
		int length = size();
		obj = peek();
		removeElementAt(len - 1);
		
		return obj;
	}
			
	public S push(S num){
		
		addElement(num);
		
		return num;
	}
			
	public boolean isEmpty(){	
		if(size() == 0){
			return true;
		}
		return false;
	}
				
	public boolean makeEmpty(){
		return size() == 0;
	}
		
}
