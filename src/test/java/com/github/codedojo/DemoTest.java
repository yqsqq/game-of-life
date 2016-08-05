package com.github.codedojo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class DemoTest {
    @Test
    public void should_say_hello_to_joe_when_joe_greeting() throws Exception {
        assertThat(new Demo().say("joe"), is("hello joe!"));
    }
}
