package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("shama");
        obj.setAge(19);
        obj.setRollNo(51);

        System.out.println("Prime's name:" + obj.getName("shama") );
        System.out.println("Prime's age:" + obj.getAge() );
        System.out.println("Prime's rollNo:" +obj.getRollNo());
    }
}
