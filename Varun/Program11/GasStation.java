Class GasStation{
	gasStation(int[] gas,int[] cost){
	int 
	int totalSum=0,Currentsum=0,outputIndex=-1;
	for(int i=0;i<gas.length;i++){
	total=total+cost[i];
	sum=sum+cost[i];
	if(sum<0){
	sum=0; // resets the value of sum
	j= i; // Now calculating the sum from the next point.
	}
	}
	if(total > 0){
	return j+1;
	}  
	else
	return -1;
	}
}