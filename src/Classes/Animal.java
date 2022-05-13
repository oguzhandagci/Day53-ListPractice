package Classes;

public class Animal {
    String  name;
    boolean isItDog;

    public Animal (String name, boolean isItDog){

        this.name = name;
        this.isItDog = isItDog;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setItDog(boolean isItDog){
        this.isItDog = isItDog;
    }

    public boolean getItDog(){
        return isItDog;
    }

    @Override
    public String toString() {
        return getName() + " is a dog = " + getItDog();
    }
}
