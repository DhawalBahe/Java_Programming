public class Operator{
  
public static void main(String[] args){

int x=10;

int y=20;


//Unary operator

System.out.println(x);//10

System.out.println(x++);//10(11)   //x=x+1;

System.out.println(x);//11

System.out.println(x--);//11   //x=x-1;

System.out.println(x);//10

System.out.println("============================================");

System.out.println(-x);

System.out.println(x);

System.out.println("============================================");

//Arithmatic operator(+,-,*,%,/)

//it perfome operations  on two  operands
/*
System.out.println(y+z);
System.out.println(z-y);
System.out.println(y*z);
System.out.println(y/z); //0
System.out.println(y%z); //12
*/


System.out.println("============================================");

//relational operator(<,>,<=,>=,instanceOf)


System.out.println(x>y);

System.out.println(x<y);


System.out.println(x<=y);

System.out.println(x>=y);



}
}
