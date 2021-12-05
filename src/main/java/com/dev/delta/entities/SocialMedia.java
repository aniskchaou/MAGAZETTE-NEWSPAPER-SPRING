package com.dev.delta.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SocialMedia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	String facebook;
	String twitter;
	String linkedIn;
	String googlePlus;
	String pinterest;
	String youTube;
	String instagram;
	String tumblr;
	String flickr;
	String reddit;
	String snapchat;
	String whatsApp;
	String quora;
	String stumbleUpon;
	String delicious;
	String digg;
	
	
	public Long getId() {
		return id;
	}


	public String getFacebook() {
		return facebook;
	}


	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}


	public String getTwitter() {
		return twitter;
	}


	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}


	public String getLinkedIn() {
		return linkedIn;
	}


	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}


	public String getGooglePlus() {
		return googlePlus;
	}


	public void setGooglePlus(String googlePlus) {
		this.googlePlus = googlePlus;
	}


	public String getPinterest() {
		return pinterest;
	}


	public void setPinterest(String pinterest) {
		this.pinterest = pinterest;
	}


	public String getYouTube() {
		return youTube;
	}


	public void setYouTube(String youTube) {
		this.youTube = youTube;
	}


	public String getInstagram() {
		return instagram;
	}


	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}


	public String getTumblr() {
		return tumblr;
	}


	public void setTumblr(String tumblr) {
		this.tumblr = tumblr;
	}


	public String getFlickr() {
		return flickr;
	}


	public void setFlickr(String flickr) {
		this.flickr = flickr;
	}


	public String getReddit() {
		return reddit;
	}


	public void setReddit(String reddit) {
		this.reddit = reddit;
	}


	public String getSnapchat() {
		return snapchat;
	}


	public void setSnapchat(String snapchat) {
		this.snapchat = snapchat;
	}


	public String getWhatsApp() {
		return whatsApp;
	}


	public void setWhatsApp(String whatsApp) {
		this.whatsApp = whatsApp;
	}


	public String getQuora() {
		return quora;
	}


	public void setQuora(String quora) {
		this.quora = quora;
	}


	public String getStumbleUpon() {
		return stumbleUpon;
	}


	public void setStumbleUpon(String stumbleUpon) {
		this.stumbleUpon = stumbleUpon;
	}


	public String getDelicious() {
		return delicious;
	}


	public void setDelicious(String delicious) {
		this.delicious = delicious;
	}


	public String getDigg() {
		return digg;
	}


	public void setDigg(String digg) {
		this.digg = digg;
	}


	public void setId(Long id) {
		this.id = id;
	}

	
	
}
