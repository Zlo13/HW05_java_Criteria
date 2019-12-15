package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) {

		List<Appliance> findAppliance = new ArrayList<Appliance>();

		String category;
		category = criteria.getGroupSearchName();

		Map<String, String> parametres;

		try {
			File file = new File("C:\\Workspace\\JD1\\jd1-les21-criteria02-v4\\resources\\appliances_db.txt");
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while (reader.ready()) {
				line = reader.readLine();
				String[] x = line.split(" : ");
				// System.out.println(x[0]);
				if (category.equalsIgnoreCase(x[0])) {
					parametres = fillParametres(x[0]);
					if (compareCriteria(parametres, criteria.getCriteria())) {
						findAppliance.add(ApplianceFactory.newAppliance(parametres));
					}
				}

			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		return null;
	}


	private Map<String, String> fillParametres(String data) {

		Map<String, String> fillParametres = new HashMap<String, String>();
		String[] param = data.split("\\s?[,:;]?\\s+");

		fillParametres.put("NameGoods", param[0]);

		for (int i = 1; i < param.length; i++) {
			fillParametres.put(param[i].split("=")[0], param[i].split("=")[1]);
		}
		return fillParametres;
	}

	@SuppressWarnings("unused")
	private boolean compareCriteria(Map<String, String> parametres, Map<String, String> criteria) {

		boolean isCopmare = true;
		Set<String> keys = criteria.keySet();
		for (String st : keys) {
			if (!criteria.get(st).equals(parametres.get(st))) {
				isCopmare = false;
			}
		}
		return isCopmare;
	}

}
