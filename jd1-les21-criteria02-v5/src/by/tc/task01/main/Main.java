package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.List;

import by.tc.task01.dao.impl.ApplianceDAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) throws ApplianceDAOException {

		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.CAPACITY.toString(), 32);
		appliances = service.find(criteriaOven);
		PrintApplianceInfo.print(appliances);
		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 45.5);
		criteriaOven.add(Oven.DEPTH.toString(), 60);

		appliances = service.find(criteriaOven);

		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

		appliances = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliances);

	}

}
