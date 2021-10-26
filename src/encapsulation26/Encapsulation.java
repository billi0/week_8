package encapsulation26;

 public class Encapsulation {
     private String name;
     private int rollNo;
     private int age;

     public String getName(String name){
         return name;
     }
     public void setName(String name){
         this.name = name;
     }
     public int getRollNo(){
         return getRollNo();
     }
     public void setRollNo(int rollNo){
         this.rollNo = rollNo;
     }
     public int getAge(){
         return age;
     }
     public void setAge(int age){
         this.age = age;
     }


}
