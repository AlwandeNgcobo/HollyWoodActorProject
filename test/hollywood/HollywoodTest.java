/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package hollywood;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alwande Ngcobo
 */
public class HollywoodTest {
    
    public HollywoodTest() {
    }

    @Test
    public void testMain() {
    }
    @Test
    public void testIsItWillSmith(){
        HollywoodActor actor = new HollywoodActor("Will Smith",50,100);
        String WillSmith = "Will Smith";
        boolean isNotWillSmith = false;
        boolean isWillSmith = true;
        if (WillSmith.equals(actor.getName())) {
            assertTrue(isWillSmith);
        }
        else{
            assertTrue(isNotWillSmith);
        }
        
        
    }
    @Test
    public void isAbleToWin(){
        HollywoodActor actor = new HollywoodActor("Will Smith",50,100);
        boolean isEligibleToWin = true;
        boolean isHEEligibleToWin = actor.isEligibleToWinAcademy(50);
        assertTrue(isHEEligibleToWin);
    }
    
    //You cant have a capital letter
    
   
}

