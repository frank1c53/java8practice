package HashPractice;

public final class ImmutableClass {

    private final int id;
    private final String name;

    public ImmutableClass(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        ImmutableClass im = new ImmutableClass(101,"Frank");

        System.out.println(im.getId()+" "+im.getName());
    }
}
