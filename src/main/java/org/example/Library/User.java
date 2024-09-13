package org.example.Library;

import java.util.*;

public class User {
    private UUID id;
    private String userName;
    private String password;
    private HashMap<String, Comic> comicHashMap = new HashMap<>();
    private HashMap<String, Magazine> magazineHashMap = new HashMap<>();
    private HashMap<String, DVD> dvdHashMap = new HashMap<>();

    User(String userName, String password) {
        this.id = UUID.randomUUID();
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public UUID getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Boolean authentication(String password) {
        return Objects.equals(password, this.password);
    }

    public boolean addComic(Comic comic) {
        try {
            if (this.comicHashMap.containsKey(comic.getId().toString()))
                return false;
            this.comicHashMap.put(comic.getId().toString(), comic);
            return true;
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            return false;
        }
    }

    public boolean addMagazine(Magazine magazine) {
        try {
            if (this.magazineHashMap.containsKey(magazine.getId().toString()))
                return false;
            this.magazineHashMap.put(magazine.getId().toString(), magazine);
            return true;
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            return false;
        }
    }

    public boolean addDVD(DVD dvd) {
        try {
            if (this.dvdHashMap.containsKey(dvd.getId().toString()))
                return false;
            this.dvdHashMap.put(dvd.getId().toString(), dvd);
            return true;
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            return false;
        }
    }

    public boolean removeComic(String id) {
        try {
            this.comicHashMap.remove(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeMagazine(String id) {
        try {
            this.magazineHashMap.remove(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeDVD(String id) {
        try {
            this.dvdHashMap.remove(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public HashMap<String, Comic> getComicHashMap() {
        return this.comicHashMap;
    }

    public HashMap<String, Magazine> getMagazineHashMap() {
        return this.magazineHashMap;
    }

    public HashMap<String, DVD> getDVDHashMap() {
        return this.dvdHashMap;
    }
}
