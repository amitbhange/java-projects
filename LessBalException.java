import java.util.*;
class LessBalException extends Exception{
  int num;

  LessBalException(){
   System.out.println("balance is not sufficient passs the amount less than or eqaual to the banak balance");
  }

  LessBalException(int num){

 this.num=num;
   System.out.println("not sufficient balance in account:"+num);
 }

 public String toString(){
      return ("your current balance is: "+num);
  }

}