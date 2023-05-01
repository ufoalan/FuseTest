package org.mycompany;

import org.apache.commons.lang3.ObjectUtils.Null;

public class Tweet {

    private String userName = "";
    private String userLocation = "";
    private long userFavouritesCount = 0;
    private long userFriendsCount = 0;
    private String text = "";
    private long retweetCount = 0;
    private long favoriteCount = 0;

    public Tweet() {}

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLocation() {
        return this.userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }
    
    public long getUserFavouritesCount() {
        return this.userFavouritesCount;
    }

    public void setUserFavouritesCount(long userFavouritesCount) {
        this.userFavouritesCount = userFavouritesCount;
    }
    
    public long getUserFriendsCount() {
        return this.userFriendsCount;
    }

    public void setUserFriendsCount(long userFriendsCount) {
        this.userFriendsCount = userFriendsCount;
    }
    
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public long getRetweetCount() {
        return this.retweetCount;
    }

    public void setRetweetCount(long retweetCount) {
        this.retweetCount = retweetCount;
    }
    
    public long getFavoriteCount() {
        return this.favoriteCount;
    }

    public void setFavoritesCount(long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }
    
}
