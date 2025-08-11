class stringconcat{
    public String concaString(){
        String str="iexceed";
        for(var i=0;i<10000;i++){
            str +="technology";
        }
        return str;
    }
    public String concatstringwithbuffer(){
        StringBuffer sb= new StringBuffer("iexceed");
        for(var i=0;i<10000;i++){
            sb.append("technology");
        }
        return sb.toString();
    }
}
public class demoSringTest {
    public static void main(String[] args) {
        stringconcat st=new stringconcat();
        long stm=System.currentTimeMillis();
        st.concaString();
        System.out.println(System.currentTimeMillis()-stm);
        long stbm=System.currentTimeMillis();
        st.concatstringwithbuffer();
        System.out.println((System.currentTimeMillis()-stbm));
    }
    
}
