package com.xworkz.spring4.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	
	@Autowired
	@Qualifier("friends")
	private String friends;
	@Autowired
	@Qualifier("reverse")
	private boolean reverseLeg;
	@Autowired
	private char nameStartFrom;
	@Autowired
	@Qualifier("block")
	private String color;
	@Autowired
	@Qualifier("ghosthouse")
	private boolean house;
	@Autowired
	@Qualifier("maneColor")
	private String houseColor;
	@Autowired
	@Qualifier("clean")
	private boolean neatness;
	@Autowired
	@Qualifier("phone")
	private boolean mobile;
	@Autowired
	@Qualifier("samaadhi")
	private String graveyard;
	@Autowired
	@Qualifier("howDead")
	private String reason;
	
	private String name;
	private String gender;
	private int height;
	private int hands;
	private int legs;
	private boolean fingers;
	private float nailLength;
	private String place;
	private LocalDate dateOfDeath;
	private int studiedTill;
	
	@Autowired
	public Ghost(@Qualifier("nobody")String name, Gender gender, int height, int hands, int legs,@Qualifier("fing") boolean fingers, float nailLength,
			@Qualifier("takeurown")String place, LocalDate dateOfDeath, int studiedTill) {
		super();
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.hands = hands;
		this.legs = legs;
		this.fingers = fingers;
		this.nailLength = nailLength;
		this.place = place;
		this.dateOfDeath = dateOfDeath;
		this.studiedTill = studiedTill;
	}

	@Override
	public String toString() {
		return "Ghost [friends=" + friends + ", reverseLeg=" + reverseLeg + ", nameStartFrom=" + nameStartFrom
				+ ", color=" + color + ", house=" + house + ", houseColor=" + houseColor + ", neatness=" + neatness
				+ ", mobile=" + mobile + ", graveyard=" + graveyard + ", reason=" + reason + ", name=" + name
				+ ", gender=" + gender + ", height=" + height + ", hands=" + hands + ", legs=" + legs + ", fingers="
				+ fingers + ", nailLength=" + nailLength + ", place=" + place + ", dateOfDeath=" + dateOfDeath
				+ ", studiedTill=" + studiedTill + "]";
	}

	public String getFriends() {
		return friends;
	}

	public boolean isReverseLeg() {
		return reverseLeg;
	}

	public char getNameStartFrom() {
		return nameStartFrom;
	}

	public String getColor() {
		return color;
	}

	public boolean isHouse() {
		return house;
	}

	public String getHouseColor() {
		return houseColor;
	}

	public boolean isNeatness() {
		return neatness;
	}

	public boolean isMobile() {
		return mobile;
	}

	public String getGraveyard() {
		return graveyard;
	}

	public String getReason() {
		return reason;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getHeight() {
		return height;
	}

	public int getHands() {
		return hands;
	}

	public int getLegs() {
		return legs;
	}

	public boolean isFingers() {
		return fingers;
	}

	public float getNailLength() {
		return nailLength;
	}

	public String getPlace() {
		return place;
	}

	public LocalDate getDateOfDeath() {
		return dateOfDeath;
	}

	public int getStudiedTill() {
		return studiedTill;
	}
	
	
	
	

}
