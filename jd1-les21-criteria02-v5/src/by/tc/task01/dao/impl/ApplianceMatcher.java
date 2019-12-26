package by.tc.task01.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import by.tc.task01.entity.criteria.Criteria;

public class ApplianceMatcher {

	public List<String> match(List<String> appliances, Criteria criteria) {
		List<String> results = new ArrayList<String>();
		List<String> requests = partMatchFormer(criteria);

		for (String applianceData : appliances) {
			if (isMatch(applianceData, requests)) {
				results.add(applianceData);
			}
		}
		return results;
	}

	private List<String> partMatchFormer(Criteria criteria) {
		Set<String> keys = criteria.getCriteria().keySet();
		List<String> keyForSearch = new ArrayList<>();
		for (String key : keys) {
			Object value = criteria.getCriteria().get(key);
			// key=value
			String string = key.toString() + "=" + value.toString();
			keyForSearch.add(string);
		}
		return keyForSearch;
	}

	private boolean isMatch(String applianceData, List<String> requests) {
		for (String request : requests) {
			if (!applianceData.contains(request)) {
				return false;
			}
		}
		return true;
	}

}
