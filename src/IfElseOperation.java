/**
 * Created by student on 05.07.2018.
 */
public class IfElseOperation {
    public void ifElseOperation(String name, int age) {
        if (name == null && age <= 0) {
            System.out.println("NOP");
        } else if(name == "SomeName" && age == 30){

            System.out.println(name + ", age: " + age);

        } else {
            System.out.println("name:" + name + ", age: " + age);
        }
// Тернарний оператор
        String ageResult =(age <= 20 || name == "SomeName") ? "Ok" : name;
        System.out.println(ageResult);

        if(age == 20) {
            ageResult = "Ok";

        }else  {
            ageResult = "name";
        }
    }


}
