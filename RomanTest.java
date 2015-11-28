import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

// 1 = I     10 = X   100 = C   1000 = M
// 5 = V     50 = L   500 = D

public class RomanTest {
   @Test
   public void convertsRomanNumbersToArabic() {
      assertThat(Roman.fromArabic(1), equalTo("I"));
   }
}
