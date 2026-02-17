public class Printf {
    public static void main(String[] args){
        //printf()=is a method used to format output
        //%[flags][width][.precision][specifier-character]

        //[specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Hello %S\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.2f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("Your name is %s.\nWhose name start with %c.\nYou are %d years old.\nYou are %.2f inches tall.\nYou are Employed: %b\n", name,firstLetter,age,height,isEmployed);
    }
}
