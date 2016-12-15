package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testEndpointsAsyncTaskResultNotEmpty() {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(mainActivityActivityTestRule.getActivity());
        endpointsAsyncTask.execute();
        try {
            assertTrue(!TextUtils.isEmpty(endpointsAsyncTask.get()));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
