public abstract class Person {
    private String name;
    private int id;
    private int age;

    Person(String name, int id, int age){
        this.name = name;
        this.id = id;
        this .age = age;
    }

    public String getName() {return name;}

    public int getId() {return id;}

    public int getAge() {return age;}

    public String getDetails(){return "Name: " + name + "\nID: " + id + "\nAge: " + age;}


}
