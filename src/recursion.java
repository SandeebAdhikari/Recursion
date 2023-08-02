public class recursion{
public static void main(String[]args) {
	int sum =0;
	for (int i=1; i<=10;i++) {
		sum+= Problem7(i);
	}
	System.out.println("Problem1: "+Problem1(8,12));
	System.out.println("Problem2: "+g(10));
	System.out.println("Problem3: "+Problem3(30,12));
	System.out.println("Problem4: "+Problem4(32));
	System.out.println("Problem5: "+Problem5(5));
	System.out.println("Problem6: "+Problem6(35,8));
	System.out.println("Problem7: "+sum);
	System.out.println("Problem8: "+f(18));
}
	
public static int Problem1(int x , int y){
	if (x < y)
	return Problem1(x+1,y-2)+3;
	else if (x>y)
		return Problem1(y-1,x)-1;
	return (int)(Math.pow(x,2) +Math.pow(y, 2));
	}

public static int g(int x) {
	if(x>7)
		return g(x-5)-3;
	else if(x>3 && x<=7)
	return g(x+2)+ 2;
	
	return x+5;
	}

public static int Problem3(int x, int y) {
	if(x>y)
	return Math.max(Problem3(x-4 , y+3), Problem3(y,x));
	return x * y;
	}

public static int Problem4(int x){
	if(x % 2 == 0)
		return Problem4(x/2-1)+3;
	else if(x<0)
		return x*x -3;
	return 2* Problem4(x-3)-5;
	}

public static int Problem5(int x) {
	if(x==1)
		return 8;
	return 2 * Problem5(x-1) - 4;
	}

public static int Problem6(int x, int y){
	if(x>=y)
		return Problem6(x-y, y+2)+y;
	return x*x-y;
	}
	
public static int Problem7(int n){
	if(n==1)
		return 1 ;
	return Problem7(n-1)+5;
	}

//Problem 8
public static int f(int x) {
	if(x>=10)
		return f(x-5)-2;
	else if(x>=7 && x<10)
		return f(x+4)+6;
	return x-4;
	}
}

/* OUTPUTS
Problem1: 136
Problem2: 7
Problem3: 396
Problem4: 10
Problem5: 68
Problem6: 41
Problem7: 235
Problem8: 6
*/