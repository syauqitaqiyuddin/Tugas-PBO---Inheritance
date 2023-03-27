public class Person {
    private String name;
    private String adress;

    public Person(String name, String address) {
        this.name = name;
        this.adress = adress;
    }
    public String getName(){
        return name;
    }
    public String getAdress(){
        return adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
            '}';

    }

}

