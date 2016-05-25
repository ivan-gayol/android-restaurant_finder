package com.andromeda.restaurantfinder.data;

import java.util.Date;

/**
 * Simple data bean to represent a Review - no getters and setters on purpose
 * (more efficient on Android).
 */
public class Review {

    public String author;
    public String content;
    public String cuisine;
    public Date date;
    public String imageLink ;
    public String link;
    public String location;
    public String name;
    public String phone;
    public String rating;

    /**
     * Returns a string containing a concise, human-readable description of this
     * object. Subclasses are encouraged to override this method and provide an
     * implementation that takes into account the object's type and data. The
     * default implementation is equivalent to the following expression:
     * <pre>
     *   getClass().getName() + '@' + Integer.toHexString(hashCode())</pre>
     * <p>See <a href="{@docRoot}reference/java/lang/Object.html#writing_toString">Writing a useful
     * {@code toString} method</a>
     * if you intend implementing your own {@code toString} method.
     *
     * @return a printable representation of this object.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Review\n");
        sb.append("name: " + name + "\n");
        sb.append("content: " + content + "\n");
        sb.append("cuisine: " + cuisine + "\n");
        sb.append("date: " + date + "\n");
        sb.append("imageLink: " + imageLink + "\n");
        sb.append("link: " + link + "\n");
        sb.append("location: " + location + "\n");
        sb.append("name: " + name + "\n");
        sb.append("phone: " + phone + "\n");
        sb.append("rating: " + rating + "\n");
        return sb.toString();
    }
}
