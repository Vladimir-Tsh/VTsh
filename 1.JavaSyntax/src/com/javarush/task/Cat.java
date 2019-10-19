public class Cat {

    private String name;
    static int iF = 0;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public static void main(String[] args) throws Throwable {

        for (int i = 0 ; i < 1000000; i++) {
            System.out.println("Create: " + i);
            Cat cat = new Cat();
            cat = null;//вот здесь первый объект становится доступен сборщику мусора
            System.out.println("Delete: " + i);
        }

        System.out.println("iF: " + iF);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Объект Cat уничтожен!");
        iF++;
    }
}