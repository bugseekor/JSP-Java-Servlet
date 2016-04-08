/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.business;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author spark1435
 */
public class MemberTest {
    
    public MemberTest() {
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
     * Test of getFullName method, of class Member.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Member instance = new Member();
        String expResult = "fullName";
        instance.setFullName("fullName");
        String result = instance.getFullName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFullName method, of class Member.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "fullName";
        Member instance = new Member();
        instance.setFullName(fullName);
        assertEquals(fullName, instance.getFullName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailAddress method, of class Member.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        Member instance = new Member();
        String expResult = "abc@def.com";
        instance.setEmailAddress(expResult);
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailAddress method, of class Member.
     */
    @Test
    public void testSetEmailAddress() {
        System.out.println("setEmailAddress");
        String emailAddress = "abc@def.com";
        Member instance = new Member();
        instance.setEmailAddress(emailAddress);
        assertEquals(emailAddress, instance.getEmailAddress());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class Member.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Member instance = new Member();
        String expResult = "1234567890";
        instance.setPhoneNumber(expResult);
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class Member.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "1234560987";
        Member instance = new Member();
        instance.setPhoneNumber(phoneNumber);
        assertEquals(phoneNumber, instance.getPhoneNumber());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getProgramName method, of class Member.
     */
    @Test
    public void testGetProgramName() {
        System.out.println("getProgramName");
        Member instance = new Member();
        String expResult = "program";
        instance.setProgramName(expResult);
        String result = instance.getProgramName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setProgramName method, of class Member.
     */
    @Test
    public void testSetProgramName() {
        System.out.println("setProgramName");
        String programName = "prog";
        Member instance = new Member();
        instance.setProgramName(programName);
        assertEquals(programName, instance.getProgramName());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getYearLevel method, of class Member.
     */
    @Test
    public void testGetYearLevel() {
        System.out.println("getYearLevel");
        Member instance = new Member();
        int expResult = 1;
        instance.setYearLevel(expResult);
        int result = instance.getYearLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setYearLevel method, of class Member.
     */
    @Test
    public void testSetYearLevel() {
        System.out.println("setYearLevel");
        int yearLevel = 2;
        Member instance = new Member();
        instance.setYearLevel(yearLevel);
        assertEquals(yearLevel, instance.getYearLevel());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class Member.
     */
    @Test
    public void testIsValidNegative() {
        System.out.println("isValid");
        Member instance = new Member();
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testIsValidPositive() {
        System.out.println("isValid");
        Member instance = new Member("fullName", "email.email.com");
        boolean expResult = true;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
