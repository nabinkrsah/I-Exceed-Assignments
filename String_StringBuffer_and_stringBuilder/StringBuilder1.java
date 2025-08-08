
public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("World");
        StringBuilder sb3 = new StringBuilder(32);
        StringBuilder sb4 = new StringBuilder("Hello");

        System.out.println("empty sb1 -> '" + sb1 + "'");
        System.out.println("sb2 -> '" + sb2 + "'");

        sb1.append("Hello").append(' ').append("Java").append('!');
        sb1.append(true).append(123).append(45.67);
        System.out.println("after appends -> " + sb1);

        sb1.append("ABCDEFG", 1, 4);
        System.out.println("append(CharSequence,1,4) -> " + sb1);

        sb1.insert(5, " INSERTED ");
        System.out.println("after insert(5, \" INSERTED \") -> " + sb1);

        sb1.insert(0, 999);
        System.out.println("after insert(0,999) -> " + sb1);

        sb1.insert(3, "SUBSEQ", 1, 4);
        System.out.println("insert(3, \"SUBSEQ\",1,4) -> " + sb1);

        sb1.append(new char[]{'X','Y','Z'});
        sb1.append(new char[]{'A','B','C','D'}, 1, 2);
        System.out.println("after appending char arrays -> " + sb1);

        sb1.appendCodePoint(65);
        System.out.println("after appendCodePoint(65) -> " + sb1);

        System.out.println("capacity before ensure -> " + sb1.capacity());
        sb1.ensureCapacity(80);
        System.out.println("capacity after ensure(80) -> " + sb1.capacity());
        sb1.trimToSize();
        System.out.println("capacity after trimToSize -> " + sb1.capacity());

        System.out.println("charAt(1) -> " + sb1.charAt(1));
        sb1.setCharAt(1, 'Z');
        System.out.println("after setCharAt(1,'Z') -> " + sb1);

        System.out.println("codePointAt(0) -> " + sb1.codePointAt(0));
        System.out.println("codePointBefore(1) -> " + sb1.codePointBefore(1));
        System.out.println("codePointCount(0,length) -> " + sb1.codePointCount(0, sb1.length()));

        char[] dst = new char[20];
        int copyLen = Math.min(sb1.length(), dst.length);
        sb1.getChars(0, copyLen, dst, 0);
        System.out.print("getChars into dst -> ");
        for (int i = 0; i < copyLen; i++) System.out.print(dst[i]);
        System.out.println();

        System.out.println("indexOf(\"a\") -> " + sb1.indexOf("a"));
        System.out.println("indexOf(\"a\", 5) -> " + sb1.indexOf("a", 5));
        System.out.println("lastIndexOf(\"a\") -> " + sb1.lastIndexOf("a"));
        System.out.println("lastIndexOf(\"a\", 10) -> " + sb1.lastIndexOf("a", 10));

        System.out.println("length -> " + sb1.length());
        sb1.setLength(10);
        System.out.println("after setLength(10) -> '" + sb1 + "' length -> " + sb1.length());

        sb1.setLength(Math.max(sb1.length(), 0));
        sb1.append("-END-");
        System.out.println("after append and setLength reset -> " + sb1);

        sb1.delete(0, 3);
        System.out.println("after delete(0,3) -> " + sb1);
        if (sb1.length() > 2) sb1.deleteCharAt(2);
        System.out.println("after deleteCharAt(2) -> " + sb1);

        sb1.replace(0, Math.min(2, sb1.length()), "Hi");
        System.out.println("after replace(0,2,\"Hi\") -> " + sb1);

        sb1.reverse();
        System.out.println("after reverse -> " + sb1);
        sb1.reverse();

        System.out.println("substring(0,4) -> " + sb1.substring(0, Math.min(4, sb1.length())));
        System.out.println("subSequence(0,3) -> " + sb1.subSequence(0, Math.min(3, sb1.length())));

        System.out.println("toString() -> " + sb1.toString());

        System.out.println("equals(sb1,sb2) (reference equality) -> " + sb1.equals(sb2));
        String sFromSb1 = sb1.toString();
        String sFromSb4 = sb4.toString();
        System.out.println("toString().equals(toString()) content equality -> " + sFromSb1.equals(sFromSb4));

        System.out.println("String.contentEquals(sb1) -> " + sFromSb1.contentEquals(sb1));

        String s = sb1.toString();
        System.out.println("String-level contains(\"lo\") -> " + s.contains("lo"));
        System.out.println("String-level startsWith(\"He\") -> " + s.startsWith("He"));
        System.out.println("String-level endsWith(\"d\") -> " + s.endsWith("d"));
        System.out.println("String-level matches(\".*World.*\") -> " + s.matches(".*World.*"));

        String[] parts = s.split("\\s+");
        System.out.println("split on whitespace -> length " + parts.length);
        for (String p : parts) System.out.println("part -> '" + p + "'");

        String replaced = s.replaceAll(" ", "_");
        System.out.println("replaceAll spaces with _ -> " + replaced);

        System.out.println("compareTo between strings from builders -> " + sFromSb1.compareTo(sFromSb4));
    }
}
