package com.natamus.naturallychargedcreepers.forge.events;

import com.natamus.naturallychargedcreepers.events.CreeperChargeEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeCreeperChargeEvent {
	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent e) {
		CreeperChargeEvent.onEntityJoin(e.getLevel(), e.getEntity());
	}
}
