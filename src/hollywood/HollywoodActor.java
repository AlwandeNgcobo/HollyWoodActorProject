/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hollywood;

/**
 *
 * @author Alwande Ngcobo
 */
public class HollywoodActor {
    
    private String name;
    private int age;
    private int noOFMovies;

    public HollywoodActor(String name, int age, int noOFMovies) {
        this.name = name;
        this.age = age;
        this.noOFMovies = noOFMovies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNoOFMovies() {
        return noOFMovies;
    }

    public void setNoOFMovies(int noOFMovies) {
        this.noOFMovies = noOFMovies;
    }
    
    public boolean isEligibleToWinAcademy(int age){
        if (age < 18) {
            System.out.println("Not eligible to win");
            return false;
        }
        else{
            System.out.println("Eligible to win");
            return true;
        }
    }
    
}
