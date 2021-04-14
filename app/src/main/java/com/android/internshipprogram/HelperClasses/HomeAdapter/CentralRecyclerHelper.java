package com.android.internshipprogram.HelperClasses.HomeAdapter;

public class CentralRecyclerHelper {
    int image;
    String description,heading;

    public CentralRecyclerHelper(int image, String description, String heading) {
        this.image = image;
        this.description = description;
        this.heading = heading;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getHeading() {
        return heading;
    }
}
