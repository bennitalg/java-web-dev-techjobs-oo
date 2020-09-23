package Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


/*Define a test called testSettingJobId. Do not forget to annotate it with @Test.
Create two Job objects using the empty constructor.
Instead of creating the Job objects inside the test method, you could declare and initialize them using @Before.
 */
public class JobTests {
    private Job testJob1;
    private Job testJob2;
    private Job testJob3;
    private Job testJob4;
    private Job myTestJob;

    @Before
    public void creatingObjects(){
        testJob1 = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //System.out.println(testJob1.getId());
//        System.out.println(testJob2.getId());
    }
    @Test
    public void testSettingJobId() {
        assertEquals (testJob1.getId(), testJob2.getId()-1);
//        System.out.println(testJob1.getId());
//        System.out.println(testJob2.getId()-1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(testJob3.getName(),"Product tester");
        assertEquals(testJob3.getEmployer().toString(), "ACME");
        assertEquals(testJob3.getLocation().toString(), "Desert");
        assertEquals(testJob3.getPositionType().toString(), "Quality control");
        assertEquals(testJob3.getCoreCompetency().toString(), "Persistence");

    }

    @Test
    public void  testJobsForEquality(){
        assertFalse(testJob3.equals(testJob4));
//        System.out.println(testJob3.getId());
//        System.out.println(testJob4.getId());
    }

    @Test
    public void testToString(){
        myTestJob = new Job("IT Auditor", new Employer("First Bank"), new Location("Tampa"), new PositionType("Audit"), new CoreCompetency("Team Building"));
        System.out.println(myTestJob.toString());

    }

}
