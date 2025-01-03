package com.week2;

public class OperatorDemo {

	public static void main(String[] args)
	{
		System.out.println("Arithmetic Operators");
		int a=20,b=10;
		System.out.println("Addition is:"+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Modulus is: "+(a%b));
		System.out.println("Unary Operators");
		
		/*
		 * ++(increment)  --(decrement)
		 * a++ =Post increment a=a+1
		 * ++a =pre increment
		 * a-- =post decrement a=a-1
		 * --a =pre decrement
		 */
		
		
		int x=100;
		System.out.println(x);//100
		System.out.println(x++);//100
		
		System.out.println(x);//101
		
		int y=90;
		System.out.println(y);//90
		System.out.println(++y);//91
		
		int a1=89;
		int b1=a1++;
		System.out.println(a1);//90
		System.out.println(b1);//89
		
		int i=157;
		int j=i++;
		System.out.println(i);//158
		System.out.println(j);//157
		
		int u=67;
		int v=++u;
		
		System.out.println(u);//68
		System.out.println(v);//68
		
		int e=155;
		int f=++e;
		System.out.println(e);//156
		System.out.println(f);//156
		
		int p=140;
		int q=p--;
		System.out.println(p);//139
		System.out.println(q);//140
		
		
		int r=45;
		int s=--r;
		System.out.println(r);//44
		System.out.println(s);//44
		
		System.out.println("Relational Oprators");
		
		//r=s=44 q=140 e=f=156 a1=90 u=v=68
		
		System.out.println("less that <:"+(a1<q));//true
		System.out.println("Less than equal to <= :"+(r<=s));//true
		System.out.println("Greater than >: "+(e>q));//true
		System.out.println("Greater than equal to >: "+(u>=q));//false
		System.out.println("comparison operator: =="+(u==v));//true
		System.out.println("comparison operator: =="+(u==e));//false
		System.out.println("not equal to : != "+(e!=f));//false
		System.out.println("Not equal to : != "+(u!=s));//true
		
		System.out.println("Logical Operators");
		/*
		 *    	a     b        and (&&)            or(||)         Not !(a!)
		 *    
		 *    true  true		true 				true			false
		 *    true 	false		false				true			false
		 *    false true		false				true			true
		 *    false false		false				false			true
		 *    
		 *    
		 */
		
		System.out.println((u!=s)&&(r<=s));//true
		System.out.println(u==v && e<s); //false
		System.out.println(s>r && u==v);  //false
		System.out.println(e>f && r>q);//false
		
		
		System.out.println((u!=s)||(r<=s));//true
		System.out.println(u==v || e<s); //true
		System.out.println(s>r || u==v);  //true
		System.out.println(e>f || r>q);//false
		
		//not !
		System.out.println(!(u==v));//true-->false

		System.out.println(!(q<s));//false--->true
		
		
		//ternary operator in java
		//(condition?true:false)
		int num1=100,num2=800;
		if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
			
		}else
		{
			System.out.println(num2+" is greater than "+num1);
		}
		System.out.println("**************");
		System.out.println("Using ternary operator");
		System.out.println(num1>num2?num1+" is greater than "+num2:num2+" is greater than "+num1);

				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
