public class AppJava {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Khaira";
        child.dolt();
        System.out.println(child.name);
        Parent parent = (Parent) child;
        parent.dolt();
        System.out.println(parent.name);
    }
}
