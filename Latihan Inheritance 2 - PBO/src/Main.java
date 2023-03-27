public class Main {
    public static void main(String[] args) {
        Person uwong = new Person("Slamet Kopling","Terminal Kuningan");
        String getname = uwong.getName();
        String getadress = uwong.getAdress();;
        System.out.print("Nama : " + getname);
        System.out.println("Alamat : " + getadress);
        System.out.println(uwong);
        System.out.println("");

    }
}