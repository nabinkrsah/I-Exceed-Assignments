public class StringBufferDemo {
    public static void main(String[] args) {
        // Different constructors
        StringBuffer sb1 = new StringBuffer();               // default capacity 16
        StringBuffer sb2 = new StringBuffer("Hello");         // with string
        StringBuffer sb3 = new StringBuffer(50);              // with capacity

        // Append methods
        sb1.append("Hello");
        sb1.append(' ');
        sb1.append("Java");
        sb1.append('!');
        sb1.append(true);
        sb1.append(123);
        sb1.append(45.67);
        sb1.append(new char[]{'A','B','C'});
        sb1.append(new char[]{'X','Y','Z'}, 0, 2);
        sb1.append(new StringBuffer("Buffer"));
        sb1.append("ABCDEFG", 1, 4);
        sb1.appendCodePoint(65); // 'A'

        // Insert methods
        sb1.insert(0, "START ");
        sb1.insert(6, true);
        sb1.insert(6, 123);
        sb1.insert(6, 45.67);
        sb1.insert(6, 'Q');
        sb1.insert(6, new char[]{'M','N'});
        sb1.insert(6, new char[]{'O','P','Q'}, 0, 2);
        sb1.insert(6, new StringBuffer("InsertBuf"));
        sb1.insert(6, "INSERTTEXT", 0, 5);

        // Capacity-related methods
        System.out.println("Capacity: " + sb1.capacity());
        sb1.ensureCapacity(100);
        sb1.trimToSize();

        // charAt, setCharAt, codePoints
        System.out.println("charAt(1): " + sb1.charAt(1));
        sb1.setCharAt(1, 'Z');
        System.out.println("codePointAt(0): " + sb1.codePointAt(0));
        System.out.println("codePointBefore(1): " + sb1.codePointBefore(1));
        System.out.println("codePointCount(0, length): " + sb1.codePointCount(0, sb1.length()));

        // getChars
        char[] dst = new char[20];
        sb1.getChars(0, Math.min(sb1.length(), 20), dst, 0);
        System.out.println("getChars(): " + new String(dst));

        // indexOf / lastIndexOf
        System.out.println("indexOf(\"a\"): " + sb1.indexOf("a"));
        System.out.println("indexOf(\"a\", 5): " + sb1.indexOf("a", 5));
        System.out.println("lastIndexOf(\"a\"): " + sb1.lastIndexOf("a"));
        System.out.println("lastIndexOf(\"a\", 10): " + sb1.lastIndexOf("a", 10));

        // length / setLength
        System.out.println("length(): " + sb1.length());
        sb1.setLength(10);
        sb1.setLength(Math.max(sb1.length(), 0));

        // delete / deleteCharAt
        sb1.delete(0, 3);
        if (sb1.length() > 2) sb1.deleteCharAt(2);

        // replace / reverse
        sb1.replace(0, Math.min(2, sb1.length()), "Hi");
        sb1.reverse();
        sb1.reverse();

        // substring / subSequence
        System.out.println("substring(0): " + sb1.substring(0));
        System.out.println("substring(0, 4): " + sb1.substring(0, Math.min(4, sb1.length())));
        System.out.println("subSequence(0, 3): " + sb1.subSequence(0, Math.min(3, sb1.length())));

        // Converting to String and checking contentEquals
        String sFromSb1 = sb1.toString();
        System.out.println("contentEquals: " + sFromSb1.contentEquals(sb1));

        // Print final StringBuffer content
        System.out.println("Final sb1: " + sb1);
    }
}
