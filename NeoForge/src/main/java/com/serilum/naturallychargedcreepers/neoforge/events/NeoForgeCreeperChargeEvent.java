package com.serilum.naturallychargedcreepers.neoforge.events;

import com.serilum.naturallychargedcreepers.events.CreeperChargeEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class NeoForgeCreeperChargeEvent {
	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent e) {
		CreeperChargeEvent.onEntityJoin(e.getLevel(), e.getEntity());
	}
}
