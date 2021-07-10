package com.willowood.akshatrastogi.willowoodagri;

/**
 * Created by Akshat Rastogi on 20-05-2018.
 */
public class UserInformation {

    public String name;

    public String pincode;

    public String fathername;

    public String state;

    public String occupation;

    public String villageOrTown;

    public String postOffice;

    public String tehsil;

    public String district;

    public String contactNumber;

    public String landOwned;




    public UserInformation(){

    }

    public UserInformation(String name, String fathername, String state , String occupation ,String villageOrTown,
                           String postOffice, String tehsil, String district, String contactNumber, String landOwned, String pincode
                           ){
        this.name = name;

        this.pincode = pincode;

        this.fathername = fathername;

        this.state = state;

        this.occupation = occupation;

        this.villageOrTown = villageOrTown;

        this.postOffice = postOffice;

        this.tehsil = tehsil;

        this.district = district;

        this.contactNumber = contactNumber;

        this.landOwned = landOwned;

    }
}
