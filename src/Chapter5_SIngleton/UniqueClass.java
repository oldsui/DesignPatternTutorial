package Chapter5_SIngleton;


public class UniqueClass {
    private String name;

    private static UniqueClass myInstance;

    private UniqueClass(String name) {
        this.name = name;
    }

    public static UniqueClass getInstance() {
        if (myInstance == null) {
            myInstance = new UniqueClass("Unique");
        }
        return myInstance;
    }
}
