package kata.seeds.example
//the PersonTest() class automatically sees the Person() class because they're in the same package

import org.junit.After
import org.junit.Before
import org.junit.Test

class PersonTest extends GroovyTestCase {
    def person
    //set up before every test
    @Before protected void setUp() {
        person = new Person()
    }
    //tear down after every test
    @After protected void tearDown() {
        person = null
    }
    @Test public void test_Person_greet() {
        assert 'Hello!' == person.greeting
        assert 'Hello!' == person.greet()
        person.greeting = 'Hello, friend!'
        assert 'Hello, friend!' == person.greeting
        assert 'Hello, friend!' == person.greet()
    }
}
