//static
 public class JavaKA{

static String cource="java";
      int time=7;
static void notes(){
    System.out.println(cource);
}

 
 public static void main(String[]args){
  
      notes();  
 //now create the new obj to call int time is non static 
   JavaKA y=new JavaKA();
   System.out.println(y.time);
}    
}

