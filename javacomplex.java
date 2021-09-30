import java.io.*;
class Complex
{
 double real,img;
 Complex(double real,double img)throws IOException
 {
 this.real=real;
 this.img=img;
 }
 Complex add(Complex obj)throws IOException{
 obj.real=this.real+obj.real;
 obj.img=this.img+obj.img;
 return obj;
 }
 void display()throws IOException
 {
 System.out.println("FROM same class object");
 System.out.println("Sum is: "+real+" + "+img+"i");
 }
 public static void main(String args[])throws IOException
 {
 InputStreamReader ob = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(ob);
 double n1,n2,n3,n4;
 System.out.println("Enter real and img part of first number :");
 n1=Double.parseDouble(br.readLine());
 n2=Double.parseDouble(br.readLine());
 System.out.println("Enter real and img part of Second number :");
 n3=Double.parseDouble(br.readLine());
 n4=Double.parseDouble(br.readLine());
 Complex num1 = new Complex(n1,n2);
 Complex num2 = new Complex(n3,n4);
 Complex temp = new Complex(0,0);
 temp = num1.add(num2);
 temp.display();
 Complex2 obj = new Complex2();
 obj.display1(temp);
 }
}
class Complex2
{
void display1(Complex obj1)
{
System.out.println("FROM different class object");
System.out.println("Sum is: "+obj1.real+" + "+obj1.img+"i");
}
}
