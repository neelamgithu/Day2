import java.util.*;
class day2_1_SingleDigit{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);


System.out.println("enter single digit number");
int num=sc.nextInt();
word(num);
}
public static void word(int num)
{
if(num ==1)
System.out.println("one");
else if (num == 2)
System.out.println("two");
else if (num == 3)
System.out.println("three");
else if (num ==4)
System.out.println("four");
else if (num ==5)
System.out.println("five");
else if (num ==6)
System.out.println("six");
else if (num ==7)
System.out.println("seven");
else if (num ==8)
System.out.println("eight");
else if (num ==9)
System.out.println("nine");
else
System.out.println("enter proper single digit num");
} 
}
