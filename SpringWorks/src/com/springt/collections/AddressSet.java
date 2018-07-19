package com.springt.collections;

import java.util.Set;

public class AddressSet {
private Set<String> addresses;

@Override
public String toString() {
	return "AddressSet [addresses=" + addresses + "]";
}

public Set<String> getAddresses() {
	return addresses;
}

public void setAddresses(Set<String> addresses) {
	this.addresses = addresses;
}

public AddressSet() {
	super();
	// TODO Auto-generated constructor stub
}

}
