package com.spring.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	// HAS-A property (Composition)

	private LocalDateTime dateTime;

	public LocalDateTime getDateTime() {
		return dateTime;

	}

	// Setter method of setter Injection
	@Autowired
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String generateWishMessage(String user) {
		// get current hour of the day
		int hour = dateTime.getHour();
		// generate the wish message
		if (hour < 12)
			return "Good Morning " + user;
		else if (hour < 16)
			return "Good AfterNoon " + user;
		else if (hour < 20)
			return "Good Evening " + user;
		else {
			return "Good night " + user;
		}
	}

}
