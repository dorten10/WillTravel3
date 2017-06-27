package com.example.dor.willtravel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Dor on 23/6/17.
 */

public class Country implements Parcelable {
    private String name;
    private String[] vaccines;
    public Country(String name,String[] vaccines){
        this.name=name;
        this.vaccines=vaccines;
    }

    protected Country(Parcel in) {
        name = in.readString();
        vaccines = in.createStringArray();
    }

    public static final Creator<Country> CREATOR = new Creator<Country>() {
        @Override
        public Country createFromParcel(Parcel in) {
            return new Country(in);
        }

        @Override
        public Country[] newArray(int size) {
            return new Country[size];
        }
    };

    public String[] getVaccines() {
        return vaccines;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeStringArray(vaccines);
    }
}
