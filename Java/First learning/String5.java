public class String5 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Emon");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'i');
        System.out.println(sb);

        //insert an charecter
        sb.insert(0,'S');
        System.out.println(sb);

        //delete any char or substring
        sb.delete(2,3);
        System.out.println(sb);

        //add any char or substring at the end
        sb.append("emon");
        System.out.println(sb);

        //length of the string
        System.out.println(sb.length());
    }
}
