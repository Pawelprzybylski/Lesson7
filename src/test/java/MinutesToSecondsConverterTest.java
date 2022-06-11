import org.junit.Assert;
import org.junit.Test;

public class MinutesToSecondsConverterTest {
    @Test
    public void shouldConvertMinutesToSeconds() {
        //given
        int minutes = 50;

        //when
        int result = MinutesToSecondsConverter.convert(minutes);

        //then
        Assert.assertEquals(3000,  result);
    }

}

