@FunctionalInterface
interface Workable{
    void work();
}

// ..FunctionInterface is the interface which have exactly one method
// @FucntionalInterface shows the given interface have only one method

class Human implements Workable{
    public void work(){
        System.out.println("Human is working...");
    }
}