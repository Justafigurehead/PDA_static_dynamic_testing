import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class TestPda{

  Pda pda; 

  @Before
  public void before(){
    pda = new Pda();
  }

  @Test 
  public void testFuncOne(){
    assertEquals(true, pda.funcOne(1));
  }

  @Test 
  public void testmax(){
    assertEquals(4, pda.max(4,1));
  }

  @Test
  public void testLooper(){
    assertEquals(10, pda.looper());
  }

  @Test
  public void testcheckLoop(){
    assertEquals("looper passed", pda.checkLoop());
  }
}