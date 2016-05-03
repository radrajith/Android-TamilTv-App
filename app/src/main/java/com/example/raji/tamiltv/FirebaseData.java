package com.example.raji.tamiltv;

/**
 * Created by radra_000 on 5/2/2016.
 */
public class FirebaseData {
        String channel;
        String name;
        String url;
        public FirebaseData() {
            // empty default constructor, necessary for Firebase to be able to deserialize blog posts
        }
        public String getChannel() {
            return channel;
        }
        public String getName() {
            return name;
        }
        public String getUrl() {
            return url;
        }
}

