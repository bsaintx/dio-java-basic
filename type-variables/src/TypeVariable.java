public class TypeVariable {
    public static void main(String[] args) {
        byte age = 123;
        short year = 2021;
        int postalCode = 24346675;
        long cpf = 11122233396L; // Terminar com L quando for long
        float pi = 3.12F; // terminar com F quando for float
        double salary = 1500.64;

        short shortNumber = 1;
        int normalNumber = shortNumber;
        short normalNumber2 = (short) normalNumber; // cast - adapta o tipo de uma variável: Pouco usado.
    }
}
