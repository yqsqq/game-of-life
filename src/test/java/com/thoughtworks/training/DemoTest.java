package com.thoughtworks.training;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class DemoTest {
    @Test
    public void should_say_hello_to_joe_when_joe_greeting() {
        assertThat(new Demo().say("joe"), is("hello joe!"));
    }
}
