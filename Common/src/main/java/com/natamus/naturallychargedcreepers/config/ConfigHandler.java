package com.natamus.naturallychargedcreepers.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.naturallychargedcreepers.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double isChargedChance = 0.1;

	public static void initConfig() {
		configMetaData.put("isChargedChance", Arrays.asList(
			"The chance of a creeper being naturally charged."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}