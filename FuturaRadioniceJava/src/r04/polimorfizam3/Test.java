package r04.polimorfizam3;

/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
	public static void main(String[] args){
		Test t = new Test();
		t.test();
	}
    public void test() {
        Gramofon g=new Gramofon();
        g.javiSe(new Pas());
        g.javiSe(new Hipo());
        g.javiSe(new Macka());
        //g.javiSe(new Zirafa());
        
        
    }    
}
