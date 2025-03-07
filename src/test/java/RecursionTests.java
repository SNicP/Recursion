import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RecursionTests {
    //given
    int[] startNumbers = { 21, 1, 20, 23 };
    int day = 0;

    @Nested
    public class compare {
        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsOne() {
            //given
            day = 1;

            //when
            String actual = Main.compare(day);
            String expected = "Iterative = " + 4 + " | Recursive = " + 4;

            //then
            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsTwo() {
            //given
            day = 2;

            //when
            String actual = Main.compare(day);
            String expected = "Iterative = " + 1 + " | Recursive = " + 1;

            //then
            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsFive() {
            //given
            day = 5;

            //when
            String actual = Main.compare(day);
            String expected = "Iterative = " + 8 + " | Recursive = " + 8;

            //then
            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsFifteen() {
            //given
            day = 15;

            //when
            String actual = Main.compare(day);
            String expected = "Iterative = " + 2 + " | Recursive = " + 2;

            //then
            assertThat(expected, equalTo(actual));
        }
    }

    @Nested
    public class chooseHobbyRecursive {
        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsOne() {
            //given
            day = 1;

            //when
            int actual = Main.chooseHobbyRecursive(startNumbers, day, new int[day + 4]);
            int expected = 4;

            //then
            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsTwo() {
            //given
            day = 2;

            //when
            int actual = Main.chooseHobbyRecursive(startNumbers, day, new int[day + 4]);
            int expected = 1;

            //then
            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsFive() {
            //given
            day = 5;

            //when
            int actual = Main.chooseHobbyRecursive(startNumbers, day, new int[day + 4]);
            int expected = 8;

            //then
            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsFifteen() {
            //given
            day = 15;

            //when
            int actual = Main.chooseHobbyRecursive(startNumbers, day, new int[day + 4]);
            int expected = 2;

            //then
            assertThat(expected, equalTo(actual));
        }
    }

    @Nested
    public class chooseHobbyIterative {
        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsOne() {
            //given
            day = 1;

            //when
            int actual = Main.chooseHobbyIterative(startNumbers, day);
            int expected = 4;

            //then
            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsTwo() {
            //given
            day = 2;

            //when
            int actual = Main.chooseHobbyIterative(startNumbers, day);
            int expected = 1;

            //then
            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsFive() {
            //given
            day = 5;

            //when
            int actual = Main.chooseHobbyIterative(startNumbers, day);
            int expected = 8;

            //then
            assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnHobbyNumberWhenIncomingNumberIsFifteen() {
            //given
            day = 15;

            //when
            int actual = Main.chooseHobbyIterative(startNumbers, day);
            int expected = 2;

            //then
            assertThat(expected, equalTo(actual));
        }
    }

}
