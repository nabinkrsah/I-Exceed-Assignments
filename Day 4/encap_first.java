class encap_first1{
    private int x;
    private int y;
    encap_first1(int x, int y){
        this.x=x;
        this.y=y;
        
    }
    public void getValue(){
        int value=x*y;
        System.out.println("value of the given calc is "+value);
    }

}

class encap_first{
    public static void main(String[] args){
        encap_first1 aa=new encap_first1(4, 5);
        aa.getValue();
    }
}