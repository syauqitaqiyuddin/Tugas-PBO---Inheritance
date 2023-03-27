public class Staff {
    private String School;
    private Double pay;

    public Staff(String school, Double pay) {
        School = school;
        this.pay = pay;
    }
    public String getSchool(){
        return School;
    }
    public double getPay(){
        return pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "School='" + School + '\'' +
                ", pay='" + pay + '\'' +
                '}';
    }
}
