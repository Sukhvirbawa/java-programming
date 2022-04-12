//class person-----id name city====child class employee----salary in employee-----use super in 3 rd class /pass 4 attribues by creating objects..... 
//import java.util.Scanner;
class person{
public int id;
public String name;
public String city;
 person(int a,String b,String c){
 this.id=a;
 this.name=b;
 this.city=c;
 }
 public int showid(){
 
 return id;
 }
 public String showname(){
 return name;
 }
 public String showcity(){
 return city;
 }
  
}
class employee extends person{ 
int salary;
 employee(int a,String b,String c,int d){
super(a,b,c);



this.salary=d;
}
public int getsalary(){
return salary;
}
}
public class a {
public static void main(String args[]){
employee d=new employee(122,"hello","doon",12345);

System.out.println("the salary is"+d.getsalary());
System.out.println("the id is"+d.showid());
System.out.println("the name is"+d.showname());
System.out.println("the city is"+d.showcity());
}
}




//class person ==show and get details restrict showdetails to beoverridden----restrict class person not to be extended
