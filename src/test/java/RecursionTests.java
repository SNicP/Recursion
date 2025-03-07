import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RecursionTests {
    int[] startNumbers = { 21, 1, 20, 23 };
    int day = 0;

    @Nested
    public class compare {
        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsOne() {
            day = 1;
            String actual = Main.compare(day);
            String expected = "Iterative = " + 4 + " | Recursive = " + 4;
            Assertions.assertEquals(expected, actual);

            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsTwo() {
            day = 2;
            String actual = Main.compare(day);
            String expected = "Iterative = " + 1 + " | Recursive = " + 1;
            Assertions.assertEquals(expected, actual);

            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsFive() {
            day = 5;
            String actual = Main.compare(day);
            String expected = "Iterative = " + 8 + " | Recursive = " + 8;
            Assertions.assertEquals(expected, actual);

            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsFifteen() {
            day = 15;
            String actual = Main.compare(day);
            String expected = "Iterative = " + 2 + " | Recursive = " + 2;
            Assertions.assertEquals(expected, actual);

            assertThat(expected, equalTo(actual));
        }
    }

    @Nested
    public class chooseHobbyRecursive {
        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsOne() {
            day = 1;
            int actual = Main.chooseHobbyRecursive(startNumbers, day, new int[day + 4]);
            int expected = 4;
            Assertions.assertEquals(expected, actual);

            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsTwo() {
            day = 2;
            int actual = Main.chooseHobbyRecursive(startNumbers, day, new int[day + 4]);
            int expected = 1;
            Assertions.assertEquals(expected, actual);

            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsFive() {
            day = 5;
            int actual = Main.chooseHobbyRecursive(startNumbers, day, new int[day + 4]);
            int expected = 8;
            Assertions.assertEquals(expected, actual);

            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsFifteen() {
            day = 15;
            int actual = Main.chooseHobbyRecursive(startNumbers, day, new int[day + 4]);
            int expected = 2;
            Assertions.assertEquals(expected, actual);

            assertThat(expected, equalTo(actual));
        }
    }

    @Nested
    public class chooseHobbyIterative {
        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsOne() {
            day = 1;
            int actual = Main.chooseHobbyIterative(startNumbers, day);
            int expected = 4;
            Assertions.assertEquals(expected, actual);

            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsTwo() {
            day = 2;
            int actual = Main.chooseHobbyIterative(startNumbers, day);
            int expected = 1;
            Assertions.assertEquals(expected, actual);

            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsFive() {
            day = 5;
            int actual = Main.chooseHobbyIterative(startNumbers, day);
            int expected = 8;
            Assertions.assertEquals(expected, actual);

            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsFifteen() {
            day = 15;
            int actual = Main.chooseHobbyIterative(startNumbers, day);
            int expected = 2;
            Assertions.assertEquals(expected, actual);

            assertThat(expected, equalTo(actual));
        }
    }

}
