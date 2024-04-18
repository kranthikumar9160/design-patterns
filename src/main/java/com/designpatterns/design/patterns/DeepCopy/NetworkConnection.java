package com.designpatterns.design.patterns.DeepCopy;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
	private String ip;
	
	private String importantData;
	
	List<String> domains = new ArrayList();

	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getImportantData() {
		return importantData;
	}

	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	public void loadVeryImportantData() {
		this.importantData = "Very very important data";
		
		domains.add("www.google.com");
		domains.add("www.godaddy.com");
		domains.add("www.learncodewithdurgesh.com");
		domains.add("www.lcwd.com");
	}

	
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + domains + "]";
	}

	protected Object clone() throws CloneNotSupportedException{
		
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp(this.ip);
		networkConnection.setImportantData(this.importantData);
		
		for(String s: this.domains) {
			networkConnection.getDomains().add(s);
		}
		
		return networkConnection;
	}
}
