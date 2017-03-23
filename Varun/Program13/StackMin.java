public class StackMin extends Stack<Integer>{
Stack<Integer> s;
public StackMin(){
s=new Stack<Integer>();
				}
public void push(int value){ //Overrides the default push function and compares the value pushed to the current minimum value. If it is lower it is pushed into the stack.

	if(value <= min(){

		s.push(value);

	}

super.push(value);

}

public int pop(){ // If the value being popped is the min value, s value also gets popped

int value=super.pop();

	if(value == min()){

		s.pop();
	}
return value;
}
public int min(){ // the top of our new stack holds the min value. that is being returned here.

if(s.isEmpty()){

	return Integer.MAX_VALUE;

	}

return s.peek();
}
}
