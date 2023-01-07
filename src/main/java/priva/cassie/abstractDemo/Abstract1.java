package priva.cassie.abstractDemo;

public abstract class Abstract1 {
    public static final String COLOUR="Red";
    static final String NAME="Cassie";
    private int age;
    private String sex;

    public Abstract1(){

    }

    public Abstract1(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public abstract void show();

    public void setAge(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
