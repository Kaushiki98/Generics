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

    @Test
    public void givenMaxNumberAt_FirstPosition_inFloatValue() {
        Double max = maxVal.maximum(5.4, 3.3, 2.0);
        Assert.assertEquals((Double) 5.4, max);
    }

    @Test
    public void givenMaxNumberAt_SecondPosition_inFloatValue() {
        Double max = maxVal.maximum(1.4, 4.3, 2.1);
        Assert.assertEquals((Double) 4.3, max);
    }

    @Test
    public void givenMaxNumberAt_ThirdPosition_inFloatValue() {
        Double max = maxVal.maximum(4.3, 3.9, 5.1);
        Assert.assertEquals((Double) 5.1, max);
    }

    @Test
    public void givenMaxNumberAt_FirstPosition_inStringValue() {
        String max = maxVal.maximum("mango", "apple", "banana");
        Assert.assertEquals((String) "mango", max);
    }

    @Test
    public void givenMaxNumberAt_SecondPosition_inStringValue() {
        String max = maxVal.maximum("eagle", "parrot", "dove");
        Assert.assertEquals((String) "parrot", max);
    }

    @Test
    public void givenMaxNumberAt_ThirdPosition_inStringValue() {
        String max = maxVal.maximum("diary", "pen", "textbook");
        Assert.assertEquals((String) "textbook", max);
    }
}

