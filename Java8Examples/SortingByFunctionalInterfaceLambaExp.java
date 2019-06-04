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

class Test{
 public static void main(String[] args){
	ArrayList<Employee> l = new ArrayList<Employee>();
	l.add(new Employee("Durga",8724));
	l.add(new Employee("Selva",9724));
	l.add(new Employee("Rammari",17823));
	l.add(new Employee("Ranjith",5462));
	l.add(new Employee("Kaushik",4322));
	l.add(new Employee("Partha",32421));
	System.out.println(l);
	Collections.sort(l,(e1,e2)->(e.eno<e2.eno)?-1:(e.eno>e2.eno)?1:0);
	System.out.println(l);
 }
}