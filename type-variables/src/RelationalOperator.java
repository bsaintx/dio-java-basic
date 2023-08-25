public class RelationalOperator {
    public static void main(String[] args) {
        String name1 = "Bruno";
        String name2 = "Bruno";
        // When you use object, recommended to use the method "equals";
        System.out.println(name1.equals(name2));

        int num1 = 1;
        int num2 = 2;

        boolean yesNot = num1 == num2;

        if (num1 != num2) {
            System.out.println("A condição e verdad");
        }

        System.out.println("num1 é igual a num2? " + yesNot);

        yesNot = num1 != num2;
        System.out.println("num1 é diferente de num2? " + yesNot);

    }
}
