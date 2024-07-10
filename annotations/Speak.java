class Animal{
    public void speak(){
        System.out.println("Animal is Speaking...");
    }
}

class Dog{
    @Override
    public void speak(){
        System.out.println("Dog is Barking...");
    }
}

class Cat{
    @Override
    public void speak(){
        System.out.println("mmmiiiiuuuuunnnn...");
    }
}


/**
 * @Override is a Built in Annotaion which is used to denote that 
 * given method is override from perent if we make any mistake while
 * overriding so this will show error
 */