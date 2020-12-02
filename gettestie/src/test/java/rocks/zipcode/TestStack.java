package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }
@Test
    public void TestPop(){
        //Given
    Stack<String> stack = new Stack<>();//make new stack
    String expected = "Hi";//make new string
    stack.push(expected);//add string to stack

    //when (define what actually happens in this section)
    String actual = stack.pop();//this is what is actually happening and what we expect from above

    //Then Writing your assertions (if expect and actual are the same)
    Assert.assertEquals(expected,actual);
}

@Test
    public void TestPeek(){
    //Given
    Stack<String> stack = new Stack<>();
    String expected = "Greetings";
    stack.push(expected);

    //when
    String actual = stack.peek();

    //Then
    Assert.assertEquals(expected,actual);

}
    // Make a bigger test exercising more Stack methods.....
}
