package com.thomaskioko.moviemaniac.util;

/**
 * @author Thomas Kioko
 */


public class ApplicationConstants {

    /**
     * Set to true to Enable Debugging in the API false to disable. This should be false when
     * releasing the app.
     */
    public static final boolean DEBUG = false;
    /**
     * API Endpoint
     */
    public static final String END_POINT = "http://api.themoviedb.org/3/movie/";
    /**
     * TMDB API
     * To get one {@see href="https://www.themoviedb.org/account/signup"}
     */
    public static final String TMDB_API_KEY = "PUT_API_KEY_HERE";
    /**
     * Image base Url
     */
    public static final String TMDB_IMAGE_URL = "http://image.tmdb.org/t/p/";
    /**
     * 185 Image size
     */
    public static final String IMAGE_SIZE_185 = "w185";
    /**
     * 780 Image size
     */
    public static final String IMAGE_SIZE_780 = "w780";
    /**
     * Original Image size
     */
    public static final String IMAGE_SIZE_ORIGINAL = "original";
    /**
     * Connection timeout duration
     */
    public static final int CONNECT_TIMEOUT = 60 * 1000;
    /**
     * Connection Read timeout duration
     */
    public static final int READ_TIMEOUT = 60 * 1000;
    /**
     * Connection write timeout duration
     */
    public static final int WRITE_TIMEOUT = 60 * 1000;
}
