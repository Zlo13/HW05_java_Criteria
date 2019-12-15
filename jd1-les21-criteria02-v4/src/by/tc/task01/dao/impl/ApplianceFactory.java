package by.tc.task01.dao.impl;

import java.util.Map;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.SearchCriteria;

public class ApplianceFactory {
	static Appliance newAppliance(Map<String, String> parametres) {

		Appliance toReturn = null;
		String categoryOfGoods = parametres.get("NameGoods");

		switch (categoryOfGoods) {

		case "Laptop":
			toReturn = createLaptop(parametres);
			break;

		case "Oven":
			toReturn = createOven(parametres);
			break;

		case "Refrigerator":
			toReturn = createRefrigerator(parametres);
			break;

		case "Speakers":
			toReturn = createSpeakers(parametres);
			break;

		case "TabletPC":
			toReturn = createTabletPC(parametres);
			break;

		case "VacuumCleaner":
			toReturn = createVacuumCleaner(parametres);
			break;
		}
		return toReturn;
	}

	private static Laptop createLaptop(Map<String, String> parametres) {

		Laptop laptop;

		String categoryOfGoods = parametres.get("NameGoods");
		double batteryCapacity = Double.parseDouble(parametres.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString()));
		String os = parametres.get(SearchCriteria.Laptop.OS.toString());
		int memoryRom = Integer.parseInt(parametres.get(SearchCriteria.Laptop.MEMORY_ROM.toString()));
		int systemMemory = Integer.parseInt(parametres.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()));
		double cpu = Double.parseDouble(parametres.get(SearchCriteria.Laptop.CPU.toString()));
		int displayInchs = Integer.parseInt(parametres.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString()));

		laptop = new Laptop(categoryOfGoods, batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
		return laptop;
	}

	private static Oven createOven(Map<String, String> parametres) {

		Oven oven;

		String categoryOfGoods = parametres.get("NameGoods");
		int powerConsumption = Integer.parseInt(parametres.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString()));
		int weight = Integer.parseInt(parametres.get(SearchCriteria.Oven.WEIGHT.toString()));
		int capacity = Integer.parseInt(parametres.get(SearchCriteria.Oven.CAPACITY.toString()));
		int depth = Integer.parseInt(parametres.get(SearchCriteria.Oven.DEPTH.toString()));
		double height = Double.parseDouble(parametres.get(SearchCriteria.Oven.HEIGHT.toString()));
		double width = Double.parseDouble(parametres.get(SearchCriteria.Oven.WIDTH.toString()));

		oven = new Oven(categoryOfGoods, powerConsumption, weight, capacity, depth, height, width);

		return oven;
	}

	private static Refrigerator createRefrigerator(Map<String, String> parametres) {

		Refrigerator refrigerator;

		String categoryOfGoods = parametres.get("NameGoods");
		int powerConsumption = Integer
				.parseInt(parametres.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()));
		int weight = Integer.parseInt(parametres.get(SearchCriteria.Refrigerator.WEIGHT.toString()));
		int freezerCapacity = Integer.parseInt(parametres.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()));
		double overallCapacity = Double
				.parseDouble(parametres.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()));
		int height = Integer.parseInt(parametres.get(SearchCriteria.Refrigerator.HEIGHT.toString()));
		int width = Integer.parseInt(parametres.get(SearchCriteria.Refrigerator.WIDTH.toString()));

		refrigerator = new Refrigerator(categoryOfGoods, powerConsumption, weight, freezerCapacity, overallCapacity,
				height, width);

		return refrigerator;
	}

	private static Speakers createSpeakers(Map<String, String> parametres) {

		Speakers speakers;

		String categoryOfGoods = parametres.get("NameGoods");
		int powerConsumption = Integer.parseInt(parametres.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString()));
		int numberOfSpeakers = Integer.parseInt(parametres.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()));
		String frequencyRange = parametres.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString());
		int cordLength = Integer.parseInt(parametres.get(SearchCriteria.Speakers.CORD_LENGTH.toString()));

		speakers = new Speakers(categoryOfGoods, powerConsumption, numberOfSpeakers, frequencyRange, cordLength);

		return speakers;
	}

	private static TabletPC createTabletPC(Map<String, String> parametres) {

		TabletPC tabletPC;

		String categoryOfGoods = parametres.get("NameGoods");
		int batteryCapacity = Integer.parseInt(parametres.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()));
		int displayInches = Integer.parseInt(parametres.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()));
		int memoryRom = Integer.parseInt(parametres.get(SearchCriteria.TabletPC.MEMORY_ROM.toString()));
		int flashMemoryCapasity = Integer
				.parseInt(parametres.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()));
		String color = parametres.get(SearchCriteria.TabletPC.COLOR.toString());

		tabletPC = new TabletPC(categoryOfGoods, batteryCapacity, displayInches, memoryRom, flashMemoryCapasity, color);

		return tabletPC;
	}

	private static VacuumCleaner createVacuumCleaner(Map<String, String> parametres) {

		VacuumCleaner vacuumCleaner;

		String categoryOfGoods = parametres.get("NameGoods");
		int powerConsumption = Integer
				.parseInt(parametres.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString()));
		String filterType = parametres.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString());
		String bagType = parametres.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString());
		String wandType = parametres.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString());
		int motorSpeeadRegulation = Integer
				.parseInt(parametres.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString()));
		int cleaningWidth = Integer.parseInt(parametres.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString()));

		vacuumCleaner = new VacuumCleaner(categoryOfGoods, powerConsumption, filterType, bagType, wandType,
				motorSpeeadRegulation, cleaningWidth);

		return vacuumCleaner;
	}

}
