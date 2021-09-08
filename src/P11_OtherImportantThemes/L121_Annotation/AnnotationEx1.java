package P11_OtherImportantThemes.L121_Annotation;

public class AnnotationEx1 {
    public static void main(String[] args) {

        Parent parent = new Child("Oleg");
        parent.showInfo();


    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    @Deprecated
    void showInfo() {
        System.out.println("It's parent class. Name = " + name);
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("It's child class. Name = " + name);
    }
}