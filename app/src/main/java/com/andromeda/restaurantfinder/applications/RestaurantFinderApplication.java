package com.andromeda.restaurantfinder.applications;

import android.app.Application;

import com.andromeda.restaurantfinder.data.Review;

/**
 * Created by igayolfernan on 25/05/2016.
 */
public class RestaurantFinderApplication extends Application{

    private String reviewCriteriaCuisine;
    private String reviewCriteriaLocation;
    private Review review;

    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * This method is for use in emulated process environments.  It will
     * never be called on a production Android device, where processes are
     * removed by simply killing them; no user code (including this callback)
     * is executed when doing so.
     */
    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public String getReviewCriteriaCuisine() {
        return reviewCriteriaCuisine;
    }

    public void setReviewCriteriaCuisine(String reviewCriteriaCuisine) {
        this.reviewCriteriaCuisine = reviewCriteriaCuisine;
    }

    public String getReviewCriteriaLocation() {
        return reviewCriteriaLocation;
    }

    public void setReviewCriteriaLocation(String reviewCriteriaLocation) {
        this.reviewCriteriaLocation = reviewCriteriaLocation;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
