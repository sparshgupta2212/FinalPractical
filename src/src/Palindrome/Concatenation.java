package Palindrome;
import java.util.Scanner;
public class Concatenation {
    private String string1;
    private String string2;
    Concatenation(String string1,String string2){
        this.string1=string1;
        this.string2=string2;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2= string2;
    }

    public void concatePalindrome(){
        String str1=getString1();
        String str2=getString2();
        int flag=0,f=0;
        String rev1=" ";
        String rev2=" ";
        for (int i =str1.length()-1; i>=0; i--) {
             rev1=rev1 + str1.charAt(i);
        }
        if (str1.equals(rev1)) {
            flag=1;
        }
        for (int j = str2.length()-1; j>=0 ; j--) {
            rev2 = rev2 + str2.charAt(j);
        }
        if(str2.equals(rev2)){
            f=1;
        }


        if(flag==1 && f==1){
            System.out.println();
        }
else{
            System.out.println(str1+str2);
        }


        }
    }


class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first string:");
        String string1=scanner.nextLine();
        System.out.println("Enter second string:");
        String string2=scanner.nextLine();
        Concatenation obj=new Concatenation(string1,string2);
        obj.concatePalindrome();
    }
}
