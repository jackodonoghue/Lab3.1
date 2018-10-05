public class Person {

    private String name;

    //constructors
    //example of method overloading??
    public Person(){
        this ("Unknown");
    }


    public Person(String n){
        //setting attributes values directly)
        this.name=n;
    }

    //accessor methods
    public String getName() {
        return name;
    }


    //mutator methods
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return getName() +"\n";
    }
    }