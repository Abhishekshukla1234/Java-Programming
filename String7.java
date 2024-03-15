public class String7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abhishek");
        System.out.println(sb);


        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0 
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert new word
        sb.insert(0, 'c');
        System.out.println(sb);

        // deleted char in string
        sb.delete(2, 4);
        System.out.println(sb);

        // append function used in string builder
        sb.append("s");
        sb.append("h");
        sb.append("u");
        sb.append("k");
        sb.append("l");
        sb.append("a");
        System.out.println(sb);
    }
}
