package main;

public class MainSystem {
    
    private String Name;
    private int Age;
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    public MainSystem(String Name, int Age) {
        setName(Name);
        setAge(Age);
    }  
}
