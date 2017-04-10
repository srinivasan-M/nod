import java.util.*;
class nod
{
public static void main(String args[])
{
int t=0;
int n=Integer.parseInt(args[0]);
int count=0,t=n;
while(t>0)
{
t/=10;
count++;
}
System.out.print(count);
}
}
