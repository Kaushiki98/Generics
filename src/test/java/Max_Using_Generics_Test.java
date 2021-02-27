import org.junit.*;

public class Max_Using_Generics_Test {
    Max_Using_Generics maxVal = new Max_Using_Generics();
    public int findMax;

    @Test
    public void givenMaxNumberAt_FirstPosition() {
        Integer max = maxVal.maximum(54, 43, 21);
        Assert.assertEquals((Integer) 54, max);
    }

    @Test
    public void givenMaxNumberAt_SecondPosition() {
        Integer max = maxVal.maximum(14, 43, 21);
        Assert.assertEquals((Integer) 43, max);
    }

    @Test
    public void givenMaxNumberAt_ThirdPosition() {
        Integer max = maxVal.maximum(14, 43, 51);
        Assert.assertEquals((Integer) 51, max);
    }
}
