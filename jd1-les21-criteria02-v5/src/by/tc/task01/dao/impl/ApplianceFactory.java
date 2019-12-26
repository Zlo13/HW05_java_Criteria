package by.tc.task01.dao.impl;

import java.util.ArrayList;
import java.util.List;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class ApplianceFactory {

	public List<Appliance> create(List<String> strAppliancesData) {
		List<Appliance> results = new ArrayList<Appliance>();
		for (String data : strAppliancesData) {
			results.add(create(data));
		}
		return results;
	}

	private Appliance create(String data) {
		data = changeString(data);
		String[] applianceData = data.split(" ");
		switch (applianceData[0]) {
		case "Oven":
			return createOven(applianceData);
		case "Laptop":
			return createLaptop(applianceData);
		case "Refrigerator":
			return createRefrigerator(applianceData);
		case "VacuumCleaner":
			return createVacuumCleaner(applianceData);
		case "TabletPC":
			return createTabletPC(applianceData);
		case "Speakers":
			return createSpeakers(applianceData);
		}
		return null;
	}

	private String changeString(String data) {
		data = data.replaceAll("[a-zA-Z|_]*=", " ");
		data = data.replaceAll(":", " ,");
		data = data.replaceAll(",", " ");
		data = data.replaceAll(";", " ");
		data = data.replaceAll(" {2,}", " ");
		return data;
	}

	private Appliance createOven(String[] applianceData) {
		Appliance oven = null;
		oven = new Oven(Integer.parseInt(applianceData[1]), Integer.parseInt(applianceData[2]),
				Integer.parseInt(applianceData[3]), Integer.parseInt(applianceData[4]),
				Double.parseDouble(applianceData[5]), Double.parseDouble(applianceData[6]));
		return oven;
	}

	private Appliance createLaptop(String[] applianceData) {
		Appliance laptop = null;
		laptop = new Laptop(Double.parseDouble(applianceData[1]), applianceData[2], Integer.parseInt(applianceData[3]),
				Integer.parseInt(applianceData[4]), Double.parseDouble(applianceData[5]),
				Integer.parseInt(applianceData[6]));
		return laptop;
	}

	private Appliance createRefrigerator(String[] applianceData) {
		Appliance refrigerator = null;
		refrigerator = new Refrigerator(Integer.parseInt(applianceData[1]), Integer.parseInt(applianceData[2]),
				Integer.parseInt(applianceData[3]), Double.parseDouble(applianceData[4]),
				Integer.parseInt(applianceData[5]), Integer.parseInt(applianceData[6]));
		return refrigerator;
	}

	private Appliance createVacuumCleaner(String[] applianceData) {
		Appliance vacuumcleaner = null;
		vacuumcleaner = new VacuumCleaner(Integer.parseInt(applianceData[1]), applianceData[2], applianceData[3],
				applianceData[4], Integer.parseInt(applianceData[5]), Integer.parseInt(applianceData[6]));
		return vacuumcleaner;
	}

	private Appliance createTabletPC(String[] applianceData) {
		Appliance tabletPC = null;
		tabletPC = new TabletPC(Integer.parseInt(applianceData[1]), Integer.parseInt(applianceData[2]),
				Integer.parseInt(applianceData[3]), Integer.parseInt(applianceData[4]), applianceData[5]);
		return tabletPC;
	}

	private Appliance createSpeakers(String[] applianceData) {
		Appliance speakers = null;
		speakers = new Speakers(Integer.parseInt(applianceData[1]), Integer.parseInt(applianceData[2]),
				applianceData[3], Integer.parseInt(applianceData[4]));
		return speakers;
	}
}
