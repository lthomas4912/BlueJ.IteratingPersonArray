 

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        Person currentPerson;
        // assume there is a `counter`
        int i= 0;
        // while `counter` is less than length of array
            // begin loop
        while(i < personArray.length) {
        currentPerson = personArray[i];
        String stringRepresentation = currentPerson.toString();
        result += stringRepresentation;
        i++;
        } 
        
        // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        Person currentPerson;
        // identify initial value
        // identify terminal condition
        // identify increment
        for(int i = 0; i < personArray.length; i++){
         currentPerson = personArray[i];
        String stringRepresentation = currentPerson.toString();
        result += stringRepresentation;
        }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        ;
        // identify array's type
        // identify array's variable-name
        for(Person currentPerson : personArray){
        String stringRepresentation = currentPerson.toString();
        result += stringRepresentation;
        }
         
            
            
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
