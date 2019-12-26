package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	
		public static void print(List<Appliance> appliances) {
			
			if (appliances == null) {
				System.out.println("Исправьте данные");
			} else if (appliances.isEmpty()) {
				System.out.println("Совпадений не найдено");
			} else {
				for (Appliance appliance : appliances) {
					System.out.println(appliance.toString());
				}
			}
		}

}
