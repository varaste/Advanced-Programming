package com.aut.hw3.question2;


import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class AddressBook {
    public HashMap<String, Contact> contactList ;

    protected Map<String, Integer> labelIndex = new HashMap<String, Integer>();

    public void setLabelIndex(Map<String, Integer> labelIndex) {
        this.labelIndex = labelIndex;
    }
}





