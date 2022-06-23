//Method Overloading
class Adder
{
 static int add(int a,int b)
{
 return a+b;
}
static float add(float a, float b)
{
 return a+b;
}
static int add(int a,int b,int c)
{
 return a+b+c; 
}
static double add(double a, double b)
{
 return a+b;
}

public static void main(String args[])
{
 System.out.println("Sum of 2 integer: "+Adder.add(5,6));
 System.out.println("Sum of 2 float: "+Adder.add(2.5f,6.9f));
 System.out.println("Sum of 3 integer: "+Adder.add(9,1,4));
 System.out.println("Sum of 2 double: "+Adder.add(56.345,6.3455));
}
}