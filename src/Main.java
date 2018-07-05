/**
 * Created by student on 05.07.2018.
 */
public class Main {
    public static void main(String[] args) {
        IfElseOperation ifElse = new IfElseOperation();
        ifElse.ifElseOperation( "Andrii" , 20);
        ifElse.ifElseOperation( "Rosemari" , 40);
        ifElse.ifElseOperation( "SomeOne" , 30);
        ifElse.ifElseOperation( null, -30);


        SwitchCaseOperation switchCase = new SwitchCaseOperation();
        switchCase.ageResult(20);
        switchCase.ageResult(50);
    }
}
