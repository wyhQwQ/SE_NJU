package edu.nju;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Moekr on 2017/10/30.
 */
public class HelloWorldTest {
    @Test
    public void testHelloWorld(){
        Assert.assertEquals("Hello World!", new HelloWorld().helloWorld());
    }
}
