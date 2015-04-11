package wicprogrammingcompetition;
import java.util.Scanner;
import java.lang.Math;
import static java.lang.Math.pow;

class Problem1{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
//We scan in the number of integers in the integer array.
int intinarray=sc.nextInt();
//We declare a new integer array that has the scanned number of elements.
int[] numbers=new int[intinarray];
//We scan in all the integers in the integer array.
for(int i=0; i<intinarray-1; i++){
    numbers[i]=sc.nextInt();
} 
System.out.println(luckOut(numbers));
}

public static int luckOut(int[] numbers) {
int i;
for(i=0; i<numbers.length-1; i++) { 
    if(pow(numbers[i], 1.0/3.0) % 1 == 0) i++;}
return i; 
}
}
