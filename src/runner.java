public class runner {
    public static void main(String[] args) {
        Bage bage = new Bage();
        bage.add("Apple");
        bage.add("Bana");
        bage.add("Apple");
        bage.add("Apple");
        System.out.println("Number of  Apple : 3");
        System.out.println(bage.count("Apple"));
    }
}
