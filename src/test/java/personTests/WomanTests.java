package personTests;
import com.software.person.Man;
import com.software.person.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTests {

    @Test
    public void testIsRetired() {
        Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
        Assert.assertTrue(woman.isRetired());

    }
    @Test
    public void testRegisterPartnership() {
        Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
        Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
        woman.registerPartnership(man);

        Assert.assertEquals(woman.getLastName(), "Prutyla");
    }
    @Test
    public void testDeregisterPartnership() {
        Man man = new Man("Oleg", "Prutyla", 66, 75, 185);
        Woman woman = new Woman("Olga", "Danyluk", 66, 62, 168);
        woman.registerPartnership(man);
        woman.deregisterPartnership(true);

        Assert.assertEquals(woman.getLastName(), woman.getPreviousLastName());
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