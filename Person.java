public class Person {
    private String name;
    private String date_of_brith;

    public String getName() {
        return this.name;
    }

    public String getDate_of_brith() {
        return this.date_of_brith;
    }

    public Person(String name, String date_of_brith) {
        this.name = name;
        this.date_of_brith = date_of_brith;

    }



    @Override
    public String toString() {
        return "Person [date_of_brith=" + date_of_brith + ", name=" + name + "]";
    }


}