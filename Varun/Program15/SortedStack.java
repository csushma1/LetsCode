class sortedStack{
Stack<Integer> sorted=new Stack<Integer>();
Stack<Integer> temp=new Stack<Integer>();
boolean valueChecker(int input){ //returns true when input is less than the top value
  if(input > sorted.peek()){
    return false;
  }
  return true;
}
Stack sortedStack(int input){
  if(valueChecker(input)){
    if(temp.isEmpty()){
      sorted.push(input);
    }
    else{
      while(temp.isEmpty){
        sorted.push(temp.pop());
      }
      sorted.push(input);
    }
  }
  else{
    while(!valueChecker(input))
    temp.push(sorted.pop());
    sorted.push(input);
    while(temp.isEmpty){
      sorted.push(temp.pop());
    }
  }
  return sorted;
}

}
