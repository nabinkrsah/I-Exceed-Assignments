public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("World");
        StringBuilder empty = new StringBuilder();

        System.out.println(sb.append(" World"));
        System.out.println(sb.append('!'));
        System.out.println(sb.append(true));
        System.out.println(sb.append(123));
        System.out.println(sb.append(45.67));
        System.out.println(sb.append(new char[]{'J','a','v','a'}));
        System.out.println(sb.append(new char[]{'X','Y','Z'}, 0, 2));
        System.out.println(sb.append(new StringBuffer("Buffer")));
        System.out.println(sb.appendCodePoint(65));

        System.out.println(sb.capacity());

        System.out.println(sb.charAt(1));

        sb.setCharAt(1, 'A');
        System.out.println(sb);

        System.out.println(sb.codePointAt(0));
        System.out.println(sb.codePointBefore(1));
        System.out.println(sb.codePointCount(0, sb.length()));

        System.out.println(sb.delete(0, 5));
        System.out.println(sb.deleteCharAt(2));

        //System.out.println(sb.ensureCapacity(50));

        System.out.println(sb.indexOf("World"));
        System.out.println(sb.indexOf("or", 2));

        System.out.println(sb.insert(0, "Hello "));
        System.out.println(sb.insert(6, true));
        System.out.println(sb.insert(6, 123));
        System.out.println(sb.insert(6, 45.67));
        System.out.println(sb.insert(6, 'X'));
        System.out.println(sb.insert(6, new char[]{'A','B'}));
        System.out.println(sb.insert(6, new char[]{'C','D','E'}, 0, 2));
        System.out.println(sb.insert(6, new StringBuffer("Buffer")));

        System.out.println(sb.lastIndexOf("lo"));
        System.out.println(sb.lastIndexOf("lo", 5));

        System.out.println(sb.length());

        System.out.println(sb.replace(0, 5, "Hi"));

        System.out.println(sb.reverse());

        sb.setLength(10);
        System.out.println(sb);

        System.out.println(sb.substring(0));
        System.out.println(sb.substring(0, 5));

        System.out.println(sb.toString());

        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}
