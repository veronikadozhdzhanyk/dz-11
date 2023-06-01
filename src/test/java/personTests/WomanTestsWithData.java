package personTests;

import com.software.person.Man;
import com.software.person.Woman;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WomanTestsWithData {

    @Test(dataProvider = "womanData")
    public void testIsRetired(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
        Woman woman = new Woman(firstName, lastName, age, weight, height);
        Assert.assertEquals(woman.isRetired(), expectedRetired);
    }

    @Test(dataProvider = "partnershipData")
    public void testRegisterPartnership(String womanFirstName, String womanLastName, int womanAge, int womanWeight, int womanHeight,
                                        String manFirstName, String manLastName, int manAge, int manWeight, int manHeight,
                                        String expectedLastName) {
        Woman woman = new Woman(womanFirstName, womanLastName, womanAge, womanWeight, womanHeight);
        Man man = new Man(manFirstName, manLastName, manAge, manWeight, manHeight);
        woman.registerPartnership(man);

        Assert.assertEquals(woman.getLastName(), expectedLastName);
    }

    @Test(dataProvider = "partnershipData")
    public void testDeregisterPartnership(String womanFirstName, String womanLastName, int womanAge, int womanWeight, int womanHeight,
                                          String manFirstName, String manLastName, int manAge, int manWeight, int manHeight,
                                          String expectedLastName) {
        Woman woman = new Woman(womanFirstName, womanLastName, womanAge, womanWeight, womanHeight);
        Man man = new Man(manFirstName, manLastName, manAge, manWeight, manHeight);
        woman.registerPartnership(man);
        woman.deregisterPartnership(true);

        Assert.assertEquals(woman.getLastName(), woman.getPreviousLastName());
    }

    @DataProvider(name = "womanData")
    public Object[][] provideWomanData() {
        return new Object[][] {
                {"Olga", "Danyluk", 66, 62, 168, true},
        };
    }

    @DataProvider(name = "partnershipData")
    public Object[][] providePartnershipData() {
        return new Object[][] {
                {"Olga", "Danyluk", 66, 62, 168, "Oleg", "Prutyla", 66, 75, 185, "Prutyla"},
        };
    }
    public static class GettersSettersTests {
        @Test
        public void testGetFirstName() {
            Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
            Assert.assertEquals(woman.getFirstName(), "Olga");
        }

        @Test
        public void testGetLastName() {
            Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
            Assert.assertEquals(woman.getLastName(), "Danyluk");
        }

        @Test
        public void testGetAge() {
            Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
            Assert.assertEquals(woman.getAge(), 66);
        }

        @Test
        public void testGetWeight() {
            Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
            Assert.assertEquals(woman.getWeight(), 62);
        }

        @Test
        public void testGetHeight() {
            Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
            Assert.assertEquals(woman.getHeight(), 168);
        }

        @Test
        public void testSetFirstName() {
            Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
            woman.setFirstName("Anna");
            Assert.assertEquals(woman.getFirstName(), "Anna");
        }

        @Test
        public void testSetLastName() {
            Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
            woman.setLastName("Kosaka");
            Assert.assertEquals(woman.getLastName(), "Kosaka");
        }
        @Test
        public void testSetAge() {
            Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
            woman.setAge(75);
            Assert.assertEquals(woman.getAge(), 75);
        }

        @Test
        public void testSetWeight() {
            Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
            woman.setWeight(63);
            Assert.assertEquals(woman.getWeight(), 63);
        }

        @Test
        public void testSetHeight() {
            Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
            woman.setHeight(170);
            Assert.assertEquals(woman.getHeight(), 170);
        }
    }
}

