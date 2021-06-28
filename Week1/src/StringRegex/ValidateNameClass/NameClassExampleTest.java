package StringRegex.ValidateNameClass;

public class NameClassExampleTest {
    private static NameClassExample nameClassExample;
    public static final String[] validNameClass = new String[] {"C0318G"};
    public static final String[] invalidNameClass = new String[] {"M0318G", "P0323A"};

    public static void main(String[] args) {
        nameClassExample = new NameClassExample();
        for (String nameClass : validNameClass) {
            boolean isvalid = nameClassExample.validate(nameClass);
            System.out.println("Class name is " + nameClass +" is valid: "+ isvalid);
        }
        for (String nameClass : invalidNameClass) {
            boolean isvalid = nameClassExample.validate(nameClass);
            System.out.println("Class name is " + nameClass +" is valid: "+ isvalid);
        }
    }
}
