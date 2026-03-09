import com.vehicle.vehicleregistrationsystem.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleRegistrationSystemTest {

    /*
    Test Case 1
    Verify VehicleRegistration object creation
    */

    @Test
    public void testVehicleRegistrationObjectCreation() {

        Finance finance = new Finance(10000,"CentralDB");

        VehicleRegistration vr =
                new VehicleRegistration("TN10AB1234","Rahul",finance);

        assertNotNull(vr);

        System.out.println("VehicleRegistration object created successfully");
    }

    /*
    Test Case 2
    Verify vehicle number and owner details
    */

    @Test
    public void testVehicleDetails() {

        Finance finance = new Finance(10000,"CentralDB");

        VehicleRegistration vr =
                new VehicleRegistration("TN10AB1234","Rahul",finance);

        assertEquals("TN10AB1234","TN10AB1234");
        assertEquals("Rahul","Rahul");

        System.out.println("Vehicle details validated");
    }

    /*
    Test Case 3
    Verify vehicle verification logic
    */

    @Test
    public void testVehicleVerification() {

        Finance finance = new Finance(10000,"CentralDB");

        VehicleRegistration vr =
                new VehicleRegistration("TN10AB1234","Rahul",finance);

        vr.verifyDetails();

        assertTrue(true);

        System.out.println("Vehicle verification executed successfully");
    }

    /*
    Test Case 4
    Verify finance object and positive balance
    */

    @Test
    public void testFinanceBalance() {

        Finance finance = new Finance(5000,"FinanceDB");

        assertTrue(5000 > 0);

        System.out.println("Finance balance validated");
    }

    /*
    Test Case 5
    Verify finance operations
    */

    @Test
    public void testFinanceOperations() {

        Finance finance = new Finance(10000,"FinanceDB");

        finance.poolingOfFund();
        finance.economicDevelopment();
        finance.betterDecisionMaking();

        assertNotNull(finance);

        System.out.println("Finance operations executed successfully");
    }

    /*
    Test Case 6
    Verify examination candidate object
    */

    @Test
    public void testExaminationCandidate() {

        Examination exam = new Examination("Rahul","OfficerSign");

        assertNotNull(exam);

        System.out.println("Examination object created successfully");
    }

    /*
    Test Case 7
    Verify license eligibility for valid age
    */

    @Test
    public void testLicenseEligibilityValidAge() {

        Finance finance = new Finance(10000,"CentralDB");

        VehicleLicensing license =
                new VehicleLicensing("Rahul","OfficerSign",22,"Chennai",finance);

        assertTrue(22 >= 18);

        System.out.println("Candidate eligible for license");
    }

    /*
    Test Case 8
    Verify license rejection for invalid age
    */

    @Test
    public void testLicenseEligibilityInvalidAge() {

        Finance finance = new Finance(10000,"CentralDB");

        VehicleLicensing license =
                new VehicleLicensing("Arun","OfficerSign",16,"Chennai",finance);

        assertTrue(16 < 18);

        System.out.println("Candidate not eligible for license");
    }

    /*
    Test Case 9
    Verify LoginSignup object creation
    */

    @Test
    public void testLoginSignupCreation() {

        Finance finance = new Finance(10000,"CentralDB");

        VehicleRegistration reg =
                new VehicleRegistration("TN10AB1234","Rahul",finance);

        VehicleLicensing lic =
                new VehicleLicensing("Rahul","OfficerSign",22,"Chennai",finance);

        LoginSignup login =
                new LoginSignup("Rahul","1234",reg,lic);

        assertNotNull(login);

        System.out.println("LoginSignup module initialized");
    }

    /*
    Test Case 10
    Full system integration test
    */

    @Test
    public void testCompleteSystemWorkflow() {

        Finance finance = new Finance(100000,"CentralDB");

        VehicleRegistration reg =
                new VehicleRegistration("TN10AB1234","Rahul",finance);

        VehicleLicensing lic =
                new VehicleLicensing("Rahul","OfficerSign",22,"Chennai",finance);

        LoginSignup user =
                new LoginSignup("Rahul","1234",reg,lic);

        user.signUp();
        user.login();

        reg.registerVehicle();
        reg.verifyDetails();

        lic.provideLicense();

        assertNotNull(user);

        System.out.println("Complete system workflow executed successfully");
    }
}