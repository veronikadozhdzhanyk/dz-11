package personTests;

import com.software.person.Man;
import com.software.person.Woman;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ManTestsWithData {

    @Test(dataProvider = "manData")
    public void testIsRetired(String firstName, String lastName, int age, int weight, int height, boolean expectedRetired) {
        Man man = new Man(firstName, lastName, age, weight, height);
        Assert.assertEquals(man.isRetired(), expectedRetired);
    }

    @Test(dataProvider = "partnershipData")
    public void testRegisterPartnership(String manFirstName, String manLastName, int manAge, int manWeight, int manHeight,
                                        String womanFirstName, String womanLastName, int womanAge, int womanWeight, int womanHeight,
                                        String expectedLastName) {
        Man man = new Man(manFirstName, manLastName, manAge, manWeight, manHeight);
        Woman woman = new Woman(womanFirstName, womanLastName, womanAge, womanWeight, womanHeight);

        man.registerPartnership(woman);

        Assert.assertEquals(woman.getLastName(), expectedLastName);
    }

    @Test(dataProvider = "partnershipData")
    public void testDeregisterPartnership(String manFirstName, String manLastName, int manAge, int manWeight, int manHeight,
                                          String womanFirstName, String womanLastName, int womanAge, int womanWeight, int womanHeight,
                                          String expectedLastName) {
        Man man = new Man(manFirstName, manLastName, manAge, manWeight, manHeight);
        Woman woman = new Woman(womanFirstName, womanLastName, womanAge, womanWeight, womanHeight);
        man.registerPartnership(woman);
        man.deregisterPartnership(true);

        Assert.assertEquals(woman.getLastName(), woman.getPreviousLastName());
    }

    @DataProvider(name = "manData")
    public Object[][] provideManData() {
        return new Object[][]{
                {"Oleg", "Prutyla", 66, 75, 185, true},
        };
    }

    @DataProvider(name = "partnershipData")
    public Object[][] providePartnershipData() {
        return new Object[][]{
                {"Oleg", "Prutyla", 66, 75, 185, "Olga", "Danyluk", 66, 62, 168, "Prutyla"},
        };
    }
    public static class GettersSettersTests {
        @Test
        public void testGetFirstName() {
            Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
            Assert.assertEquals(man.getFirstName(), "Oleg");
        }

        @Test
        public void testGetLastName() {
            Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
            Assert.assertEquals(man.getLastName(), "Prutyla");
        }

        @Test
        public void testGetAge() {
            Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
            Assert.assertEquals(man.getAge(), 66);
        }

        @Test
        public void testGetWeight() {
            Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
            Assert.assertEquals(man.getWeight(), 75);
        }

        @Test
        public void testGetHeight() {
            Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
            Assert.assertEquals(man.getHeight(), 185);
        }
        @Test
        public void testSetFirstName() {
            Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
            man.setFirstName("Ivan");
            Assert.assertEquals(man.getFirstName(), "Ivan");
        }

        @Test
        public void testSetLastName() {
            Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
            man.setLastName("Kos");
            Assert.assertEquals(man.getLastName(), "Kos");
        }
        @Test
        public void testSetAge() {
            Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
            man.setAge(78);
            Assert.assertEquals(man.getAge(), 78);
        }

        @Test
        public void testSetWeight() {
            Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
            man.setWeight(67);
            Assert.assertEquals(man.getWeight(), 67);
        }

        @Test
        public void testSetHeight() {
            Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
            man.setHeight(173);
            Assert.assertEquals(man.getHeight(), 173);
        }
    }
}

