// one function should give the caputure value i.e 4 nah till 4 = is rached or greaer
// This function should run to the left and right

//this function should run through all the values of the buildings
// return the highest water capture value.
import java.util.*;
class WaterTrap{
static int waterVolume(int[] input,int a,int b){ // calculates the volume between point A and Point B

  int volume=0;
  int heightOfPointA=input[a];
  for(int i=(a+1);i<b;i++){
  	volume=volume+(heightOfPointA-input[i]);
  }
  System.out.println("The volume between point " + a + " " + b +" is " + volume);
  return volume;
}
static int waterCapturedPoint(int[] input){ // caluates two points such that the two points are of the same height or the one on the right is of a heigher height
int volume=0;
int pointA=input[0];
int aIndex=0,startValue=1;

  while(aIndex <= (input.length-1) ){ // This loop handles when a pillar in the middle is to tall. It calculates the values beyond the pilliar
for(int i=startValue;i<(input.length);i++){ // This loops takes two points such that the one on the left is lower than the one on the right
	
if(pointA <= input[i]){


	volume=volume+waterVolume(input,aIndex,i);
	

pointA=input[i];
aIndex=i;
}
}
aIndex=aIndex+1;
startValue=aIndex;
if(aIndex <= (input.length-1))
pointA=input[aIndex];
}

return volume;
}
public static void main(String args[]){
int numberOfInputs,output;
Scanner scan=new Scanner(System.in);
numberOfInputs=scan.nextInt();
int[] input=new int[numberOfInputs];
for(int i=0;i<numberOfInputs;i++){
	input[i]=scan.nextInt();
}
output=waterCapturedPoint(input);
System.out.println(output);
}
}
