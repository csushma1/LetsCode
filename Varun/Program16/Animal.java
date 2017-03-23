import java.util.*;
public class Animal{
String name;
int time;
public Animal(String name,int time){
  this.name=name;
  this.time=time;
}
}
public class DogOrCat extends Animal{
  static Queue dog=new LinkedList<Animal>();
  static Queue cat=new LinkedList<Animal>();

  public String chooseByDog(){
    if(dog.isEmpty()){
      return null;
    }
    else{
      Animal outputdog=(Animal)dog.remove();
      return outputdog.name;
    }
  }
  public String chooseByCat(){
    if(cat.isEmpty()){
      return null;
    }
    else{
      Animal outputcat=(Animal)cat.remove();
      return outputcat.name;
    }
  }
  public String chooseFirst(){
    Animal catChecker=(Animal)cat.peek();
    Animal dogChecker=(Animal)dog.peek();
    if(catChecker.time<dogChecker.time){
      cat.remove();
      return catChecker.name;
    }
    else{
      dog.remove();
      return dogChecker.name;
    }
  }

}
