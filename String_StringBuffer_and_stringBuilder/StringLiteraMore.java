public class StringLiteraMore {
    public static void main(String[] args) {
        String s = "Hello World";
        String s2 = "Java";
        String s3 = "   Trim Test   ";
        String empty = "";
        String repeated = "abcabc";
        String numStr = "12345";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(5));

        System.out.println(s.chars().count());

        System.out.println(s.codePointAt(1));
        System.out.println(s.codePointBefore(2));
        System.out.println(s.codePointCount(0, s.length()));

        System.out.println(s.compareTo(s2));
        System.out.println(s.compareToIgnoreCase("hello world"));

        System.out.println(s.concat(s2));

        System.out.println(s.contains("World"));

        System.out.println(s.contentEquals("Hello World"));
        System.out.println(s.contentEquals(new StringBuffer("Hello World")));

        System.out.println(s.endsWith("ld"));

        System.out.println(s.equals("Hello World"));
        System.out.println(s.equalsIgnoreCase("hello world"));

        System.out.println(s.hashCode());

        System.out.println(s.indexOf('o'));
        System.out.println(s.indexOf("World"));
        System.out.println(s.indexOf('o', 5));
        System.out.println(s.indexOf("o", 5));

        System.out.println(s.isEmpty());

        System.out.println(String.join(":", "one", "two", "three"));
        System.out.println(s.join("-", "A", "B", "C"));

        System.out.println(s.lastIndexOf('o'));
        System.out.println(s.lastIndexOf("o"));
        System.out.println(s.lastIndexOf('o', 5));
        System.out.println(s.lastIndexOf("o", 5));

        System.out.println(s.length());

        System.out.println(s.lines().count());

        System.out.println(s.matches(".*World"));

        System.out.println(s.regionMatches(0, "Hello", 0, 5));
        System.out.println(s.regionMatches(true, 0, "hello", 0, 5));

        System.out.println(s.repeat(2));

        System.out.println(s.replace('o', 'a'));
        System.out.println(s.replace("World", "Java"));
        System.out.println(s.replaceAll("o", "0"));
        System.out.println(s.replaceFirst("o", "0"));

        String[] parts = s.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }
        String[] parts2 = repeated.split("b", 2);
        for (String part : parts2) {
            System.out.println(part);
        }

        System.out.println(s.startsWith("Hel"));
        System.out.println(s.startsWith("lo", 3));

        System.out.println(s.strip());
        System.out.println(s.stripLeading());
        System.out.println(s.stripTrailing());

        System.out.println(s.substring(6));
        System.out.println(s.substring(0, 5));

        System.out.println(s.toCharArray());
        for (char c : s.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println(s.trim());
        System.out.println(s3.trim());

        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(new char[]{'a','b','c'}));
    }
}
