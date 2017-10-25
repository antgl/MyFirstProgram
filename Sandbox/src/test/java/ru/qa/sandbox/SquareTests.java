package ru.qa.sandbox;


import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        s.area();
        assert s.area() == 25;

    }


}
