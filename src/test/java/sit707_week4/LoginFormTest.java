package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "Dhruv Kaswala";
		Assert.assertNotNull("Student ID", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "S223676061";
		Assert.assertNotNull("Student name", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	  @Test
	    public void testFailEmptyUsernameAndWrongPasswordAndDontCareValCode() {
	        // Test case for empty username, wrong password, and don't care validation code
	        LoginStatus status = LoginForm.login(null, "ahsan");
	        Assert.assertFalse(status.isLoginSuccess()); // Assert that login should fail
	    }
	    
	    @Test
	    public void testFailEmptyUsernameAndCorrectPasswordAndDontCareValCode() {
	        // Test case for empty username, correct password, and don't care validation code
	        LoginStatus status = LoginForm.login(null, "ahsan_pass");
	        Assert.assertFalse(status.isLoginSuccess()); // Assert that login should fail
	    }
	    
	    @Test
	    public void testFailWrongUsernameAndEmptyPasswordAndDontCareValCode() {
	        // Test case for wrong username, empty password, and don't care validation code
	        LoginStatus status = LoginForm.login("ahsan1", null);
	        Assert.assertFalse(status.isLoginSuccess()); // Assert that login should fail
	    }
	    
	    @Test
	    public void testFailWrongUsernameAndWrongPasswordAndDontCareValCode() {
	        // Test case for wrong username, wrong password, and don't care validation code
	        LoginStatus status = LoginForm.login("ahsan1", "ahsan1");
	        Assert.assertFalse(status.isLoginSuccess()); // Assert that login should fail
	    }
	    
	    @Test
	    public void testFailWrongUsernameAndCorrectPasswordAndDontCareValCode() {
	        // Test case for wrong username, correct password, and don't care validation code
	        LoginStatus status = LoginForm.login("ahsan1", "ahsan_pass");
	        Assert.assertFalse(status.isLoginSuccess()); // Assert that login should fail
	    }
	    
	    @Test
	    public void testFailCorrectUsernameAndEmptyPasswordAndDontCareValCode() {
	        // Test case for correct username, empty password, and don't care validation code
	        LoginStatus status = LoginForm.login("ahsan", null);
	        Assert.assertFalse(status.isLoginSuccess()); // Assert that login should fail
	    }
	    
	    @Test
	    public void testFailCorrectUsernameAndWrongPasswordAndDontCareValCode() {
	        // Test case for correct username, wrong password, and don't care validation code
	        LoginStatus status = LoginForm.login("ahsan", "ahsan");
	        Assert.assertFalse(status.isLoginSuccess()); // Assert that login should fail
	    }
	    
	    @Test
	    public void testSuccessCorrectUsernameAndCorrectPasswordAndDontCareValCode() {
	        // Test case for correct username, correct password, and don't care validation code
	        LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
	        Assert.assertTrue(status.isLoginSuccess()); // Assert that login should succeed
	    }
	    
	    @Test
	    public void testSuccessCorrectUsernameAndCorrectPasswordAndInValidLogin() {
	        // Test case for correct username, correct password
	        LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
	        Assert.assertTrue(status.isLoginSuccess()); // Assert that login should fail
	    }
	    
	    @Test
	    public void testSuccessCorrectUsernameAndCorrectPasswordAndValidLogin() {
	        // Test case for correct username, correct password
	        LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
	        Assert.assertTrue(status.isLoginSuccess()); // Assert that login should succeed
	    }
	
	
}
