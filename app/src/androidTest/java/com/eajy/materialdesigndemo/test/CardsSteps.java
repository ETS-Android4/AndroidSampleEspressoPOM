/*
 * Copyright (C) 2015 emmasuzuki <emma11suzuki@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH
 * THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.eajy.materialdesigndemo.test;

import android.app.Activity;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.EditText;

import com.eajy.materialdesigndemo.activity.MainActivity;

import org.hamcrest.Description;
import org.junit.Rule;
import org.junit.internal.matchers.TypeSafeMatcher;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.hasTextColor;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertNotNull;

public class CardsSteps {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    private Activity activity;

    @Before("@launchscreen")
    public void setup() {
        activityTestRule.launchActivity(new Intent());
        activity = activityTestRule.getActivity();
    }

    @After("@launchscreen")
    public void tearDown() {
        activityTestRule.finishActivity();
    }

    @Given("^User Launches App$")
    public void user_launches_app() {
        onView(withText("Cards")).check(matches(isDisplayed()));
    }

    @When("^User is on Home Screen")
    public void user_is_on_home_screen() {
       onView(withText("Cards")).check(matches(isDisplayed()));
    }

    @Then("^Verify Cards title presence$")
    public void verify_cards_title_presence() {
        onView(withText("Cards")).check(matches(isDisplayed()));
    }

    @Then("^Verify Dialogs presence and click$")
    public void verify_dialogs_presence_and_click() {
        onView(withText("Dialogs")).perform(click()).check(matches(isDisplayed()));
    }

    @Then("^Verify Widgets presence and click$")
    public void verify_widgets_presence_and_click() {
        onView(withText("Widgets")).perform(click()).check(matches(isDisplayed()));
    }

    @Then("^Verify presence of Menu and click$")
    public void verify_presence_of_Menu_and_click() {
        onView(withContentDescription("Open navigation drawer")).check(matches(isDisplayed()));
        onView(withContentDescription("Open navigation drawer")).perform(click());
    }

    @And("^Verify presence of Bottom Navigation and click$")
    public void verify_presence_of_bottom_navigation_and_click() {
        onView(withText("Bottom Navigation")).check(matches(isDisplayed()));
        onView(withText("Bottom Navigation")).perform(click());
    }

    @Then("^Verify Blue bottom navigation presence$")
    public void verify_blue_bottom_navigation_presence() {
        onView(withText("Bottom Navigation")).check(matches(isDisplayed()));
        onView(withContentDescription("Blue")).check(matches(isEnabled()));
        onView(withContentDescription("Green")).perform(click());
        onView(withContentDescription("Green")).check(matches(isEnabled()));
        onView(withContentDescription("Yellow")).perform(click());
        onView(withContentDescription("Yellow")).check(matches(isEnabled()));
        onView(withContentDescription("Red")).perform(click());
        onView(withContentDescription("Red")).check(matches(isEnabled()));
    }

    @Then("^Verify Green bottom navigation presence and click$")
    public void verify_green_bottom_navigation_presence() {
        onView(withContentDescription("Green")).perform(click());
        onView(withContentDescription("Green")).check(matches(isEnabled()));
    }

    @Then("^Verify Yellow bottom navigation presence and click$")
    public void verify_yellow_bottom_navigation_presence() {
        onView(withContentDescription("Yellow")).perform(click());
        onView(withContentDescription("Yellow")).check(matches(isEnabled()));
    }

    @Then("^Verify Red bottom navigation presence and click$")
    public void verify_red_bottom_navigation_presence() {
        onView(withContentDescription("Red")).perform(click());
        onView(withContentDescription("Red")).check(matches(isEnabled()));
    }

    @And("^Verify  presence of About and click$")
    public void verify_presence_of_about_and_click() {
        onView(withText("About")).check(matches(isDisplayed()));
        onView(withText("About")).perform(click());
    }

    @Then("^Verify Back button on About Screen$")
    public void verify_back_button_on_about_screen() {
        onView(withContentDescription("Navigate up")).check(matches(isDisplayed()));
        onView(withContentDescription("Navigate up")).perform(click());
    }

    @And("^Verify  presence of My Apps and click$")
    public void verify_presence_of_my_apps_and_click() {
        onView(withText("My Apps")).check(matches(isDisplayed()));
        onView(withText("My Apps")).perform(click());
    }

    @Then("^Verify Back button on My Apps Screen$")
    public void verify_back_button_on_my_apps_screen() {
        onView(withContentDescription("Navigate up")).check(matches(isDisplayed()));
        onView(withContentDescription("Navigate up")).perform(click());
    }

    @Then("^Click back button$")
    public void click_back_button() {
        onView(withContentDescription("Navigate up")).check(matches(isDisplayed()));
        onView(withContentDescription("Navigate up")).perform(click());
    }

    @And("^Verify presence of Recycler view and click$")
    public void verify_presence_of_recycler_view_and_click() {
        onView(withText("Recycler View")).check(matches(isDisplayed()));
        onView(withText("Recycler View")).perform(click());
    }

    @Then("^Verify clicking Add button on bottom of screen")
    public void verify_clicking_add_button_on_bottom_of_screen() {
        onView(withId(Integer.parseInt("fab_recycler_view"))).check(matches(isDisplayed()));
        onView(withId(Integer.parseInt("fab_recycler_view"))).perform(click());

    }

    @Then("^Verify Back button on Recycler view Screen")
    public void verify_back_button_on_recycler_view_screen() {
        onView(withContentDescription("Navigate up")).check(matches(isDisplayed()));
        onView(withContentDescription("Navigate up")).perform(click());
    }



//    @Given("^I am on login screen")
//    public void I_am_on_login_screen() {
//        assertNotNull(activity);
//    }
//
//    @When("^I input email (\\S+)$")
//    public void I_input_email(final String email) {
//        onView(withId(R.id.email)).perform(typeText(email));
//    }
//
//    @When("^I input password \"(.*?)\"$")
//    public void I_input_password(final String password) {
//        onView(withId(R.id.password)).perform(typeText(password), closeSoftKeyboard());
//    }
//
//    @When("^I press submit button$")
//    public void I_press_submit_button() {
//        onView(withId(R.id.submit)).perform(click());
//    }
//
//    @When("^I tap sign up button$")
//    public void I_tap_sign_up_button() {
//        onView(withId(R.id.signup)).perform(click());
//    }
//
//    @Then("^I should see error on the (\\S+)$")
//    public void I_should_see_error_on_the_editTextView(final String viewName) {
//        int viewId = (viewName.equals("email")) ? R.id.email : R.id.password;
//        int messageId = (viewName.equals("email")) ? R.string.msg_email_error : R.string.msg_password_error;
//
//        onView(withId(viewId)).check(matches(hasErrorText(activity.getString(messageId))));
//    }
//
//    @Then("^I should (true|false) auth error$")
//    public void I_should_see_auth_error(boolean shouldSeeError) {
//        if (shouldSeeError) {
//            onView(withId(R.id.error)).check(matches(isDisplayed()));
//        } else {
//            onView(withId(R.id.error)).check(matches(not(isDisplayed())));
//        }
//    }
//
//    @Then("^I should see sign up screen$")
//    public void I_should_see_sign_up_screen() {
//        onView(withId(R.id.page_title)).check(matches(withText(R.string.signup)));
//    }
//
//    private static Matcher<? super View> hasErrorText(String expectedError) {
//        return new ErrorTextMatcher(expectedError);
//    }

    /**
     * Custom matcher to assert equal EditText.setError();
     */
    private static class ErrorTextMatcher extends TypeSafeMatcher<View> {

        private final String mExpectedError;

        private ErrorTextMatcher(String expectedError) {
            mExpectedError = expectedError;
        }

        @Override
        public boolean matchesSafely(View view) {
            if (!(view instanceof EditText)) {
                return false;
            }

            EditText editText = (EditText) view;

            return mExpectedError.equals(editText.getError().toString());
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("with error: " + mExpectedError);
        }
    }
    
}
