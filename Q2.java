public class Q2
{
    public Q2(){
    }

    private boolean mod3(int y){
        return y % 3 == 0 ? true : false;
    }
    
    private boolean mod5(int y){
        return y % 5 == 0 ? true : false;
    }
    
    private boolean both(int y){
        return this.mod3(y) && this.mod5(y);
    }
    
    public void printLine(){
        for (int i = 1; i < 101; i++){
            if (this.both(i)){
                System.out.println("FooBaa");
                continue;
            }
            if (this.mod3(i)){
                System.out.println("Foo");
                continue;
            }
            if (this.mod5(i)){
                System.out.println("Baa");
                continue;
            }
            System.out.println(i);
        }
    }
}
