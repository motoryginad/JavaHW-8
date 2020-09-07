public class Main {
    public static void main(String[] args) {
        int bodyWeight = 95;
        int bodyHight = 189;
        int bodyMassIndex = bodyWeight / bodyHight ^ 2;
        System.out.println(bodyMassIndex);
    }
}