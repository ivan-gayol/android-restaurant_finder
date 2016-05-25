package com.andromeda.restaurantfinder;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.andromeda.restaurantfinder.applications.RestaurantFinderApplication;

public class ReviewCriteria extends Activity {
    private static final int MENU_GET_REVIEWS = Menu.FIRST;

    private Spinner cuisine;
    private Button grabReviews;
    private EditText location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_criteria);

        cuisine = (Spinner) findViewById(R.id.cuisine);
        location = (EditText)findViewById(R.id.location);
        grabReviews = (Button)findViewById(R.id.get_reviews_button);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.spinner_view,
                getResources().getStringArray(R.array.cuisines));

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        this.cuisine.setAdapter(arrayAdapter);

        this.grabReviews.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        handleGetReviews();
                    }
                }
        );
    }

    /**
     * Initialize the contents of the Activity's standard options menu.  You
     * should place your menu items in to <var>menu</var>.
     * <p/>
     * <p>This is only called once, the first time the options menu is
     * displayed.  To update the menu every time it is displayed, see
     * {@link #onPrepareOptionsMenu}.
     * <p/>
     * <p>The default implementation populates the menu with standard system
     * menu items.  These are placed in the {@link Menu#CATEGORY_SYSTEM} group so that
     * they will be correctly ordered with application-defined menu items.
     * Deriving classes should always call through to the base implementation.
     * <p/>
     * <p>You can safely hold on to <var>menu</var> (and any items created
     * from it), making modifications to it as desired, until the next
     * time onCreateOptionsMenu() is called.
     * <p/>
     * <p>When you add items to the menu, you can implement the Activity's
     * {@link #onOptionsItemSelected} method to handle them there.
     *
     * @param menu The options menu in which you place your items.
     * @return You must return true for the menu to be displayed;
     * if you return false it will not be shown.
     * @see #onPrepareOptionsMenu
     * @see #onOptionsItemSelected
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0,
                ReviewCriteria.MENU_GET_REVIEWS,
                0,
                R.string.menu_get_reviews).setIcon(R.drawable.ic_search_black_24dp);
        return true;
    }

    /**
     * Method in charge of the process of reviews
     */
    private void handleGetReviews (){

        RestaurantFinderApplication application = (RestaurantFinderApplication) getApplication();
        application.setReviewCriteriaCuisine(this.cuisine.getSelectedItem().toString());
        application.setReviewCriteriaLocation(location.toString());

    }
}
