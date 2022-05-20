package com.example.babycareco225;



import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.assertNotNull;

import android.app.Activity;
import android.app.Instrumentation;

import androidx.test.internal.runner.InstrumentationConnection;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActicityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity=null;
    Instrumentation.ActivityMonitor monitor=getInstrumentation().addMonitor(VaccinationActivity.class.getName(),null,false);



    @Before
    public void setUp() throws Exception {
        mActivity=mActicityTestRule.getActivity();
    }
@Test
public void testbtnSchedule(){
        assertNotNull(mActivity.findViewById(R.id.btnSchedule));
        onView(withId(R.id.btnSchedule)).perform(click());
       Activity vaccinationActivity = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);
assertNotNull(vaccinationActivity);
vaccinationActivity.finish();




}
    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }
}