package com.project.healthservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AQIResponse {

	private AQIData data;

	@Getter
	@Setter
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class AQIData {
		private Current current;

		public Current getCurrent() {
			return current;
		}

		public void setCurrent(Current current) {
			this.current = current;
		}

	}

	@Getter
	@Setter
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Current {
		private Pollution pollution;

		public Pollution getPollution() {
			return pollution;
		}

		public void setPollution(Pollution pollution) {
			this.pollution = pollution;
		}

	}

	@Getter
	@Setter
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Pollution {
		private int aqius;

		public int getAqius() {
			return aqius;
		}

		public void setAqius(int aqius) {
			this.aqius = aqius;
		}

	}

	public AQIData getData() {
		return data;
	}

	public void setData(AQIData data) {
		this.data = data;
	}
	
}
