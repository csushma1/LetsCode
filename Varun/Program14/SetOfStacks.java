import java.util.*;
class SetOfStacks{
ArrayList<Stack> stacks=new ArrayList<Stack>();
int  stackLimit;
void push (int input){
Stack currentStack=getCurrentStack();
  if((currentStack.size() < stackLimit ) || (currentStack != null)){
    currentStack.push(input);
  }
  else{
    Stack<Integer> newStack=new Stack<Integer>();
    newStack.push(input);
    stacks.add(newStack);

  }
}
public Stack getCurrentStack(){
  if(stacks.size() == 0){
    return null;
  }
  Stack currentStack=stacks.get(stacks.size()-1);
  return currentStack;
}
public int pop(){
  Stack currentStack=getCurrentStack();
  int output=(int)currentStack.pop();
  if(currentStack == null ){
    stacks.remove(stacks.size()-1);
  }
  return output;
}


}
