package javaMemoryManagement;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("John"); // Johnathan

        sb.append("athan");

        System.out.println(sb); // Johnathan

        sb.append(123);
        System.out.println(sb);

        sb.insert(2, "$$$");
        System.out.println(sb);  // Jo$$$hnathan123  inserted dollar signs from index of 2

        sb.reverse();


    }
}
