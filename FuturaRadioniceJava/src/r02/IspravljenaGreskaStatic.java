package r02;
/**
 * Izbjegnuta �esta gre�ka kada se iz main metode (static) 
 * poku�avaju koristiti varijable i metode koje nisu static.
 * U main metodi se stvara objekt (vlastitog tipa) i na
 * tom objektu se pozivaju metode i koriste varijable.
 * @author Krunoslav �ubrini�
 * 11. o�u 2015.
 */
public class IspravljenaGreskaStatic {
	private int x, y;
    public static void main(String[] args)
    {
        // Gre�ka je ispravljena tako da je u static metodi kreiran objekt. varijable i metode
        // Varijablama i metodama se pristupa na tom objektu, tako
        // da se zna kojoj kopiji varijabli se pristupa.
        // Ovakav na�in rada je znatno bolji od prethodnog!
	 IspravljenaGreskaStatic a = new IspravljenaGreskaStatic();
         a.x = 3;
         a.y = 5;
         System.out.println(a.x + " + " + a.y + " = "+a.zbroj(a.x, a.y)); 
    }   
    public int zbroj(int a, int b)
    {
        return a + b;
    }
}
