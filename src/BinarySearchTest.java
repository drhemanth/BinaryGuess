/**
 * Created by hemanth on 14/03/2016.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class BinarySearchTest {
    @Test
    public void binarysearch0(){
        BinarySearch f= new BinarySearch ();
        int result = f.Binarysearchfunction(20,10);
        assertEquals(1,result);
    }

}
