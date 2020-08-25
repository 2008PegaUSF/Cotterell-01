interface operates
{

void addition(int x,int y);

void subtraction(int a,int b);

void multiplication(int l, int m);

void division(int q, int r);

}

//class that implements this interface
class functions implements operates
{

public void addition(int x, int y)
{
int z;
z = x+y;
System.out.println("addition is: "+ z);
}
 

public void subtraction(int a, int b)
{
int c;
c = a-b;
System.out.println("difference is: " + c);
}
 

public void multiplication(int l, int m)
{
int n;
n = l*m;
System.out.println("product is: " + n);
}
  

public void division(int q, int r)
{
int s;
s = q/r;
System.out.println("division is: " + s);
}


}