package com.example.mycollections.models;

public class Music {
    private String artist;
    private String album;
    private String year;

    public Music(String artist, String album, String year) {
        this.artist = artist;
        this.album = album;
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
