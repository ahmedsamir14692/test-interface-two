
package interfacetwo;


 interface NewInterface {
    void m1();
    void m2 ();
    
}
interface two extends NewInterface {
    @Override
    void m1();
    default void def()
    {
        System.out.println("ahmed");
        
    }
    
}
class ininterface implements two
{

    @Override
    public void m1() {
        
    }

    @Override
    public void m2() {
        
    }
    
    ininterface t;
    void m5()
    {
        t.def();
        
    }
    @Override
    public  void def()
    {
        System.out.println("ahmed");
        two.super.def();
        
    }
    
}