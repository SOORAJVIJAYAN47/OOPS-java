import java.util.*;
class Main
{
   int pcode;
String pname;
double price;
double lowest;
void data(int c,String n,double p)
{
pcode=c;
pname=n;
price=p;
}
void display()
{
System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
}
static void findLowest(double price1,double price2,double price3)
{
if(price1<=price2 && price1<=price3)
{
System.out.println("\n product 1 is the lowest price!");
}
else if(price2<=price1 && price2<=price3)
{
System.out.println("\n product 2 is the lowest price!");
}
else{
System.out.println("\n product 3 is the lowest price!");
}
}
public static void main(String[] args)
{
Main obj1=new Main();
Main obj2=new Main();
Main obj3=new Main();
obj1.data(101,"Product_1",100.0);
obj1.data(102,"Product_2",128.40);
obj1.data(101,"Product_3",790.00);
System.out.println("Product_Information:\n Product_Code\tProduct_Name\tProduct_Price");
obj1.display();
obj2.display();
obj3.display();
findLowest(obj1.price,obj2.price,obj3.price);
}
}