package org.ms.ratinginfoservice.models;

import java.util.List;

import org.ms.ratinginfoservice.resource.Rating;

public class UserRating {

	private List<Rating> ratings;

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
}
