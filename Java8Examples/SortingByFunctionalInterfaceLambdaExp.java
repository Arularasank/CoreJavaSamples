import java.util.*;
class Employee
{
 String name;
 int eno;
 Employee(String name, int eno){
	this.name = name;
	this.eno = eno;
 }
 public String toString(){
	return eno+":"+name;
 }
}

class SortingByFunctionalInterfaceLambdaExp{
 public static void main(String[] args){
	ArrayList<Employee> l = new ArrayList<Employee>();
	l.add(new Employee("Durga",8724));
	l.add(new Employee("Selva",9724));
	l.add(new Employee("Rammari",17823));
	l.add(new Employee("Ranjith",5462));
	l.add(new Employee("Kaushik",4322));
	l.add(new Employee("Partha",32421));
	System.out.println(l);
//	Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0); // (e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0   for number sorting order
	Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name)); // e1.name.compareTo(e2.name) for alphabetical sorting order
	System.out.println(l);
 }
}