package kata.seeds.example

/**
  A nice Person who likes to greet you.
 */
class Person {
    /**
      Stores the greeting a person gives.
     */
    String greeting
    /**
      Instantiate a person with a default greeting.  Default greeting is "Hello!".
     */
    def Person() {
        greeting = 'Hello!'
    }
    /**
      Will output a greeting from the Person.
      @return A simple greeting.
     */
    public String greet() {
        greeting
    }
}
