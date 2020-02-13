package com.slk.model1;

import java.io.InputStream;
import java.sql.Blob;

import org.springframework.stereotype.Repository;

@Repository
public class Admin {
	
	private int idnewjob;
	private String title;
	private String experience;
	private String skills;
	public int getIdnewjob() {
		return idnewjob;
	}
	public void setIdnewjob(int idnewjob) {
		this.idnewjob = idnewjob;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Admin [idnewjob=" + idnewjob + ", title=" + title + ", experience=" + experience + ", skills=" + skills
				+ ", getIdnewjob()=" + getIdnewjob() + ", getTitle()=" + getTitle() + ", getExperience()="
				+ getExperience() + ", getSkills()=" + getSkills() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	

}
