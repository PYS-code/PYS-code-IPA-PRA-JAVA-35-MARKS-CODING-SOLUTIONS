/*create the class Student with the below Attributes.

RollNo- int
Name- String
TotalMarks- int

write getter and setter and parametrized constructor as required.

create class Solution with main method.

implement one static methods-
   findMaximumTotalMarks method:this method will take array
of Student objects as input parameters.
This method will return Student object having maximum total marks.


The above mentioned static methods should be called from
main methods.

for findMaximumTotalMarks method: The main method
should print the Student details if the returned value is not null.
if the returned value is null then it should print "No Student
found."


Sample input:
4
01
Nisha
584
02
Roshini
300
03
Nisha
600
04
Tirth
500

Sample output:
3 : Nisha : 600

*/



import java.util.*;
class  Student_Maximum_Problem
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		student[] s=new student[n];
		for(int i=0;i<n;i++){
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();
			s[i]=new student(a,b,c);
	}

student ans=findMaximumTotalMarks(s);
if(ans!=null){
	System.out.println(ans.getroll()+":"+ans.getname()+":"+ans.getmarks());
}
else{
	System.out.println("No Student found");
}
	}

public static student findMaximumTotalMarks(student[] s){
	int max=Integer.MIN_VALUE; // or max=0;
	for(int i=0;i<s.length;i++){
		if(max<s[i].getmarks()){
			max=s[i].getmarks();
		}
	}
	
	for(int i=0;i<s.length;i++){
		if(max==s[i].getmarks()){
			return s[i];
		}
	}
	return null;
}

}

class student
{
	int roll;
	String name;
	int marks;

	public student(int roll,String name,int marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}

	public int getroll(){
		return roll;
	}
	public String getname(){
		return name;
	}
	public int getmarks(){
		return marks;
	}
}