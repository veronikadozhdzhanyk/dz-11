package personTests;
import com.software.person.Man;
import com.software.person.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTests {

    @Test
    public void testIsRetired() {
        Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
        Assert.assertTrue(man.isRetired());
    }
    @Test
    public void testRegisterPartnership() {
        Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
        Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);

        man.registerPartnership(woman);

        Assert.assertEquals(woman.getLastName(), "Prutyla");
    }
    @Test
    public void testDeregisterPartnership() {
        Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
        Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
        man.registerPartnership(woman);
        man.deregisterPartnership(true);

        Assert.assertEquals(woman.getLastName(), woman.getPreviousLastName());
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


