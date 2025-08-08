import java.lang.reflect.Method;
 
class sampledemo{
  private String str="welcome";
 
  private void displayPvt()
  {
    System.out.println("Accessing this method outside of the class");
  }
}
 
class demoaccesspvt
 {
      public static void main(String[] args) throws Exception {
        //   sampledemo obj=new sampledemo();
        //   obj.displayPvt();
          Class c=Class.forName("sampledemo");
          Object o=c.newInstance();
          Method m1= c.getDeclaredMethod("displayPvt");
          m1.setAccessible(true);
          m1.invoke(o);
 
      }
 }