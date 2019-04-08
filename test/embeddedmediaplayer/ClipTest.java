/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package embeddedmediaplayer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class ClipTest {
    
    private Clip _clip;
    
    public ClipTest() {
        _clip = new Clip();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class Clip.
     */
    @Test
    public void testSetTitleToEmptyStringKeepsPreviousValue()
    {
        String expectedTitle = "This is a title";
        _clip.setTitle(expectedTitle);
        _clip.setTitle("");
        _clip.setTitle(null);
        assertEquals(expectedTitle, _clip.getTitle());
    }

    @Test
    public void testSetEndBeforeStartKeepsPreviousValue()
    {
        _clip.setStart(2);
        _clip.setEnd(1);
        assertFalse(_clip.getEnd() == 1);
        _clip.setEnd(3);
        assertTrue(_clip.getEnd() == 3);
    }

    @Test
    public void testEqualsOnEqualClips() 
    {
        Clip clip1 = new Clip();
        Clip clip2 = new Clip();
        
        String title = "Same title";
        int endValue = 3;
        int startValue = 2;
        
        clip1.setTitle(title);
        clip2.setTitle(title);
        
        clip1.setEnd(endValue);
        clip2.setEnd(endValue);
        
        clip1.setStart(startValue);
        clip2.setStart(startValue);
        
        assertTrue(clip1.equals(clip2));
    }
    
    @Test
    public void testEqualsOnNonEqualClips() 
    {
    }
    
    @Test
    public void testSetEndToNegativeNumberKeepsPreviousValue() 
    {
    }
    
    @Test
    public void testSetStartToValidPositiveNumber() 
    {    
    }
    
    
    
}
