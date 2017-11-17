package cc.somkiat.basicunittesting;

import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void EmptyNameAndEmptyEmail(){
        onView(withId(R.id.userNameInput)).perform(scrollTo(), replaceText(""));
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText(""));
        onView(allOf(withId(R.id.saveButton))).perform(scrollTo(), click());
        onView(allOf(withId(R.id.revertButton))).perform(scrollTo(), click());
    }

    @Test
    public void SaveAndRevertNameAndEmailSuccessTest() {
        onView(withId(R.id.userNameInput)).perform(replaceText("nacha"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("aaa@gmail.com"), closeSoftKeyboard());
        onView(allOf(withId(R.id.saveButton), withText("Save"))).perform(scrollTo(), click());
        onView(allOf(withId(R.id.revertButton), withText("Revert"))).perform(scrollTo(),click());
    }
}
