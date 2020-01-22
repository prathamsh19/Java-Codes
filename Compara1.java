import java.util.*;          //comparable interface
class Employee implements Comparable<Employee>
{ 
 String name;
 int id;
 int salary;
 int age;
 Employee(String n,int i,int s,int a)
 {
   name=n; 
   id=i;
   salary=s;
   age=a;
 }
 public String toString()
 {
   return ("Emp_name"+ name + ",id" + id + ",salary" + salary + ",age" + age+"\n");
 }
 public int getid()
 {
   return id;
 }
 public int compareTo (Employee ee)
 {
    return this.getid()-ee.getid();
 }
}
class Compara1
{
 public static void main(String args[])
 {
   List<Employee> emp= new ArrayList<>();
   emp.add(new Employee("C",3,300,30));
   emp.add(new Employee("A",1,100,10));
   emp.add(new Employee("B",2,200,20));
   Collections.sort(emp);
   System.out.println(emp);
 } 
}